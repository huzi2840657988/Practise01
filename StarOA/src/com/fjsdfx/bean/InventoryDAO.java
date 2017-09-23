package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Inventory entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Inventory
  * @author MyEclipse Persistence Tools 
 */

public class InventoryDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(InventoryDAO.class);
		//property constants
	public static final String SOLATIONNUM = "solationnum";
	public static final String STOCKNUM = "stocknum";
	public static final String TOTALNUM = "totalnum";
	public static final String WSSTOCK = "wsstock";



    
    public void save(Inventory transientInstance) {
        log.debug("saving Inventory instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Inventory persistentInstance) {
        log.debug("deleting Inventory instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Inventory findById( java.lang.Integer id) {
        log.debug("getting Inventory instance with id: " + id);
        try {
            Inventory instance = (Inventory) getSession()
                    .get("com.fjsdfx.bean.Inventory", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Inventory instance) {
        log.debug("finding Inventory instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Inventory")
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
      log.debug("finding Inventory instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Inventory as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findBySolationnum(Object solationnum
	) {
		return findByProperty(SOLATIONNUM, solationnum
		);
	}
	
	public List findByStocknum(Object stocknum
	) {
		return findByProperty(STOCKNUM, stocknum
		);
	}
	
	public List findByTotalnum(Object totalnum
	) {
		return findByProperty(TOTALNUM, totalnum
		);
	}
	
	public List findByWsstock(Object wsstock
	) {
		return findByProperty(WSSTOCK, wsstock
		);
	}
	

	public List findAll() {
		log.debug("finding all Inventory instances");
		try {
			String queryString = "from Inventory";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Inventory merge(Inventory detachedInstance) {
        log.debug("merging Inventory instance");
        try {
            Inventory result = (Inventory) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Inventory instance) {
        log.debug("attaching dirty Inventory instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Inventory instance) {
        log.debug("attaching clean Inventory instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}