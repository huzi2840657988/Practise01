package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Recruitment entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Recruitment
  * @author MyEclipse Persistence Tools 
 */

public class RecruitmentDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RecruitmentDAO.class);
		//property constants
	public static final String BASEREC = "baserec";
	public static final String IS_CHECK = "isCheck";
	public static final String ISYEAR = "isyear";
	public static final String RECNATURE = "recnature";
	public static final String RECNO = "recno";
	public static final String RECSTYLE = "recstyle";



    
    public void save(Recruitment transientInstance) {
        log.debug("saving Recruitment instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Recruitment persistentInstance) {
        log.debug("deleting Recruitment instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Recruitment findById( java.lang.Integer id) {
        log.debug("getting Recruitment instance with id: " + id);
        try {
            Recruitment instance = (Recruitment) getSession()
                    .get("com.fjsdfx.bean.Recruitment", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Recruitment instance) {
        log.debug("finding Recruitment instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Recruitment")
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
      log.debug("finding Recruitment instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Recruitment as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBaserec(Object baserec
	) {
		return findByProperty(BASEREC, baserec
		);
	}
	
	public List findByIsCheck(Object isCheck
	) {
		return findByProperty(IS_CHECK, isCheck
		);
	}
	
	public List findByIsyear(Object isyear
	) {
		return findByProperty(ISYEAR, isyear
		);
	}
	
	public List findByRecnature(Object recnature
	) {
		return findByProperty(RECNATURE, recnature
		);
	}
	
	public List findByRecno(Object recno
	) {
		return findByProperty(RECNO, recno
		);
	}
	
	public List findByRecstyle(Object recstyle
	) {
		return findByProperty(RECSTYLE, recstyle
		);
	}
	

	public List findAll() {
		log.debug("finding all Recruitment instances");
		try {
			String queryString = "from Recruitment";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Recruitment merge(Recruitment detachedInstance) {
        log.debug("merging Recruitment instance");
        try {
            Recruitment result = (Recruitment) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Recruitment instance) {
        log.debug("attaching dirty Recruitment instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Recruitment instance) {
        log.debug("attaching clean Recruitment instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}