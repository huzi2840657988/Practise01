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
 	* A data access object (DAO) providing persistence and search support for Rewinder entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Rewinder
  * @author MyEclipse Persistence Tools 
 */

public class RewinderDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RewinderDAO.class);
		//property constants
	public static final String REWEXAMINE = "rewexamine";
	public static final String REWNOTE = "rewnote";
	public static final String SUPLYU = "suplyu";



    
    public void save(Rewinder transientInstance) {
        log.debug("saving Rewinder instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Rewinder persistentInstance) {
        log.debug("deleting Rewinder instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Rewinder findById( java.lang.Integer id) {
        log.debug("getting Rewinder instance with id: " + id);
        try {
            Rewinder instance = (Rewinder) getSession()
                    .get("com.fjsdfx.bean.Rewinder", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Rewinder instance) {
        log.debug("finding Rewinder instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Rewinder")
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
      log.debug("finding Rewinder instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Rewinder as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByRewexamine(Object rewexamine
	) {
		return findByProperty(REWEXAMINE, rewexamine
		);
	}
	
	public List findByRewnote(Object rewnote
	) {
		return findByProperty(REWNOTE, rewnote
		);
	}
	
	public List findBySuplyu(Object suplyu
	) {
		return findByProperty(SUPLYU, suplyu
		);
	}
	

	public List findAll() {
		log.debug("finding all Rewinder instances");
		try {
			String queryString = "from Rewinder";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Rewinder merge(Rewinder detachedInstance) {
        log.debug("merging Rewinder instance");
        try {
            Rewinder result = (Rewinder) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Rewinder instance) {
        log.debug("attaching dirty Rewinder instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Rewinder instance) {
        log.debug("attaching clean Rewinder instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}