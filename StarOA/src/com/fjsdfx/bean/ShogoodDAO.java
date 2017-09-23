package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Shogood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Shogood
  * @author MyEclipse Persistence Tools 
 */

public class ShogoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ShogoodDAO.class);
		//property constants
	public static final String NOTE = "note";
	public static final String NUM = "num";
	public static final String PRICE = "price";
	public static final String UNIT = "unit";
	public static final String UPRICE = "uprice";
	public static final String USERF = "userf";



    
    public void save(Shogood transientInstance) {
        log.debug("saving Shogood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Shogood persistentInstance) {
        log.debug("deleting Shogood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Shogood findById( java.lang.Integer id) {
        log.debug("getting Shogood instance with id: " + id);
        try {
            Shogood instance = (Shogood) getSession()
                    .get("com.fjsdfx.bean.Shogood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Shogood instance) {
        log.debug("finding Shogood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Shogood")
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
      log.debug("finding Shogood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Shogood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByNote(Object note
	) {
		return findByProperty(NOTE, note
		);
	}
	
	public List findByNum(Object num
	) {
		return findByProperty(NUM, num
		);
	}
	
	public List findByPrice(Object price
	) {
		return findByProperty(PRICE, price
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
	
	public List findByUserf(Object userf
	) {
		return findByProperty(USERF, userf
		);
	}
	

	public List findAll() {
		log.debug("finding all Shogood instances");
		try {
			String queryString = "from Shogood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Shogood merge(Shogood detachedInstance) {
        log.debug("merging Shogood instance");
        try {
            Shogood result = (Shogood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Shogood instance) {
        log.debug("attaching dirty Shogood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Shogood instance) {
        log.debug("attaching clean Shogood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}