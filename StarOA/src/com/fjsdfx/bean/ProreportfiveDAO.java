package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Proreportfive entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Proreportfive
  * @author MyEclipse Persistence Tools 
 */

public class ProreportfiveDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ProreportfiveDAO.class);
		//property constants
	public static final String FIQUA = "fiqua";
	public static final String FIUNQ = "fiunq";
	public static final String INSPTIME = "insptime";
	public static final String PASSRATE = "passrate";
	public static final String PRONUM = "pronum";
	public static final String UNQNUM = "unqnum";



    
    public void save(Proreportfive transientInstance) {
        log.debug("saving Proreportfive instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Proreportfive persistentInstance) {
        log.debug("deleting Proreportfive instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Proreportfive findById( java.lang.Integer id) {
        log.debug("getting Proreportfive instance with id: " + id);
        try {
            Proreportfive instance = (Proreportfive) getSession()
                    .get("com.fjsdfx.bean.Proreportfive", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Proreportfive instance) {
        log.debug("finding Proreportfive instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Proreportfive")
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
      log.debug("finding Proreportfive instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Proreportfive as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByFiqua(Object fiqua
	) {
		return findByProperty(FIQUA, fiqua
		);
	}
	
	public List findByFiunq(Object fiunq
	) {
		return findByProperty(FIUNQ, fiunq
		);
	}
	
	public List findByInsptime(Object insptime
	) {
		return findByProperty(INSPTIME, insptime
		);
	}
	
	public List findByPassrate(Object passrate
	) {
		return findByProperty(PASSRATE, passrate
		);
	}
	
	public List findByPronum(Object pronum
	) {
		return findByProperty(PRONUM, pronum
		);
	}
	
	public List findByUnqnum(Object unqnum
	) {
		return findByProperty(UNQNUM, unqnum
		);
	}
	

	public List findAll() {
		log.debug("finding all Proreportfive instances");
		try {
			String queryString = "from Proreportfive";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Proreportfive merge(Proreportfive detachedInstance) {
        log.debug("merging Proreportfive instance");
        try {
            Proreportfive result = (Proreportfive) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Proreportfive instance) {
        log.debug("attaching dirty Proreportfive instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Proreportfive instance) {
        log.debug("attaching clean Proreportfive instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}