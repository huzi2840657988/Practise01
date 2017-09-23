package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Supsendm3 entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Supsendm3
  * @author MyEclipse Persistence Tools 
 */

public class Supsendm3DAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Supsendm3DAO.class);
		//property constants
	public static final String HAWVERSION = "hawversion";
	public static final String NEED_NUM = "needNum";
	public static final String WORSHIP_CONFIRM = "worshipConfirm";



    
    public void save(Supsendm3 transientInstance) {
        log.debug("saving Supsendm3 instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Supsendm3 persistentInstance) {
        log.debug("deleting Supsendm3 instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Supsendm3 findById( java.lang.Integer id) {
        log.debug("getting Supsendm3 instance with id: " + id);
        try {
            Supsendm3 instance = (Supsendm3) getSession()
                    .get("com.fjsdfx.bean.Supsendm3", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Supsendm3 instance) {
        log.debug("finding Supsendm3 instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Supsendm3")
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
      log.debug("finding Supsendm3 instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Supsendm3 as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByHawversion(Object hawversion
	) {
		return findByProperty(HAWVERSION, hawversion
		);
	}
	
	public List findByNeedNum(Object needNum
	) {
		return findByProperty(NEED_NUM, needNum
		);
	}
	
	public List findByWorshipConfirm(Object worshipConfirm
	) {
		return findByProperty(WORSHIP_CONFIRM, worshipConfirm
		);
	}
	

	public List findAll() {
		log.debug("finding all Supsendm3 instances");
		try {
			String queryString = "from Supsendm3";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Supsendm3 merge(Supsendm3 detachedInstance) {
        log.debug("merging Supsendm3 instance");
        try {
            Supsendm3 result = (Supsendm3) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Supsendm3 instance) {
        log.debug("attaching dirty Supsendm3 instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Supsendm3 instance) {
        log.debug("attaching clean Supsendm3 instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}