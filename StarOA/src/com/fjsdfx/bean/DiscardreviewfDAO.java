package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Discardreviewf entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Discardreviewf
  * @author MyEclipse Persistence Tools 
 */

public class DiscardreviewfDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(DiscardreviewfDAO.class);
		//property constants
	public static final String ADVICE = "advice";
	public static final String SCANOTE = "scanote";



    
    public void save(Discardreviewf transientInstance) {
        log.debug("saving Discardreviewf instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Discardreviewf persistentInstance) {
        log.debug("deleting Discardreviewf instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Discardreviewf findById( java.lang.Integer id) {
        log.debug("getting Discardreviewf instance with id: " + id);
        try {
            Discardreviewf instance = (Discardreviewf) getSession()
                    .get("com.fjsdfx.bean.Discardreviewf", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Discardreviewf instance) {
        log.debug("finding Discardreviewf instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Discardreviewf")
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
      log.debug("finding Discardreviewf instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Discardreviewf as model where model." 
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
		log.debug("finding all Discardreviewf instances");
		try {
			String queryString = "from Discardreviewf";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Discardreviewf merge(Discardreviewf detachedInstance) {
        log.debug("merging Discardreviewf instance");
        try {
            Discardreviewf result = (Discardreviewf) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Discardreviewf instance) {
        log.debug("attaching dirty Discardreviewf instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Discardreviewf instance) {
        log.debug("attaching clean Discardreviewf instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}