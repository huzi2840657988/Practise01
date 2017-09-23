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
 	* A data access object (DAO) providing persistence and search support for Feedexamine entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Feedexamine
  * @author MyEclipse Persistence Tools 
 */

public class FeedexamineDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(FeedexamineDAO.class);
		//property constants
	public static final String CONFIRM = "confirm";
	public static final String ESTATUS = "estatus";
	public static final String FEESTYLE = "feestyle";
	public static final String FROMT = "fromt";
	public static final String ORDERNO = "orderno";



    
    public void save(Feedexamine transientInstance) {
        log.debug("saving Feedexamine instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Feedexamine persistentInstance) {
        log.debug("deleting Feedexamine instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Feedexamine findById( java.lang.Integer id) {
        log.debug("getting Feedexamine instance with id: " + id);
        try {
            Feedexamine instance = (Feedexamine) getSession()
                    .get("com.fjsdfx.bean.Feedexamine", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Feedexamine instance) {
        log.debug("finding Feedexamine instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Feedexamine")
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
      log.debug("finding Feedexamine instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Feedexamine as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByConfirm(Object confirm
	) {
		return findByProperty(CONFIRM, confirm
		);
	}
	
	public List findByEstatus(Object estatus
	) {
		return findByProperty(ESTATUS, estatus
		);
	}
	
	public List findByFeestyle(Object feestyle
	) {
		return findByProperty(FEESTYLE, feestyle
		);
	}
	
	public List findByFromt(Object fromt
	) {
		return findByProperty(FROMT, fromt
		);
	}
	
	public List findByOrderno(Object orderno
	) {
		return findByProperty(ORDERNO, orderno
		);
	}
	

	public List findAll() {
		log.debug("finding all Feedexamine instances");
		try {
			String queryString = "from Feedexamine";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Feedexamine merge(Feedexamine detachedInstance) {
        log.debug("merging Feedexamine instance");
        try {
            Feedexamine result = (Feedexamine) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Feedexamine instance) {
        log.debug("attaching dirty Feedexamine instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Feedexamine instance) {
        log.debug("attaching clean Feedexamine instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}