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
 	* A data access object (DAO) providing persistence and search support for Training entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Training
  * @author MyEclipse Persistence Tools 
 */

public class TrainingDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TrainingDAO.class);
		//property constants
	public static final String DATE_TEMP = "dateTemp";
	public static final String EXAM = "exam";
	public static final String LECTURE = "lecture";
	public static final String TRA_NAME = "traName";
	public static final String TRA_NUMBER = "traNumber";
	public static final String TRACONTENT = "tracontent";



    
    public void save(Training transientInstance) {
        log.debug("saving Training instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Training persistentInstance) {
        log.debug("deleting Training instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Training findById( java.lang.Integer id) {
        log.debug("getting Training instance with id: " + id);
        try {
            Training instance = (Training) getSession()
                    .get("com.fjsdfx.bean.Training", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Training instance) {
        log.debug("finding Training instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Training")
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
      log.debug("finding Training instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Training as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByDateTemp(Object dateTemp
	) {
		return findByProperty(DATE_TEMP, dateTemp
		);
	}
	
	public List findByExam(Object exam
	) {
		return findByProperty(EXAM, exam
		);
	}
	
	public List findByLecture(Object lecture
	) {
		return findByProperty(LECTURE, lecture
		);
	}
	
	public List findByTraName(Object traName
	) {
		return findByProperty(TRA_NAME, traName
		);
	}
	
	public List findByTraNumber(Object traNumber
	) {
		return findByProperty(TRA_NUMBER, traNumber
		);
	}
	
	public List findByTracontent(Object tracontent
	) {
		return findByProperty(TRACONTENT, tracontent
		);
	}
	

	public List findAll() {
		log.debug("finding all Training instances");
		try {
			String queryString = "from Training";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Training merge(Training detachedInstance) {
        log.debug("merging Training instance");
        try {
            Training result = (Training) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Training instance) {
        log.debug("attaching dirty Training instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Training instance) {
        log.debug("attaching clean Training instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}