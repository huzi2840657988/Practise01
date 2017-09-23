package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for ProSup entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.ProSup
  * @author MyEclipse Persistence Tools 
 */

public class ProSupDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ProSupDAO.class);
		//property constants



    
    public void save(ProSup transientInstance) {
        log.debug("saving ProSup instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(ProSup persistentInstance) {
        log.debug("deleting ProSup instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public ProSup findById( java.lang.Integer id) {
        log.debug("getting ProSup instance with id: " + id);
        try {
            ProSup instance = (ProSup) getSession()
                    .get("com.fjsdfx.bean.ProSup", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(ProSup instance) {
        log.debug("finding ProSup instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.ProSup")
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
      log.debug("finding ProSup instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from ProSup as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all ProSup instances");
		try {
			String queryString = "from ProSup";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public ProSup merge(ProSup detachedInstance) {
        log.debug("merging ProSup instance");
        try {
            ProSup result = (ProSup) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(ProSup instance) {
        log.debug("attaching dirty ProSup instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(ProSup instance) {
        log.debug("attaching clean ProSup instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}