package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Retgood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Retgood
  * @author MyEclipse Persistence Tools 
 */

public class RetgoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RetgoodDAO.class);
		//property constants
	public static final String RETNO = "retno";



    
    public void save(Retgood transientInstance) {
        log.debug("saving Retgood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Retgood persistentInstance) {
        log.debug("deleting Retgood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Retgood findById( java.lang.Integer id) {
        log.debug("getting Retgood instance with id: " + id);
        try {
            Retgood instance = (Retgood) getSession()
                    .get("com.fjsdfx.bean.Retgood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Retgood instance) {
        log.debug("finding Retgood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Retgood")
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
      log.debug("finding Retgood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Retgood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByRetno(Object retno
	) {
		return findByProperty(RETNO, retno
		);
	}
	

	public List findAll() {
		log.debug("finding all Retgood instances");
		try {
			String queryString = "from Retgood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Retgood merge(Retgood detachedInstance) {
        log.debug("merging Retgood instance");
        try {
            Retgood result = (Retgood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Retgood instance) {
        log.debug("attaching dirty Retgood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Retgood instance) {
        log.debug("attaching clean Retgood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}