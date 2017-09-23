package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Susgood3 entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Susgood3
  * @author MyEclipse Persistence Tools 
 */

public class Susgood3DAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Susgood3DAO.class);
		//property constants
	public static final String CONTROLLERUNIT_INFO = "controllerunitInfo";
	public static final String IS_EXTRA = "isExtra";
	public static final String NEED_NUM = "needNum";
	public static final String NOTE = "note";
	public static final String PRAC_NUM = "pracNum";
	public static final String SERI_NUM = "seriNum";
	public static final String SINGLESET = "singleset";
	public static final String WORSHIP_CONFIRM = "worshipConfirm";



    
    public void save(Susgood3 transientInstance) {
        log.debug("saving Susgood3 instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Susgood3 persistentInstance) {
        log.debug("deleting Susgood3 instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Susgood3 findById( java.lang.Integer id) {
        log.debug("getting Susgood3 instance with id: " + id);
        try {
            Susgood3 instance = (Susgood3) getSession()
                    .get("com.fjsdfx.bean.Susgood3", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Susgood3 instance) {
        log.debug("finding Susgood3 instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Susgood3")
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
      log.debug("finding Susgood3 instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Susgood3 as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByControllerunitInfo(Object controllerunitInfo
	) {
		return findByProperty(CONTROLLERUNIT_INFO, controllerunitInfo
		);
	}
	
	public List findByIsExtra(Object isExtra
	) {
		return findByProperty(IS_EXTRA, isExtra
		);
	}
	
	public List findByNeedNum(Object needNum
	) {
		return findByProperty(NEED_NUM, needNum
		);
	}
	
	public List findByNote(Object note
	) {
		return findByProperty(NOTE, note
		);
	}
	
	public List findByPracNum(Object pracNum
	) {
		return findByProperty(PRAC_NUM, pracNum
		);
	}
	
	public List findBySeriNum(Object seriNum
	) {
		return findByProperty(SERI_NUM, seriNum
		);
	}
	
	public List findBySingleset(Object singleset
	) {
		return findByProperty(SINGLESET, singleset
		);
	}
	
	public List findByWorshipConfirm(Object worshipConfirm
	) {
		return findByProperty(WORSHIP_CONFIRM, worshipConfirm
		);
	}
	

	public List findAll() {
		log.debug("finding all Susgood3 instances");
		try {
			String queryString = "from Susgood3";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Susgood3 merge(Susgood3 detachedInstance) {
        log.debug("merging Susgood3 instance");
        try {
            Susgood3 result = (Susgood3) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Susgood3 instance) {
        log.debug("attaching dirty Susgood3 instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Susgood3 instance) {
        log.debug("attaching clean Susgood3 instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}