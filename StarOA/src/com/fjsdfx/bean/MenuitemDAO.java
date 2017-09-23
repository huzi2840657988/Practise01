package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Menuitem entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Menuitem
  * @author MyEclipse Persistence Tools 
 */

public class MenuitemDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(MenuitemDAO.class);
		//property constants
	public static final String CONTENT = "content";



    
    public void save(Menuitem transientInstance) {
        log.debug("saving Menuitem instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Menuitem persistentInstance) {
        log.debug("deleting Menuitem instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Menuitem findById( java.lang.Integer id) {
        log.debug("getting Menuitem instance with id: " + id);
        try {
            Menuitem instance = (Menuitem) getSession()
                    .get("com.fjsdfx.bean.Menuitem", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Menuitem instance) {
        log.debug("finding Menuitem instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Menuitem")
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
      log.debug("finding Menuitem instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Menuitem as model where model." 
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
		log.debug("finding all Menuitem instances");
		try {
			String queryString = "from Menuitem";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Menuitem merge(Menuitem detachedInstance) {
        log.debug("merging Menuitem instance");
        try {
            Menuitem result = (Menuitem) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Menuitem instance) {
        log.debug("attaching dirty Menuitem instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Menuitem instance) {
        log.debug("attaching clean Menuitem instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}