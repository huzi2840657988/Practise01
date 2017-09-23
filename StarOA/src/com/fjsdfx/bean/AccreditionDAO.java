package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Accredition entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Accredition
  * @author MyEclipse Persistence Tools 
 */

public class AccreditionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(AccreditionDAO.class);
		//property constants
	public static final String CONTENT = "content";



    
    public void save(Accredition transientInstance) {
        log.debug("saving Accredition instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Accredition persistentInstance) {
        log.debug("deleting Accredition instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Accredition findById( java.lang.Integer id) {
        log.debug("getting Accredition instance with id: " + id);
        try {
            Accredition instance = (Accredition) getSession()
                    .get("com.fjsdfx.bean.Accredition", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Accredition instance) {
        log.debug("finding Accredition instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Accredition")
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
      log.debug("finding Accredition instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Accredition as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByContent(Object content
	) {
		return findByProperty(CONTENT, content
		);
	}
	

	public List findAll() {
		log.debug("finding all Accredition instances");
		try {
			String queryString = "from Accredition";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Accredition merge(Accredition detachedInstance) {
        log.debug("merging Accredition instance");
        try {
            Accredition result = (Accredition) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Accredition instance) {
        log.debug("attaching dirty Accredition instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Accredition instance) {
        log.debug("attaching clean Accredition instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}