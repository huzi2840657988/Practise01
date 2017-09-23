package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Resgood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Resgood
  * @author MyEclipse Persistence Tools 
 */

public class ResgoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ResgoodDAO.class);
		//property constants
	public static final String PAYMENT = "payment";
	public static final String REQNUM = "reqnum";
	public static final String UNUM = "unum";
	public static final String UPRICE = "uprice";



    
    public void save(Resgood transientInstance) {
        log.debug("saving Resgood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Resgood persistentInstance) {
        log.debug("deleting Resgood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Resgood findById( java.lang.Integer id) {
        log.debug("getting Resgood instance with id: " + id);
        try {
            Resgood instance = (Resgood) getSession()
                    .get("com.fjsdfx.bean.Resgood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Resgood instance) {
        log.debug("finding Resgood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Resgood")
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
      log.debug("finding Resgood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Resgood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPayment(Object payment
	) {
		return findByProperty(PAYMENT, payment
		);
	}
	
	public List findByReqnum(Object reqnum
	) {
		return findByProperty(REQNUM, reqnum
		);
	}
	
	public List findByUnum(Object unum
	) {
		return findByProperty(UNUM, unum
		);
	}
	
	public List findByUprice(Object uprice
	) {
		return findByProperty(UPRICE, uprice
		);
	}
	

	public List findAll() {
		log.debug("finding all Resgood instances");
		try {
			String queryString = "from Resgood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Resgood merge(Resgood detachedInstance) {
        log.debug("merging Resgood instance");
        try {
            Resgood result = (Resgood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Resgood instance) {
        log.debug("attaching dirty Resgood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Resgood instance) {
        log.debug("attaching clean Resgood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}