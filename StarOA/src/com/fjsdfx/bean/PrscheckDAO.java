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
 	* A data access object (DAO) providing persistence and search support for Prscheck entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Prscheck
  * @author MyEclipse Persistence Tools 
 */

public class PrscheckDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(PrscheckDAO.class);
		//property constants
	public static final String PSN = "psn";



    
    public void save(Prscheck transientInstance) {
        log.debug("saving Prscheck instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Prscheck persistentInstance) {
        log.debug("deleting Prscheck instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Prscheck findById( java.lang.Integer id) {
        log.debug("getting Prscheck instance with id: " + id);
        try {
            Prscheck instance = (Prscheck) getSession()
                    .get("com.fjsdfx.bean.Prscheck", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Prscheck instance) {
        log.debug("finding Prscheck instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Prscheck")
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
      log.debug("finding Prscheck instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Prscheck as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPsn(Object psn
	) {
		return findByProperty(PSN, psn
		);
	}
	

	public List findAll() {
		log.debug("finding all Prscheck instances");
		try {
			String queryString = "from Prscheck";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Prscheck merge(Prscheck detachedInstance) {
        log.debug("merging Prscheck instance");
        try {
            Prscheck result = (Prscheck) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Prscheck instance) {
        log.debug("attaching dirty Prscheck instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Prscheck instance) {
        log.debug("attaching clean Prscheck instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}