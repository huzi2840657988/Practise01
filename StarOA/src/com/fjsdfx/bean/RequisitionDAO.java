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
 	* A data access object (DAO) providing persistence and search support for Requisition entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Requisition
  * @author MyEclipse Persistence Tools 
 */

public class RequisitionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RequisitionDAO.class);
		//property constants
	public static final String COMPANY = "company";
	public static final String DPTMANAGER = "dptmanager";



    
    public void save(Requisition transientInstance) {
        log.debug("saving Requisition instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Requisition persistentInstance) {
        log.debug("deleting Requisition instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Requisition findById( java.lang.Integer id) {
        log.debug("getting Requisition instance with id: " + id);
        try {
            Requisition instance = (Requisition) getSession()
                    .get("com.fjsdfx.bean.Requisition", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Requisition instance) {
        log.debug("finding Requisition instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Requisition")
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
      log.debug("finding Requisition instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Requisition as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByCompany(Object company
	) {
		return findByProperty(COMPANY, company
		);
	}
	
	public List findByDptmanager(Object dptmanager
	) {
		return findByProperty(DPTMANAGER, dptmanager
		);
	}
	

	public List findAll() {
		log.debug("finding all Requisition instances");
		try {
			String queryString = "from Requisition";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Requisition merge(Requisition detachedInstance) {
        log.debug("merging Requisition instance");
        try {
            Requisition result = (Requisition) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Requisition instance) {
        log.debug("attaching dirty Requisition instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Requisition instance) {
        log.debug("attaching clean Requisition instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}