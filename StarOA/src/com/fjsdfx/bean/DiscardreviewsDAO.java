package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Discardreviews entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Discardreviews
  * @author MyEclipse Persistence Tools 
 */

public class DiscardreviewsDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(DiscardreviewsDAO.class);
		//property constants
	public static final String INSPECTOR = "inspector";
	public static final String MANAGER = "manager";
	public static final String SCANOTE = "scanote";
	public static final String SCAS_ID = "scasId";
	public static final String ADVICE = "advice";
	public static final String FLAG = "flag";



    
    public void save(Discardreviews transientInstance) {
        log.debug("saving Discardreviews instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Discardreviews persistentInstance) {
        log.debug("deleting Discardreviews instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Discardreviews findById( java.lang.Integer id) {
        log.debug("getting Discardreviews instance with id: " + id);
        try {
            Discardreviews instance = (Discardreviews) getSession()
                    .get("com.fjsdfx.bean.Discardreviews", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Discardreviews instance) {
        log.debug("finding Discardreviews instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Discardreviews")
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
      log.debug("finding Discardreviews instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Discardreviews as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByInspector(Object inspector
	) {
		return findByProperty(INSPECTOR, inspector
		);
	}
	
	public List findByManager(Object manager
	) {
		return findByProperty(MANAGER, manager
		);
	}
	
	public List findByScanote(Object scanote
	) {
		return findByProperty(SCANOTE, scanote
		);
	}
	
	public List findByScasId(Object scasId
	) {
		return findByProperty(SCAS_ID, scasId
		);
	}
	
	public List findByAdvice(Object advice
	) {
		return findByProperty(ADVICE, advice
		);
	}
	
	public List findByFlag(Object flag
	) {
		return findByProperty(FLAG, flag
		);
	}
	

	public List findAll() {
		log.debug("finding all Discardreviews instances");
		try {
			String queryString = "from Discardreviews";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Discardreviews merge(Discardreviews detachedInstance) {
        log.debug("merging Discardreviews instance");
        try {
            Discardreviews result = (Discardreviews) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Discardreviews instance) {
        log.debug("attaching dirty Discardreviews instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Discardreviews instance) {
        log.debug("attaching clean Discardreviews instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}