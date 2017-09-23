package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Samidentified entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Samidentified
  * @author MyEclipse Persistence Tools 
 */

public class SamidentifiedDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(SamidentifiedDAO.class);
		//property constants
	public static final String BRAND = "brand";
	public static final String CONCLUSION = "conclusion";
	public static final String ENTEST = "entest";
	public static final String MCODENAME = "mcodename";
	public static final String NEWITEM = "newitem";
	public static final String NEWSUP = "newsup";
	public static final String NUM = "num";
	public static final String OPINION = "opinion";
	public static final String REDCOST = "redcost";
	public static final String REQTIME = "reqtime";
	public static final String TECHCHANGE = "techchange";
	public static final String UPRICE = "uprice";



    
    public void save(Samidentified transientInstance) {
        log.debug("saving Samidentified instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Samidentified persistentInstance) {
        log.debug("deleting Samidentified instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Samidentified findById( java.lang.Integer id) {
        log.debug("getting Samidentified instance with id: " + id);
        try {
            Samidentified instance = (Samidentified) getSession()
                    .get("com.fjsdfx.bean.Samidentified", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Samidentified instance) {
        log.debug("finding Samidentified instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Samidentified")
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
      log.debug("finding Samidentified instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Samidentified as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBrand(Object brand
	) {
		return findByProperty(BRAND, brand
		);
	}
	
	public List findByConclusion(Object conclusion
	) {
		return findByProperty(CONCLUSION, conclusion
		);
	}
	
	public List findByEntest(Object entest
	) {
		return findByProperty(ENTEST, entest
		);
	}
	
	public List findByMcodename(Object mcodename
	) {
		return findByProperty(MCODENAME, mcodename
		);
	}
	
	public List findByNewitem(Object newitem
	) {
		return findByProperty(NEWITEM, newitem
		);
	}
	
	public List findByNewsup(Object newsup
	) {
		return findByProperty(NEWSUP, newsup
		);
	}
	
	public List findByNum(Object num
	) {
		return findByProperty(NUM, num
		);
	}
	
	public List findByOpinion(Object opinion
	) {
		return findByProperty(OPINION, opinion
		);
	}
	
	public List findByRedcost(Object redcost
	) {
		return findByProperty(REDCOST, redcost
		);
	}
	
	public List findByReqtime(Object reqtime
	) {
		return findByProperty(REQTIME, reqtime
		);
	}
	
	public List findByTechchange(Object techchange
	) {
		return findByProperty(TECHCHANGE, techchange
		);
	}
	
	public List findByUprice(Object uprice
	) {
		return findByProperty(UPRICE, uprice
		);
	}
	

	public List findAll() {
		log.debug("finding all Samidentified instances");
		try {
			String queryString = "from Samidentified";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Samidentified merge(Samidentified detachedInstance) {
        log.debug("merging Samidentified instance");
        try {
            Samidentified result = (Samidentified) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Samidentified instance) {
        log.debug("attaching dirty Samidentified instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Samidentified instance) {
        log.debug("attaching clean Samidentified instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}