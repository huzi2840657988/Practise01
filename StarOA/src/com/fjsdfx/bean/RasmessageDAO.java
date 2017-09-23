package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Rasmessage entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Rasmessage
  * @author MyEclipse Persistence Tools 
 */

public class RasmessageDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RasmessageDAO.class);
		//property constants
	public static final String ACCESSORIES = "accessories";
	public static final String CONTENT = "content";
	public static final String FLA1 = "fla1";
	public static final String RASSTATUS = "rasstatus";
	public static final String TITLE = "title";
	public static final String FLA2 = "fla2";
	public static final String FLA3 = "fla3";



    
    public void save(Rasmessage transientInstance) {
        log.debug("saving Rasmessage instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Rasmessage persistentInstance) {
        log.debug("deleting Rasmessage instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Rasmessage findById( java.lang.Integer id) {
        log.debug("getting Rasmessage instance with id: " + id);
        try {
            Rasmessage instance = (Rasmessage) getSession()
                    .get("com.fjsdfx.bean.Rasmessage", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Rasmessage instance) {
        log.debug("finding Rasmessage instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Rasmessage")
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
      log.debug("finding Rasmessage instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Rasmessage as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByAccessories(Object accessories
	) {
		return findByProperty(ACCESSORIES, accessories
		);
	}
	
	public List findByContent(Object content
	) {
		return findByProperty(CONTENT, content
		);
	}
	
	public List findByFla1(Object fla1
	) {
		return findByProperty(FLA1, fla1
		);
	}
	
	public List findByRasstatus(Object rasstatus
	) {
		return findByProperty(RASSTATUS, rasstatus
		);
	}
	
	public List findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	
	public List findByFla2(Object fla2
	) {
		return findByProperty(FLA2, fla2
		);
	}
	
	public List findByFla3(Object fla3
	) {
		return findByProperty(FLA3, fla3
		);
	}
	

	public List findAll() {
		log.debug("finding all Rasmessage instances");
		try {
			String queryString = "from Rasmessage";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Rasmessage merge(Rasmessage detachedInstance) {
        log.debug("merging Rasmessage instance");
        try {
            Rasmessage result = (Rasmessage) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Rasmessage instance) {
        log.debug("attaching dirty Rasmessage instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Rasmessage instance) {
        log.debug("attaching clean Rasmessage instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}