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
 	* A data access object (DAO) providing persistence and search support for Discardreviewt entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Discardreviewt
  * @author MyEclipse Persistence Tools 
 */

public class DiscardreviewtDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(DiscardreviewtDAO.class);
		//property constants
	public static final String ADVICE = "advice";
	public static final String SCANOTE = "scanote";



    
    public void save(Discardreviewt transientInstance) {
        log.debug("saving Discardreviewt instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Discardreviewt persistentInstance) {
        log.debug("deleting Discardreviewt instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Discardreviewt findById( java.lang.Integer id) {
        log.debug("getting Discardreviewt instance with id: " + id);
        try {
            Discardreviewt instance = (Discardreviewt) getSession()
                    .get("com.fjsdfx.bean.Discardreviewt", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Discardreviewt instance) {
        log.debug("finding Discardreviewt instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Discardreviewt")
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
      log.debug("finding Discardreviewt instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Discardreviewt as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByAdvice(Object advice
	) {
		return findByProperty(ADVICE, advice
		);
	}
	
	public List findByScanote(Object scanote
	) {
		return findByProperty(SCANOTE, scanote
		);
	}
	

	public List findAll() {
		log.debug("finding all Discardreviewt instances");
		try {
			String queryString = "from Discardreviewt";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Discardreviewt merge(Discardreviewt detachedInstance) {
        log.debug("merging Discardreviewt instance");
        try {
            Discardreviewt result = (Discardreviewt) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Discardreviewt instance) {
        log.debug("attaching dirty Discardreviewt instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Discardreviewt instance) {
        log.debug("attaching clean Discardreviewt instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}