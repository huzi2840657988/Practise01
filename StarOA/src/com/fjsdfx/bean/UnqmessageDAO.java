package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Unqmessage entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Unqmessage
  * @author MyEclipse Persistence Tools 
 */

public class UnqmessageDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(UnqmessageDAO.class);
		//property constants
	public static final String BDEPARTMENT = "bdepartment";
	public static final String UNMCODE = "unmcode";
	public static final String UNMSTATUS = "unmstatus";



    
    public void save(Unqmessage transientInstance) {
        log.debug("saving Unqmessage instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Unqmessage persistentInstance) {
        log.debug("deleting Unqmessage instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Unqmessage findById( java.lang.Integer id) {
        log.debug("getting Unqmessage instance with id: " + id);
        try {
            Unqmessage instance = (Unqmessage) getSession()
                    .get("com.fjsdfx.bean.Unqmessage", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Unqmessage instance) {
        log.debug("finding Unqmessage instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Unqmessage")
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
      log.debug("finding Unqmessage instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Unqmessage as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBdepartment(Object bdepartment
	) {
		return findByProperty(BDEPARTMENT, bdepartment
		);
	}
	
	public List findByUnmcode(Object unmcode
	) {
		return findByProperty(UNMCODE, unmcode
		);
	}
	
	public List findByUnmstatus(Object unmstatus
	) {
		return findByProperty(UNMSTATUS, unmstatus
		);
	}
	

	public List findAll() {
		log.debug("finding all Unqmessage instances");
		try {
			String queryString = "from Unqmessage";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Unqmessage merge(Unqmessage detachedInstance) {
        log.debug("merging Unqmessage instance");
        try {
            Unqmessage result = (Unqmessage) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Unqmessage instance) {
        log.debug("attaching dirty Unqmessage instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Unqmessage instance) {
        log.debug("attaching clean Unqmessage instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}