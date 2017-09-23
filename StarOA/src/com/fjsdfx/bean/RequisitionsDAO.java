package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Requisitions entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Requisitions
  * @author MyEclipse Persistence Tools 
 */

public class RequisitionsDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RequisitionsDAO.class);
		//property constants
	public static final String DIRECTIONS = "directions";
	public static final String ENTER = "enter";



    
    public void save(Requisitions transientInstance) {
        log.debug("saving Requisitions instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Requisitions persistentInstance) {
        log.debug("deleting Requisitions instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Requisitions findById( java.lang.Integer id) {
        log.debug("getting Requisitions instance with id: " + id);
        try {
            Requisitions instance = (Requisitions) getSession()
                    .get("com.fjsdfx.bean.Requisitions", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Requisitions instance) {
        log.debug("finding Requisitions instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Requisitions")
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
      log.debug("finding Requisitions instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Requisitions as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByDirections(Object directions
	) {
		return findByProperty(DIRECTIONS, directions
		);
	}
	
	public List findByEnter(Object enter
	) {
		return findByProperty(ENTER, enter
		);
	}
	

	public List findAll() {
		log.debug("finding all Requisitions instances");
		try {
			String queryString = "from Requisitions";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Requisitions merge(Requisitions detachedInstance) {
        log.debug("merging Requisitions instance");
        try {
            Requisitions result = (Requisitions) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Requisitions instance) {
        log.debug("attaching dirty Requisitions instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Requisitions instance) {
        log.debug("attaching clean Requisitions instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}