package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Discardverify entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Discardverify
  * @author MyEclipse Persistence Tools 
 */

public class DiscardverifyDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(DiscardverifyDAO.class);
		//property constants
	public static final String RDPT = "rdpt";
	public static final String DISCARDREVIEWS_SCAS_ID = "discardreviewsScasId";



    
    public void save(Discardverify transientInstance) {
        log.debug("saving Discardverify instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Discardverify persistentInstance) {
        log.debug("deleting Discardverify instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Discardverify findById( java.lang.Integer id) {
        log.debug("getting Discardverify instance with id: " + id);
        try {
            Discardverify instance = (Discardverify) getSession()
                    .get("com.fjsdfx.bean.Discardverify", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Discardverify instance) {
        log.debug("finding Discardverify instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Discardverify")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Discardverify instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Discardverify as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByRdpt(Object rdpt
	) {
		return findByProperty(RDPT, rdpt
		);
	}
	
	public List findByDiscardreviewsScasId(Object discardreviewsScasId
	) {
		return findByProperty(DISCARDREVIEWS_SCAS_ID, discardreviewsScasId
		);
	}
	

	public List findAll() {
		log.debug("finding all Discardverify instances");
		try {
			String queryString = "from Discardverify";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Discardverify merge(Discardverify detachedInstance) {
        log.debug("merging Discardverify instance");
        try {
            Discardverify result = (Discardverify) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Discardverify instance) {
        log.debug("attaching dirty Discardverify instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Discardverify instance) {
        log.debug("attaching clean Discardverify instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}