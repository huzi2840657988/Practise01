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
 	* A data access object (DAO) providing persistence and search support for Quaprolist entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Quaprolist
  * @author MyEclipse Persistence Tools 
 */

public class QuaprolistDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(QuaprolistDAO.class);
		//property constants
	public static final String QUAPROLIST_ASSLEVEL = "quaprolistAsslevel";
	public static final String BRAND = "brand";
	public static final String NOTE = "note";



    
    public void save(Quaprolist transientInstance) {
        log.debug("saving Quaprolist instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Quaprolist persistentInstance) {
        log.debug("deleting Quaprolist instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Quaprolist findById( java.lang.Integer id) {
        log.debug("getting Quaprolist instance with id: " + id);
        try {
            Quaprolist instance = (Quaprolist) getSession()
                    .get("com.fjsdfx.bean.Quaprolist", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Quaprolist instance) {
        log.debug("finding Quaprolist instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Quaprolist")
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
      log.debug("finding Quaprolist instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Quaprolist as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByQuaprolistAsslevel(Object quaprolistAsslevel
	) {
		return findByProperty(QUAPROLIST_ASSLEVEL, quaprolistAsslevel
		);
	}
	
	public List findByBrand(Object brand
	) {
		return findByProperty(BRAND, brand
		);
	}
	
	public List findByNote(Object note
	) {
		return findByProperty(NOTE, note
		);
	}
	

	public List findAll() {
		log.debug("finding all Quaprolist instances");
		try {
			String queryString = "from Quaprolist";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Quaprolist merge(Quaprolist detachedInstance) {
        log.debug("merging Quaprolist instance");
        try {
            Quaprolist result = (Quaprolist) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Quaprolist instance) {
        log.debug("attaching dirty Quaprolist instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Quaprolist instance) {
        log.debug("attaching clean Quaprolist instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}