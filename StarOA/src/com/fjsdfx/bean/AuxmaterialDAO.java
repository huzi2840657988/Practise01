package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Auxmaterial entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Auxmaterial
  * @author MyEclipse Persistence Tools 
 */

public class AuxmaterialDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(AuxmaterialDAO.class);
		//property constants
	public static final String EWHNUM = "ewhnum";
	public static final String NUM = "num";
	public static final String OWHNUM = "owhnum";
	public static final String UNIT = "unit";
	public static final String UPRICE = "uprice";



    
    public void save(Auxmaterial transientInstance) {
        log.debug("saving Auxmaterial instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Auxmaterial persistentInstance) {
        log.debug("deleting Auxmaterial instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Auxmaterial findById( java.lang.Integer id) {
        log.debug("getting Auxmaterial instance with id: " + id);
        try {
            Auxmaterial instance = (Auxmaterial) getSession()
                    .get("com.fjsdfx.bean.Auxmaterial", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Auxmaterial instance) {
        log.debug("finding Auxmaterial instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Auxmaterial")
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
      log.debug("finding Auxmaterial instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Auxmaterial as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByEwhnum(Object ewhnum
	) {
		return findByProperty(EWHNUM, ewhnum
		);
	}
	
	public List findByNum(Object num
	) {
		return findByProperty(NUM, num
		);
	}
	
	public List findByOwhnum(Object owhnum
	) {
		return findByProperty(OWHNUM, owhnum
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
		log.debug("finding all Auxmaterial instances");
		try {
			String queryString = "from Auxmaterial";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Auxmaterial merge(Auxmaterial detachedInstance) {
        log.debug("merging Auxmaterial instance");
        try {
            Auxmaterial result = (Auxmaterial) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Auxmaterial instance) {
        log.debug("attaching dirty Auxmaterial instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Auxmaterial instance) {
        log.debug("attaching clean Auxmaterial instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}