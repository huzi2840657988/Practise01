package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Purgood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Purgood
  * @author MyEclipse Persistence Tools 
 */

public class PurgoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(PurgoodDAO.class);
		//property constants
	public static final String NOTE = "note";
	public static final String NUM = "num";
	public static final String UNIT = "unit";
	public static final String UPRICE = "uprice";



    
    public void save(Purgood transientInstance) {
        log.debug("saving Purgood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Purgood persistentInstance) {
        log.debug("deleting Purgood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Purgood findById( java.lang.Integer id) {
        log.debug("getting Purgood instance with id: " + id);
        try {
            Purgood instance = (Purgood) getSession()
                    .get("com.fjsdfx.bean.Purgood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Purgood instance) {
        log.debug("finding Purgood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Purgood")
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
      log.debug("finding Purgood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Purgood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByNote(Object note
	) {
		return findByProperty(NOTE, note
		);
	}
	
	public List findByNum(Object num
	) {
		return findByProperty(NUM, num
		);
	}
	
	public List findByUnit(Object unit
	) {
		return findByProperty(UNIT, unit
		);
	}
	
	public List findByUprice(Object uprice
	) {
		return findByProperty(UPRICE, uprice
		);
	}
	

	public List findAll() {
		log.debug("finding all Purgood instances");
		try {
			String queryString = "from Purgood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Purgood merge(Purgood detachedInstance) {
        log.debug("merging Purgood instance");
        try {
            Purgood result = (Purgood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Purgood instance) {
        log.debug("attaching dirty Purgood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Purgood instance) {
        log.debug("attaching clean Purgood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}