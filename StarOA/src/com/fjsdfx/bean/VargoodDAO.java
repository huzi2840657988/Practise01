package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Vargood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Vargood
  * @author MyEclipse Persistence Tools 
 */

public class VargoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(VargoodDAO.class);
		//property constants
	public static final String CHNO = "chno";
	public static final String ETNO = "etno";
	public static final String FORSTYLE = "forstyle";
	public static final String VAG_REASON = "vagReason";



    
    public void save(Vargood transientInstance) {
        log.debug("saving Vargood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Vargood persistentInstance) {
        log.debug("deleting Vargood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Vargood findById( java.lang.Integer id) {
        log.debug("getting Vargood instance with id: " + id);
        try {
            Vargood instance = (Vargood) getSession()
                    .get("com.fjsdfx.bean.Vargood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Vargood instance) {
        log.debug("finding Vargood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Vargood")
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
      log.debug("finding Vargood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Vargood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByChno(Object chno
	) {
		return findByProperty(CHNO, chno
		);
	}
	
	public List findByEtno(Object etno
	) {
		return findByProperty(ETNO, etno
		);
	}
	
	public List findByForstyle(Object forstyle
	) {
		return findByProperty(FORSTYLE, forstyle
		);
	}
	
	public List findByVagReason(Object vagReason
	) {
		return findByProperty(VAG_REASON, vagReason
		);
	}
	

	public List findAll() {
		log.debug("finding all Vargood instances");
		try {
			String queryString = "from Vargood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Vargood merge(Vargood detachedInstance) {
        log.debug("merging Vargood instance");
        try {
            Vargood result = (Vargood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Vargood instance) {
        log.debug("attaching dirty Vargood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Vargood instance) {
        log.debug("attaching clean Vargood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}