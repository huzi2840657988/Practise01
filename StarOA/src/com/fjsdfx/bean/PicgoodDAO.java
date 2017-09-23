package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Picgood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Picgood
  * @author MyEclipse Persistence Tools 
 */

public class PicgoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(PicgoodDAO.class);
		//property constants
	public static final String CALUNIT = "calunit";
	public static final String FACTNUM = "factnum";
	public static final String REQNUM = "reqnum";
	public static final String RPRICE = "rprice";
	public static final String RUPRICE = "ruprice";
	public static final String USERF = "userf";



    
    public void save(Picgood transientInstance) {
        log.debug("saving Picgood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Picgood persistentInstance) {
        log.debug("deleting Picgood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Picgood findById( java.lang.Integer id) {
        log.debug("getting Picgood instance with id: " + id);
        try {
            Picgood instance = (Picgood) getSession()
                    .get("com.fjsdfx.bean.Picgood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Picgood instance) {
        log.debug("finding Picgood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Picgood")
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
      log.debug("finding Picgood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Picgood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByCalunit(Object calunit
	) {
		return findByProperty(CALUNIT, calunit
		);
	}
	
	public List findByFactnum(Object factnum
	) {
		return findByProperty(FACTNUM, factnum
		);
	}
	
	public List findByReqnum(Object reqnum
	) {
		return findByProperty(REQNUM, reqnum
		);
	}
	
	public List findByRprice(Object rprice
	) {
		return findByProperty(RPRICE, rprice
		);
	}
	
	public List findByRuprice(Object ruprice
	) {
		return findByProperty(RUPRICE, ruprice
		);
	}
	
	public List findByUserf(Object userf
	) {
		return findByProperty(USERF, userf
		);
	}
	

	public List findAll() {
		log.debug("finding all Picgood instances");
		try {
			String queryString = "from Picgood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Picgood merge(Picgood detachedInstance) {
        log.debug("merging Picgood instance");
        try {
            Picgood result = (Picgood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Picgood instance) {
        log.debug("attaching dirty Picgood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Picgood instance) {
        log.debug("attaching clean Picgood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}