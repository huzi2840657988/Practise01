package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Qualityanalysis entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Qualityanalysis
  * @author MyEclipse Persistence Tools 
 */

public class QualityanalysisDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(QualityanalysisDAO.class);
		//property constants
	public static final String ANALYSIS = "analysis";
	public static final String MAINFAULT = "mainfault";
	public static final String MEASURES = "measures";
	public static final String RNUM = "rnum";
	public static final String SNUM = "snum";



    
    public void save(Qualityanalysis transientInstance) {
        log.debug("saving Qualityanalysis instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Qualityanalysis persistentInstance) {
        log.debug("deleting Qualityanalysis instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Qualityanalysis findById( java.lang.Integer id) {
        log.debug("getting Qualityanalysis instance with id: " + id);
        try {
            Qualityanalysis instance = (Qualityanalysis) getSession()
                    .get("com.fjsdfx.bean.Qualityanalysis", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Qualityanalysis instance) {
        log.debug("finding Qualityanalysis instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Qualityanalysis")
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
      log.debug("finding Qualityanalysis instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Qualityanalysis as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByAnalysis(Object analysis
	) {
		return findByProperty(ANALYSIS, analysis
		);
	}
	
	public List findByMainfault(Object mainfault
	) {
		return findByProperty(MAINFAULT, mainfault
		);
	}
	
	public List findByMeasures(Object measures
	) {
		return findByProperty(MEASURES, measures
		);
	}
	
	public List findByRnum(Object rnum
	) {
		return findByProperty(RNUM, rnum
		);
	}
	
	public List findBySnum(Object snum
	) {
		return findByProperty(SNUM, snum
		);
	}
	

	public List findAll() {
		log.debug("finding all Qualityanalysis instances");
		try {
			String queryString = "from Qualityanalysis";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Qualityanalysis merge(Qualityanalysis detachedInstance) {
        log.debug("merging Qualityanalysis instance");
        try {
            Qualityanalysis result = (Qualityanalysis) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Qualityanalysis instance) {
        log.debug("attaching dirty Qualityanalysis instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Qualityanalysis instance) {
        log.debug("attaching clean Qualityanalysis instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}