package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Menuimage entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Menuimage
  * @author MyEclipse Persistence Tools 
 */

public class MenuimageDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(MenuimageDAO.class);
		//property constants
	public static final String URL = "url";



    
    public void save(Menuimage transientInstance) {
        log.debug("saving Menuimage instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Menuimage persistentInstance) {
        log.debug("deleting Menuimage instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Menuimage findById( java.lang.Integer id) {
        log.debug("getting Menuimage instance with id: " + id);
        try {
            Menuimage instance = (Menuimage) getSession()
                    .get("com.fjsdfx.bean.Menuimage", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Menuimage instance) {
        log.debug("finding Menuimage instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Menuimage")
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
      log.debug("finding Menuimage instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Menuimage as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByUrl(Object url
	) {
		return findByProperty(URL, url
		);
	}
	

	public List findAll() {
		log.debug("finding all Menuimage instances");
		try {
			String queryString = "from Menuimage";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Menuimage merge(Menuimage detachedInstance) {
        log.debug("merging Menuimage instance");
        try {
            Menuimage result = (Menuimage) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Menuimage instance) {
        log.debug("attaching dirty Menuimage instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Menuimage instance) {
        log.debug("attaching clean Menuimage instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}