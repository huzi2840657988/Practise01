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
 	* A data access object (DAO) providing persistence and search support for Supsendm entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Supsendm
  * @author MyEclipse Persistence Tools 
 */

public class SupsendmDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(SupsendmDAO.class);
		//property constants
	public static final String BATCH = "batch";
	public static final String BONDEDPRO = "bondedpro";
	public static final String FEEDING = "feeding";
	public static final String PARTNO = "partno";



    
    public void save(Supsendm transientInstance) {
        log.debug("saving Supsendm instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Supsendm persistentInstance) {
        log.debug("deleting Supsendm instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Supsendm findById( java.lang.Integer id) {
        log.debug("getting Supsendm instance with id: " + id);
        try {
            Supsendm instance = (Supsendm) getSession()
                    .get("com.fjsdfx.bean.Supsendm", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Supsendm instance) {
        log.debug("finding Supsendm instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Supsendm")
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
      log.debug("finding Supsendm instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Supsendm as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBatch(Object batch
	) {
		return findByProperty(BATCH, batch
		);
	}
	
	public List findByBondedpro(Object bondedpro
	) {
		return findByProperty(BONDEDPRO, bondedpro
		);
	}
	
	public List findByFeeding(Object feeding
	) {
		return findByProperty(FEEDING, feeding
		);
	}
	
	public List findByPartno(Object partno
	) {
		return findByProperty(PARTNO, partno
		);
	}
	

	public List findAll() {
		log.debug("finding all Supsendm instances");
		try {
			String queryString = "from Supsendm";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Supsendm merge(Supsendm detachedInstance) {
        log.debug("merging Supsendm instance");
        try {
            Supsendm result = (Supsendm) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Supsendm instance) {
        log.debug("attaching dirty Supsendm instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Supsendm instance) {
        log.debug("attaching clean Supsendm instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}