package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Jobs entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Jobs
  * @author MyEclipse Persistence Tools 
 */

public class JobsDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(JobsDAO.class);
		//property constants
	public static final String JOB_DES = "jobDes";
	public static final String JOB_NAME = "jobName";



    
    public void save(Jobs transientInstance) {
        log.debug("saving Jobs instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jobs persistentInstance) {
        log.debug("deleting Jobs instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jobs findById( java.lang.Integer id) {
        log.debug("getting Jobs instance with id: " + id);
        try {
            Jobs instance = (Jobs) getSession()
                    .get("com.fjsdfx.bean.Jobs", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jobs instance) {
        log.debug("finding Jobs instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Jobs")
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
      log.debug("finding Jobs instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jobs as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByJobDes(Object jobDes
	) {
		return findByProperty(JOB_DES, jobDes
		);
	}
	
	public List findByJobName(Object jobName
	) {
		return findByProperty(JOB_NAME, jobName
		);
	}
	

	public List findAll() {
		log.debug("finding all Jobs instances");
		try {
			String queryString = "from Jobs";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jobs merge(Jobs detachedInstance) {
        log.debug("merging Jobs instance");
        try {
            Jobs result = (Jobs) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jobs instance) {
        log.debug("attaching dirty Jobs instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jobs instance) {
        log.debug("attaching clean Jobs instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}