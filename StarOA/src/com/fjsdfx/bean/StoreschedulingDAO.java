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
 	* A data access object (DAO) providing persistence and search support for Storescheduling entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Storescheduling
  * @author MyEclipse Persistence Tools 
 */

public class StoreschedulingDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(StoreschedulingDAO.class);
		//property constants
	public static final String STONUM = "stonum";
	public static final String STORSN = "storsn";



    
    public void save(Storescheduling transientInstance) {
        log.debug("saving Storescheduling instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Storescheduling persistentInstance) {
        log.debug("deleting Storescheduling instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Storescheduling findById( java.lang.Integer id) {
        log.debug("getting Storescheduling instance with id: " + id);
        try {
            Storescheduling instance = (Storescheduling) getSession()
                    .get("com.fjsdfx.bean.Storescheduling", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Storescheduling instance) {
        log.debug("finding Storescheduling instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Storescheduling")
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
      log.debug("finding Storescheduling instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Storescheduling as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByStonum(Object stonum
	) {
		return findByProperty(STONUM, stonum
		);
	}
	
	public List findByStorsn(Object storsn
	) {
		return findByProperty(STORSN, storsn
		);
	}
	

	public List findAll() {
		log.debug("finding all Storescheduling instances");
		try {
			String queryString = "from Storescheduling";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Storescheduling merge(Storescheduling detachedInstance) {
        log.debug("merging Storescheduling instance");
        try {
            Storescheduling result = (Storescheduling) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Storescheduling instance) {
        log.debug("attaching dirty Storescheduling instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Storescheduling instance) {
        log.debug("attaching clean Storescheduling instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}