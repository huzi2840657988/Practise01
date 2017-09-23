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
 	* A data access object (DAO) providing persistence and search support for Shortm entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Shortm
  * @author MyEclipse Persistence Tools 
 */

public class ShortmDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ShortmDAO.class);
		//property constants
	public static final String APPROVE = "approve";
	public static final String SHO_CHECK = "shoCheck";
	public static final String SHOID = "shoid";
	public static final String STATE = "state";



    
    public void save(Shortm transientInstance) {
        log.debug("saving Shortm instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Shortm persistentInstance) {
        log.debug("deleting Shortm instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Shortm findById( java.lang.Integer id) {
        log.debug("getting Shortm instance with id: " + id);
        try {
            Shortm instance = (Shortm) getSession()
                    .get("com.fjsdfx.bean.Shortm", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Shortm instance) {
        log.debug("finding Shortm instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Shortm")
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
      log.debug("finding Shortm instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Shortm as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByApprove(Object approve
	) {
		return findByProperty(APPROVE, approve
		);
	}
	
	public List findByShoCheck(Object shoCheck
	) {
		return findByProperty(SHO_CHECK, shoCheck
		);
	}
	
	public List findByShoid(Object shoid
	) {
		return findByProperty(SHOID, shoid
		);
	}
	
	public List findByState(Object state
	) {
		return findByProperty(STATE, state
		);
	}
	

	public List findAll() {
		log.debug("finding all Shortm instances");
		try {
			String queryString = "from Shortm";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Shortm merge(Shortm detachedInstance) {
        log.debug("merging Shortm instance");
        try {
            Shortm result = (Shortm) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Shortm instance) {
        log.debug("attaching dirty Shortm instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Shortm instance) {
        log.debug("attaching clean Shortm instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}