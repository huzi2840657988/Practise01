package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Feegood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Feegood
  * @author MyEclipse Persistence Tools 
 */

public class FeegoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(FeegoodDAO.class);
		//property constants
	public static final String BSNO = "bsno";
	public static final String CONFIRMNUM = "confirmnum";
	public static final String EXRESULT = "exresult";
	public static final String FACTNO = "factno";
	public static final String FNOTE = "fnote";
	public static final String FPNUM = "fpnum";



    
    public void save(Feegood transientInstance) {
        log.debug("saving Feegood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Feegood persistentInstance) {
        log.debug("deleting Feegood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Feegood findById( java.lang.Integer id) {
        log.debug("getting Feegood instance with id: " + id);
        try {
            Feegood instance = (Feegood) getSession()
                    .get("com.fjsdfx.bean.Feegood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Feegood instance) {
        log.debug("finding Feegood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Feegood")
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
      log.debug("finding Feegood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Feegood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBsno(Object bsno
	) {
		return findByProperty(BSNO, bsno
		);
	}
	
	public List findByConfirmnum(Object confirmnum
	) {
		return findByProperty(CONFIRMNUM, confirmnum
		);
	}
	
	public List findByExresult(Object exresult
	) {
		return findByProperty(EXRESULT, exresult
		);
	}
	
	public List findByFactno(Object factno
	) {
		return findByProperty(FACTNO, factno
		);
	}
	
	public List findByFnote(Object fnote
	) {
		return findByProperty(FNOTE, fnote
		);
	}
	
	public List findByFpnum(Object fpnum
	) {
		return findByProperty(FPNUM, fpnum
		);
	}
	

	public List findAll() {
		log.debug("finding all Feegood instances");
		try {
			String queryString = "from Feegood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Feegood merge(Feegood detachedInstance) {
        log.debug("merging Feegood instance");
        try {
            Feegood result = (Feegood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Feegood instance) {
        log.debug("attaching dirty Feegood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Feegood instance) {
        log.debug("attaching clean Feegood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}