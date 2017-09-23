package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Shi2good entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Shi2good
  * @author MyEclipse Persistence Tools 
 */

public class Shi2goodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Shi2goodDAO.class);
		//property constants
	public static final String ORDERID = "orderid";
	public static final String SHI2NO = "shi2no";
	public static final String SHI2NO2 = "shi2no2";
	public static final String SHI2NOTE = "shi2note";



    
    public void save(Shi2good transientInstance) {
        log.debug("saving Shi2good instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Shi2good persistentInstance) {
        log.debug("deleting Shi2good instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Shi2good findById( java.lang.Integer id) {
        log.debug("getting Shi2good instance with id: " + id);
        try {
            Shi2good instance = (Shi2good) getSession()
                    .get("com.fjsdfx.bean.Shi2good", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Shi2good instance) {
        log.debug("finding Shi2good instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Shi2good")
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
      log.debug("finding Shi2good instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Shi2good as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByOrderid(Object orderid
	) {
		return findByProperty(ORDERID, orderid
		);
	}
	
	public List findByShi2no(Object shi2no
	) {
		return findByProperty(SHI2NO, shi2no
		);
	}
	
	public List findByShi2no2(Object shi2no2
	) {
		return findByProperty(SHI2NO2, shi2no2
		);
	}
	
	public List findByShi2note(Object shi2note
	) {
		return findByProperty(SHI2NOTE, shi2note
		);
	}
	

	public List findAll() {
		log.debug("finding all Shi2good instances");
		try {
			String queryString = "from Shi2good";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Shi2good merge(Shi2good detachedInstance) {
        log.debug("merging Shi2good instance");
        try {
            Shi2good result = (Shi2good) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Shi2good instance) {
        log.debug("attaching dirty Shi2good instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Shi2good instance) {
        log.debug("attaching clean Shi2good instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}