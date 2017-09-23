package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Resource entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Resource
  * @author MyEclipse Persistence Tools 
 */

public class ResourceDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ResourceDAO.class);
		//property constants
	public static final String MENU_CODE = "menuCode";
	public static final String NAME = "name";
	public static final String TYPE = "type";
	public static final String VALUE = "value";



    
    public void save(Resource transientInstance) {
        log.debug("saving Resource instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Resource persistentInstance) {
        log.debug("deleting Resource instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Resource findById( java.lang.Integer id) {
        log.debug("getting Resource instance with id: " + id);
        try {
            Resource instance = (Resource) getSession()
                    .get("com.fjsdfx.bean.Resource", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Resource instance) {
        log.debug("finding Resource instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Resource")
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
      log.debug("finding Resource instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Resource as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByMenuCode(Object menuCode
	) {
		return findByProperty(MENU_CODE, menuCode
		);
	}
	
	public List findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List findByType(Object type
	) {
		return findByProperty(TYPE, type
		);
	}
	
	public List findByValue(Object value
	) {
		return findByProperty(VALUE, value
		);
	}
	

	public List findAll() {
		log.debug("finding all Resource instances");
		try {
			String queryString = "from Resource";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Resource merge(Resource detachedInstance) {
        log.debug("merging Resource instance");
        try {
            Resource result = (Resource) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Resource instance) {
        log.debug("attaching dirty Resource instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Resource instance) {
        log.debug("attaching clean Resource instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}