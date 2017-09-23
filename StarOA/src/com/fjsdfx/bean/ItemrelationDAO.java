package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Itemrelation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Itemrelation
  * @author MyEclipse Persistence Tools 
 */

public class ItemrelationDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ItemrelationDAO.class);
		//property constants
	public static final String PARTAMOUNT = "partamount";
	public static final String CONTROLLERUNIT_INFO = "controllerunitInfo";
	public static final String IS_CON = "isCon";



    
    public void save(Itemrelation transientInstance) {
        log.debug("saving Itemrelation instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Itemrelation persistentInstance) {
        log.debug("deleting Itemrelation instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Itemrelation findById( java.lang.Integer id) {
        log.debug("getting Itemrelation instance with id: " + id);
        try {
            Itemrelation instance = (Itemrelation) getSession()
                    .get("com.fjsdfx.bean.Itemrelation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Itemrelation instance) {
        log.debug("finding Itemrelation instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Itemrelation")
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
      log.debug("finding Itemrelation instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Itemrelation as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPartamount(Object partamount
	) {
		return findByProperty(PARTAMOUNT, partamount
		);
	}
	
	public List findByControllerunitInfo(Object controllerunitInfo
	) {
		return findByProperty(CONTROLLERUNIT_INFO, controllerunitInfo
		);
	}
	
	public List findByIsCon(Object isCon
	) {
		return findByProperty(IS_CON, isCon
		);
	}
	

	public List findAll() {
		log.debug("finding all Itemrelation instances");
		try {
			String queryString = "from Itemrelation";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Itemrelation merge(Itemrelation detachedInstance) {
        log.debug("merging Itemrelation instance");
        try {
            Itemrelation result = (Itemrelation) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Itemrelation instance) {
        log.debug("attaching dirty Itemrelation instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Itemrelation instance) {
        log.debug("attaching clean Itemrelation instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}