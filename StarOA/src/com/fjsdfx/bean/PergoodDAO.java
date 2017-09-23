package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Pergood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Pergood
  * @author MyEclipse Persistence Tools 
 */

public class PergoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(PergoodDAO.class);
		//property constants
	public static final String PRE_NOTE = "preNote";
	public static final String PRE_NUM = "preNum";
	public static final String ADDSUP = "addsup";
	public static final String IS_EXTRA_SUP = "isExtraSup";



    
    public void save(Pergood transientInstance) {
        log.debug("saving Pergood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Pergood persistentInstance) {
        log.debug("deleting Pergood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Pergood findById( java.lang.Integer id) {
        log.debug("getting Pergood instance with id: " + id);
        try {
            Pergood instance = (Pergood) getSession()
                    .get("com.fjsdfx.bean.Pergood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Pergood instance) {
        log.debug("finding Pergood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Pergood")
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
      log.debug("finding Pergood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Pergood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPreNote(Object preNote
	) {
		return findByProperty(PRE_NOTE, preNote
		);
	}
	
	public List findByPreNum(Object preNum
	) {
		return findByProperty(PRE_NUM, preNum
		);
	}
	
	public List findByAddsup(Object addsup
	) {
		return findByProperty(ADDSUP, addsup
		);
	}
	
	public List findByIsExtraSup(Object isExtraSup
	) {
		return findByProperty(IS_EXTRA_SUP, isExtraSup
		);
	}
	

	public List findAll() {
		log.debug("finding all Pergood instances");
		try {
			String queryString = "from Pergood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Pergood merge(Pergood detachedInstance) {
        log.debug("merging Pergood instance");
        try {
            Pergood result = (Pergood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Pergood instance) {
        log.debug("attaching dirty Pergood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Pergood instance) {
        log.debug("attaching clean Pergood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}