package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Returned entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Returned
  * @author MyEclipse Persistence Tools 
 */

public class ReturnedDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ReturnedDAO.class);
		//property constants
	public static final String CUSTOMERN = "customern";
	public static final String FORWARD = "forward";
	public static final String QUALITYADVICE = "qualityadvice";
	public static final String QUALITYNOTE = "qualitynote";
	public static final String RETNOTE = "retnote";
	public static final String SN = "sn";
	public static final String WHRECEIVE = "whreceive";
	public static final String BUHEGE = "buhege";
	public static final String DEALS = "deals";
	public static final String UNQUALIFY_ID = "unqualifyId";



    
    public void save(Returned transientInstance) {
        log.debug("saving Returned instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Returned persistentInstance) {
        log.debug("deleting Returned instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Returned findById( java.lang.Integer id) {
        log.debug("getting Returned instance with id: " + id);
        try {
            Returned instance = (Returned) getSession()
                    .get("com.fjsdfx.bean.Returned", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Returned instance) {
        log.debug("finding Returned instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Returned")
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
      log.debug("finding Returned instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Returned as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByCustomern(Object customern
	) {
		return findByProperty(CUSTOMERN, customern
		);
	}
	
	public List findByForward(Object forward
	) {
		return findByProperty(FORWARD, forward
		);
	}
	
	public List findByQualityadvice(Object qualityadvice
	) {
		return findByProperty(QUALITYADVICE, qualityadvice
		);
	}
	
	public List findByQualitynote(Object qualitynote
	) {
		return findByProperty(QUALITYNOTE, qualitynote
		);
	}
	
	public List findByRetnote(Object retnote
	) {
		return findByProperty(RETNOTE, retnote
		);
	}
	
	public List findBySn(Object sn
	) {
		return findByProperty(SN, sn
		);
	}
	
	public List findByWhreceive(Object whreceive
	) {
		return findByProperty(WHRECEIVE, whreceive
		);
	}
	
	public List findByBuhege(Object buhege
	) {
		return findByProperty(BUHEGE, buhege
		);
	}
	
	public List findByDeals(Object deals
	) {
		return findByProperty(DEALS, deals
		);
	}
	
	public List findByUnqualifyId(Object unqualifyId
	) {
		return findByProperty(UNQUALIFY_ID, unqualifyId
		);
	}
	

	public List findAll() {
		log.debug("finding all Returned instances");
		try {
			String queryString = "from Returned";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Returned merge(Returned detachedInstance) {
        log.debug("merging Returned instance");
        try {
            Returned result = (Returned) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Returned instance) {
        log.debug("attaching dirty Returned instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Returned instance) {
        log.debug("attaching clean Returned instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}