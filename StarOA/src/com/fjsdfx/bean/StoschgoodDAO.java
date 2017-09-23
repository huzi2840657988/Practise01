package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Stoschgood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Stoschgood
  * @author MyEclipse Persistence Tools 
 */

public class StoschgoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(StoschgoodDAO.class);
		//property constants
	public static final String QUALITYNUM = "qualitynum";
	public static final String STONUM = "stonum";



    
    public void save(Stoschgood transientInstance) {
        log.debug("saving Stoschgood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Stoschgood persistentInstance) {
        log.debug("deleting Stoschgood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Stoschgood findById( java.lang.Integer id) {
        log.debug("getting Stoschgood instance with id: " + id);
        try {
            Stoschgood instance = (Stoschgood) getSession()
                    .get("com.fjsdfx.bean.Stoschgood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Stoschgood instance) {
        log.debug("finding Stoschgood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Stoschgood")
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
      log.debug("finding Stoschgood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Stoschgood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByQualitynum(Object qualitynum
	) {
		return findByProperty(QUALITYNUM, qualitynum
		);
	}
	
	public List findByStonum(Object stonum
	) {
		return findByProperty(STONUM, stonum
		);
	}
	

	public List findAll() {
		log.debug("finding all Stoschgood instances");
		try {
			String queryString = "from Stoschgood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Stoschgood merge(Stoschgood detachedInstance) {
        log.debug("merging Stoschgood instance");
        try {
            Stoschgood result = (Stoschgood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Stoschgood instance) {
        log.debug("attaching dirty Stoschgood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Stoschgood instance) {
        log.debug("attaching clean Stoschgood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}