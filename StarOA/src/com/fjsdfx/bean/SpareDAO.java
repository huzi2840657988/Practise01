package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Spare entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Spare
  * @author MyEclipse Persistence Tools 
 */

public class SpareDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(SpareDAO.class);
		//property constants
	public static final String NUM = "num";
	public static final String UNIT = "unit";
	public static final String UPRICE = "uprice";



    
    public void save(Spare transientInstance) {
        log.debug("saving Spare instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Spare persistentInstance) {
        log.debug("deleting Spare instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Spare findById( java.lang.Integer id) {
        log.debug("getting Spare instance with id: " + id);
        try {
            Spare instance = (Spare) getSession()
                    .get("com.fjsdfx.bean.Spare", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Spare instance) {
        log.debug("finding Spare instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Spare")
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
      log.debug("finding Spare instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Spare as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByNum(Object num
	) {
		return findByProperty(NUM, num
		);
	}
	
	public List findByUnit(Object unit
	) {
		return findByProperty(UNIT, unit
		);
	}
	
	public List findByUprice(Object uprice
	) {
		return findByProperty(UPRICE, uprice
		);
	}
	

	public List findAll() {
		log.debug("finding all Spare instances");
		try {
			String queryString = "from Spare";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Spare merge(Spare detachedInstance) {
        log.debug("merging Spare instance");
        try {
            Spare result = (Spare) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Spare instance) {
        log.debug("attaching dirty Spare instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Spare instance) {
        log.debug("attaching clean Spare instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}