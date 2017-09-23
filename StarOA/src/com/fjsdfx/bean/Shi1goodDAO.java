package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Shi1good entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Shi1good
  * @author MyEclipse Persistence Tools 
 */

public class Shi1goodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Shi1goodDAO.class);
		//property constants
	public static final String SHI1NO = "shi1no";
	public static final String SHI1UNIT = "shi1unit";
	public static final String SHINOTE = "shinote";
	public static final String SHITIME = "shitime";
	public static final String TAS = "tas";
	public static final String TAX = "tax";



    
    public void save(Shi1good transientInstance) {
        log.debug("saving Shi1good instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Shi1good persistentInstance) {
        log.debug("deleting Shi1good instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Shi1good findById( java.lang.Integer id) {
        log.debug("getting Shi1good instance with id: " + id);
        try {
            Shi1good instance = (Shi1good) getSession()
                    .get("com.fjsdfx.bean.Shi1good", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Shi1good instance) {
        log.debug("finding Shi1good instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Shi1good")
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
      log.debug("finding Shi1good instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Shi1good as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByShi1no(Object shi1no
	) {
		return findByProperty(SHI1NO, shi1no
		);
	}
	
	public List findByShi1unit(Object shi1unit
	) {
		return findByProperty(SHI1UNIT, shi1unit
		);
	}
	
	public List findByShinote(Object shinote
	) {
		return findByProperty(SHINOTE, shinote
		);
	}
	
	public List findByShitime(Object shitime
	) {
		return findByProperty(SHITIME, shitime
		);
	}
	
	public List findByTas(Object tas
	) {
		return findByProperty(TAS, tas
		);
	}
	
	public List findByTax(Object tax
	) {
		return findByProperty(TAX, tax
		);
	}
	

	public List findAll() {
		log.debug("finding all Shi1good instances");
		try {
			String queryString = "from Shi1good";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Shi1good merge(Shi1good detachedInstance) {
        log.debug("merging Shi1good instance");
        try {
            Shi1good result = (Shi1good) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Shi1good instance) {
        log.debug("attaching dirty Shi1good instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Shi1good instance) {
        log.debug("attaching clean Shi1good instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}