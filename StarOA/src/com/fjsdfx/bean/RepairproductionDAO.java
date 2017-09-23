package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Repairproduction entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Repairproduction
  * @author MyEclipse Persistence Tools 
 */

public class RepairproductionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RepairproductionDAO.class);
		//property constants
	public static final String ITEM_TYPE_NAME = "itemTypeName";
	public static final String PNO = "pno";
	public static final String REPSTATUS = "repstatus";



    
    public void save(Repairproduction transientInstance) {
        log.debug("saving Repairproduction instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Repairproduction persistentInstance) {
        log.debug("deleting Repairproduction instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Repairproduction findById( java.lang.Integer id) {
        log.debug("getting Repairproduction instance with id: " + id);
        try {
            Repairproduction instance = (Repairproduction) getSession()
                    .get("com.fjsdfx.bean.Repairproduction", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Repairproduction instance) {
        log.debug("finding Repairproduction instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Repairproduction")
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
      log.debug("finding Repairproduction instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Repairproduction as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByItemTypeName(Object itemTypeName
	) {
		return findByProperty(ITEM_TYPE_NAME, itemTypeName
		);
	}
	
	public List findByPno(Object pno
	) {
		return findByProperty(PNO, pno
		);
	}
	
	public List findByRepstatus(Object repstatus
	) {
		return findByProperty(REPSTATUS, repstatus
		);
	}
	

	public List findAll() {
		log.debug("finding all Repairproduction instances");
		try {
			String queryString = "from Repairproduction";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Repairproduction merge(Repairproduction detachedInstance) {
        log.debug("merging Repairproduction instance");
        try {
            Repairproduction result = (Repairproduction) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Repairproduction instance) {
        log.debug("attaching dirty Repairproduction instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Repairproduction instance) {
        log.debug("attaching clean Repairproduction instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}