package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for EmpTrain entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.EmpTrain
  * @author MyEclipse Persistence Tools 
 */

public class EmpTrainDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(EmpTrainDAO.class);
		//property constants
	public static final String TRA_NAME = "traName";



    
    public void save(EmpTrain transientInstance) {
        log.debug("saving EmpTrain instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(EmpTrain persistentInstance) {
        log.debug("deleting EmpTrain instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public EmpTrain findById( java.lang.Integer id) {
        log.debug("getting EmpTrain instance with id: " + id);
        try {
            EmpTrain instance = (EmpTrain) getSession()
                    .get("com.fjsdfx.bean.EmpTrain", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(EmpTrain instance) {
        log.debug("finding EmpTrain instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.EmpTrain")
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
      log.debug("finding EmpTrain instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from EmpTrain as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByTraName(Object traName
	) {
		return findByProperty(TRA_NAME, traName
		);
	}
	

	public List findAll() {
		log.debug("finding all EmpTrain instances");
		try {
			String queryString = "from EmpTrain";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public EmpTrain merge(EmpTrain detachedInstance) {
        log.debug("merging EmpTrain instance");
        try {
            EmpTrain result = (EmpTrain) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(EmpTrain instance) {
        log.debug("attaching dirty EmpTrain instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(EmpTrain instance) {
        log.debug("attaching clean EmpTrain instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}