package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Changef entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Changef
  * @author MyEclipse Persistence Tools 
 */

public class ChangefDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ChangefDAO.class);
		//property constants
	public static final String BNO = "bno";
	public static final String CHA_NO = "chaNo";
	public static final String CHANNOTE = "channote";
	public static final String COMPETENO = "competeno";
	public static final String PRORECORD = "prorecord";



    
    public void save(Changef transientInstance) {
        log.debug("saving Changef instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Changef persistentInstance) {
        log.debug("deleting Changef instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Changef findById( java.lang.Integer id) {
        log.debug("getting Changef instance with id: " + id);
        try {
            Changef instance = (Changef) getSession()
                    .get("com.fjsdfx.bean.Changef", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Changef instance) {
        log.debug("finding Changef instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Changef")
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
      log.debug("finding Changef instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Changef as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBno(Object bno
	) {
		return findByProperty(BNO, bno
		);
	}
	
	public List findByChaNo(Object chaNo
	) {
		return findByProperty(CHA_NO, chaNo
		);
	}
	
	public List findByChannote(Object channote
	) {
		return findByProperty(CHANNOTE, channote
		);
	}
	
	public List findByCompeteno(Object competeno
	) {
		return findByProperty(COMPETENO, competeno
		);
	}
	
	public List findByProrecord(Object prorecord
	) {
		return findByProperty(PRORECORD, prorecord
		);
	}
	

	public List findAll() {
		log.debug("finding all Changef instances");
		try {
			String queryString = "from Changef";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Changef merge(Changef detachedInstance) {
        log.debug("merging Changef instance");
        try {
            Changef result = (Changef) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Changef instance) {
        log.debug("attaching dirty Changef instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Changef instance) {
        log.debug("attaching clean Changef instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}