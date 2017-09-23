package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Trackingtest entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Trackingtest
  * @author MyEclipse Persistence Tools 
 */

public class TrackingtestDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TrackingtestDAO.class);
		//property constants
	public static final String EXAMINERESULT = "examineresult";
	public static final String ITEMPSN = "itempsn";
	public static final String PROEXASITUDATION = "proexasitudation";
	public static final String PROPSN = "propsn";
	public static final String PROQUASITUDATION = "proquasitudation";
	public static final String PRORECORD = "prorecord";
	public static final String PSNCONTENT = "psncontent";
	public static final String QUALITY_SITUATION = "qualitySituation";
	public static final String TRYADVICE = "tryadvice";
	public static final String TRYPSN = "trypsn";



    
    public void save(Trackingtest transientInstance) {
        log.debug("saving Trackingtest instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Trackingtest persistentInstance) {
        log.debug("deleting Trackingtest instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Trackingtest findById( java.lang.Integer id) {
        log.debug("getting Trackingtest instance with id: " + id);
        try {
            Trackingtest instance = (Trackingtest) getSession()
                    .get("com.fjsdfx.bean.Trackingtest", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Trackingtest instance) {
        log.debug("finding Trackingtest instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Trackingtest")
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
      log.debug("finding Trackingtest instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Trackingtest as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByExamineresult(Object examineresult
	) {
		return findByProperty(EXAMINERESULT, examineresult
		);
	}
	
	public List findByItempsn(Object itempsn
	) {
		return findByProperty(ITEMPSN, itempsn
		);
	}
	
	public List findByProexasitudation(Object proexasitudation
	) {
		return findByProperty(PROEXASITUDATION, proexasitudation
		);
	}
	
	public List findByPropsn(Object propsn
	) {
		return findByProperty(PROPSN, propsn
		);
	}
	
	public List findByProquasitudation(Object proquasitudation
	) {
		return findByProperty(PROQUASITUDATION, proquasitudation
		);
	}
	
	public List findByProrecord(Object prorecord
	) {
		return findByProperty(PRORECORD, prorecord
		);
	}
	
	public List findByPsncontent(Object psncontent
	) {
		return findByProperty(PSNCONTENT, psncontent
		);
	}
	
	public List findByQualitySituation(Object qualitySituation
	) {
		return findByProperty(QUALITY_SITUATION, qualitySituation
		);
	}
	
	public List findByTryadvice(Object tryadvice
	) {
		return findByProperty(TRYADVICE, tryadvice
		);
	}
	
	public List findByTrypsn(Object trypsn
	) {
		return findByProperty(TRYPSN, trypsn
		);
	}
	

	public List findAll() {
		log.debug("finding all Trackingtest instances");
		try {
			String queryString = "from Trackingtest";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Trackingtest merge(Trackingtest detachedInstance) {
        log.debug("merging Trackingtest instance");
        try {
            Trackingtest result = (Trackingtest) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Trackingtest instance) {
        log.debug("attaching dirty Trackingtest instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Trackingtest instance) {
        log.debug("attaching clean Trackingtest instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}