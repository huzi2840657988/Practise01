package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for ProSchedule entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.ProSchedule
  * @author MyEclipse Persistence Tools 
 */

public class ProScheduleDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ProScheduleDAO.class);
		//property constants
	public static final String PCONTENT = "pcontent";
	public static final String PNOTE = "pnote";
	public static final String PNUMBER = "pnumber";
	public static final String PUNIT = "punit";



    
    public void save(ProSchedule transientInstance) {
        log.debug("saving ProSchedule instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(ProSchedule persistentInstance) {
        log.debug("deleting ProSchedule instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public ProSchedule findById( java.lang.Integer id) {
        log.debug("getting ProSchedule instance with id: " + id);
        try {
            ProSchedule instance = (ProSchedule) getSession()
                    .get("com.fjsdfx.bean.ProSchedule", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(ProSchedule instance) {
        log.debug("finding ProSchedule instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.ProSchedule")
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
      log.debug("finding ProSchedule instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from ProSchedule as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPcontent(Object pcontent
	) {
		return findByProperty(PCONTENT, pcontent
		);
	}
	
	public List findByPnote(Object pnote
	) {
		return findByProperty(PNOTE, pnote
		);
	}
	
	public List findByPnumber(Object pnumber
	) {
		return findByProperty(PNUMBER, pnumber
		);
	}
	
	public List findByPunit(Object punit
	) {
		return findByProperty(PUNIT, punit
		);
	}
	

	public List findAll() {
		log.debug("finding all ProSchedule instances");
		try {
			String queryString = "from ProSchedule";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public ProSchedule merge(ProSchedule detachedInstance) {
        log.debug("merging ProSchedule instance");
        try {
            ProSchedule result = (ProSchedule) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(ProSchedule instance) {
        log.debug("attaching dirty ProSchedule instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(ProSchedule instance) {
        log.debug("attaching clean ProSchedule instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}