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
 	* A data access object (DAO) providing persistence and search support for Yplanname entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Yplanname
  * @author MyEclipse Persistence Tools 
 */

public class YplannameDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(YplannameDAO.class);
		//property constants
	public static final String IS_USER = "isUser";
	public static final String PLANNAME = "planname";



    
    public void save(Yplanname transientInstance) {
        log.debug("saving Yplanname instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Yplanname persistentInstance) {
        log.debug("deleting Yplanname instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Yplanname findById( java.lang.Integer id) {
        log.debug("getting Yplanname instance with id: " + id);
        try {
            Yplanname instance = (Yplanname) getSession()
                    .get("com.fjsdfx.bean.Yplanname", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Yplanname instance) {
        log.debug("finding Yplanname instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Yplanname")
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
      log.debug("finding Yplanname instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Yplanname as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByIsUser(Object isUser
	) {
		return findByProperty(IS_USER, isUser
		);
	}
	
	public List findByPlanname(Object planname
	) {
		return findByProperty(PLANNAME, planname
		);
	}
	

	public List findAll() {
		log.debug("finding all Yplanname instances");
		try {
			String queryString = "from Yplanname";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Yplanname merge(Yplanname detachedInstance) {
        log.debug("merging Yplanname instance");
        try {
            Yplanname result = (Yplanname) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Yplanname instance) {
        log.debug("attaching dirty Yplanname instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Yplanname instance) {
        log.debug("attaching clean Yplanname instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}