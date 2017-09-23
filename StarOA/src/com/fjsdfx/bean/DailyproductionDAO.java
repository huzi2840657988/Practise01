package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Dailyproduction entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Dailyproduction
  * @author MyEclipse Persistence Tools 
 */

public class DailyproductionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(DailyproductionDAO.class);
		//property constants
	public static final String FEED_DAILY = "feedDaily";
	public static final String FEED_MONTH = "feedMonth";
	public static final String FEED_YEAR = "feedYear";
	public static final String PLAN_COMPLETE = "planComplete";
	public static final String PLAN_DAILY = "planDaily";
	public static final String RATE_DAILY = "rateDaily";
	public static final String STORE_DAILY = "storeDaily";
	public static final String STORE_MONTH = "storeMonth";
	public static final String STORE_YEAR = "storeYear";



    
    public void save(Dailyproduction transientInstance) {
        log.debug("saving Dailyproduction instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Dailyproduction persistentInstance) {
        log.debug("deleting Dailyproduction instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Dailyproduction findById( java.lang.Integer id) {
        log.debug("getting Dailyproduction instance with id: " + id);
        try {
            Dailyproduction instance = (Dailyproduction) getSession()
                    .get("com.fjsdfx.bean.Dailyproduction", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Dailyproduction instance) {
        log.debug("finding Dailyproduction instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Dailyproduction")
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
      log.debug("finding Dailyproduction instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Dailyproduction as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByFeedDaily(Object feedDaily
	) {
		return findByProperty(FEED_DAILY, feedDaily
		);
	}
	
	public List findByFeedMonth(Object feedMonth
	) {
		return findByProperty(FEED_MONTH, feedMonth
		);
	}
	
	public List findByFeedYear(Object feedYear
	) {
		return findByProperty(FEED_YEAR, feedYear
		);
	}
	
	public List findByPlanComplete(Object planComplete
	) {
		return findByProperty(PLAN_COMPLETE, planComplete
		);
	}
	
	public List findByPlanDaily(Object planDaily
	) {
		return findByProperty(PLAN_DAILY, planDaily
		);
	}
	
	public List findByRateDaily(Object rateDaily
	) {
		return findByProperty(RATE_DAILY, rateDaily
		);
	}
	
	public List findByStoreDaily(Object storeDaily
	) {
		return findByProperty(STORE_DAILY, storeDaily
		);
	}
	
	public List findByStoreMonth(Object storeMonth
	) {
		return findByProperty(STORE_MONTH, storeMonth
		);
	}
	
	public List findByStoreYear(Object storeYear
	) {
		return findByProperty(STORE_YEAR, storeYear
		);
	}
	

	public List findAll() {
		log.debug("finding all Dailyproduction instances");
		try {
			String queryString = "from Dailyproduction";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Dailyproduction merge(Dailyproduction detachedInstance) {
        log.debug("merging Dailyproduction instance");
        try {
            Dailyproduction result = (Dailyproduction) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Dailyproduction instance) {
        log.debug("attaching dirty Dailyproduction instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Dailyproduction instance) {
        log.debug("attaching clean Dailyproduction instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}