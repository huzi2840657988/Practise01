package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Annoucement entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Annoucement
  * @author MyEclipse Persistence Tools 
 */

public class AnnoucementDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(AnnoucementDAO.class);
		//property constants
	public static final String CONTENT = "content";
	public static final String TITLE = "title";



    
    public void save(Annoucement transientInstance) {
        log.debug("saving Annoucement instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Annoucement persistentInstance) {
        log.debug("deleting Annoucement instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Annoucement findById( java.lang.Integer id) {
        log.debug("getting Annoucement instance with id: " + id);
        try {
            Annoucement instance = (Annoucement) getSession()
                    .get("com.fjsdfx.bean.Annoucement", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Annoucement instance) {
        log.debug("finding Annoucement instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Annoucement")
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
      log.debug("finding Annoucement instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Annoucement as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByContent(Object content
	) {
		return findByProperty(CONTENT, content
		);
	}
	
	public List findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	

	public List findAll() {
		log.debug("finding all Annoucement instances");
		try {
			String queryString = "from Annoucement";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Annoucement merge(Annoucement detachedInstance) {
        log.debug("merging Annoucement instance");
        try {
            Annoucement result = (Annoucement) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Annoucement instance) {
        log.debug("attaching dirty Annoucement instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Annoucement instance) {
        log.debug("attaching clean Annoucement instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}