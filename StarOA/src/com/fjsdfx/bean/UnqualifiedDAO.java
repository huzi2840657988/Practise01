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
 	* A data access object (DAO) providing persistence and search support for Unqualified entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Unqualified
  * @author MyEclipse Persistence Tools 
 */

public class UnqualifiedDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(UnqualifiedDAO.class);
		//property constants
	public static final String INSPECTOR = "inspector";
	public static final String NUM = "num";
	public static final String REBPER = "rebper";
	public static final String RECPER = "recper";
	public static final String REPORTPER = "reportper";
	public static final String REVIEW = "review";



    
    public void save(Unqualified transientInstance) {
        log.debug("saving Unqualified instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Unqualified persistentInstance) {
        log.debug("deleting Unqualified instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Unqualified findById( java.lang.Integer id) {
        log.debug("getting Unqualified instance with id: " + id);
        try {
            Unqualified instance = (Unqualified) getSession()
                    .get("com.fjsdfx.bean.Unqualified", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Unqualified instance) {
        log.debug("finding Unqualified instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Unqualified")
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
      log.debug("finding Unqualified instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Unqualified as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByInspector(Object inspector
	) {
		return findByProperty(INSPECTOR, inspector
		);
	}
	
	public List findByNum(Object num
	) {
		return findByProperty(NUM, num
		);
	}
	
	public List findByRebper(Object rebper
	) {
		return findByProperty(REBPER, rebper
		);
	}
	
	public List findByRecper(Object recper
	) {
		return findByProperty(RECPER, recper
		);
	}
	
	public List findByReportper(Object reportper
	) {
		return findByProperty(REPORTPER, reportper
		);
	}
	
	public List findByReview(Object review
	) {
		return findByProperty(REVIEW, review
		);
	}
	

	public List findAll() {
		log.debug("finding all Unqualified instances");
		try {
			String queryString = "from Unqualified";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Unqualified merge(Unqualified detachedInstance) {
        log.debug("merging Unqualified instance");
        try {
            Unqualified result = (Unqualified) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Unqualified instance) {
        log.debug("attaching dirty Unqualified instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Unqualified instance) {
        log.debug("attaching clean Unqualified instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}