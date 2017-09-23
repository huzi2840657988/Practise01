package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Yrecruitment entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Yrecruitment
  * @author MyEclipse Persistence Tools 
 */

public class YrecruitmentDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(YrecruitmentDAO.class);
		//property constants
	public static final String IS_USER = "isUser";
	public static final String RECRUITMENT_NAME = "recruitmentName";



    
    public void save(Yrecruitment transientInstance) {
        log.debug("saving Yrecruitment instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Yrecruitment persistentInstance) {
        log.debug("deleting Yrecruitment instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Yrecruitment findById( java.lang.Integer id) {
        log.debug("getting Yrecruitment instance with id: " + id);
        try {
            Yrecruitment instance = (Yrecruitment) getSession()
                    .get("com.fjsdfx.bean.Yrecruitment", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Yrecruitment instance) {
        log.debug("finding Yrecruitment instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Yrecruitment")
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
      log.debug("finding Yrecruitment instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Yrecruitment as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByIsUser(Object isUser
	) {
		return findByProperty(IS_USER, isUser
		);
	}
	
	public List findByRecruitmentName(Object recruitmentName
	) {
		return findByProperty(RECRUITMENT_NAME, recruitmentName
		);
	}
	

	public List findAll() {
		log.debug("finding all Yrecruitment instances");
		try {
			String queryString = "from Yrecruitment";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Yrecruitment merge(Yrecruitment detachedInstance) {
        log.debug("merging Yrecruitment instance");
        try {
            Yrecruitment result = (Yrecruitment) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Yrecruitment instance) {
        log.debug("attaching dirty Yrecruitment instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Yrecruitment instance) {
        log.debug("attaching clean Yrecruitment instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}