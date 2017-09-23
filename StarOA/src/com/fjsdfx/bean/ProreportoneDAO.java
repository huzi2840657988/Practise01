package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Proreportone entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Proreportone
  * @author MyEclipse Persistence Tools 
 */

public class ProreportoneDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ProreportoneDAO.class);
		//property constants
	public static final String FAILURECON = "failurecon";
	public static final String FAILURERATE = "failurerate";
	public static final String PRONUM = "pronum";
	public static final String UNQNUM = "unqnum";



    
    public void save(Proreportone transientInstance) {
        log.debug("saving Proreportone instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Proreportone persistentInstance) {
        log.debug("deleting Proreportone instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Proreportone findById( java.lang.Integer id) {
        log.debug("getting Proreportone instance with id: " + id);
        try {
            Proreportone instance = (Proreportone) getSession()
                    .get("com.fjsdfx.bean.Proreportone", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Proreportone instance) {
        log.debug("finding Proreportone instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Proreportone")
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
      log.debug("finding Proreportone instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Proreportone as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByFailurecon(Object failurecon
	) {
		return findByProperty(FAILURECON, failurecon
		);
	}
	
	public List findByFailurerate(Object failurerate
	) {
		return findByProperty(FAILURERATE, failurerate
		);
	}
	
	public List findByPronum(Object pronum
	) {
		return findByProperty(PRONUM, pronum
		);
	}
	
	public List findByUnqnum(Object unqnum
	) {
		return findByProperty(UNQNUM, unqnum
		);
	}
	

	public List findAll() {
		log.debug("finding all Proreportone instances");
		try {
			String queryString = "from Proreportone";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Proreportone merge(Proreportone detachedInstance) {
        log.debug("merging Proreportone instance");
        try {
            Proreportone result = (Proreportone) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Proreportone instance) {
        log.debug("attaching dirty Proreportone instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Proreportone instance) {
        log.debug("attaching clean Proreportone instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}