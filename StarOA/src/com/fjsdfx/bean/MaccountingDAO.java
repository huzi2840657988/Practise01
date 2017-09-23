package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Maccounting entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Maccounting
  * @author MyEclipse Persistence Tools 
 */

public class MaccountingDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(MaccountingDAO.class);
		//property constants
	public static final String ENNUM = "ennum";
	public static final String NOTES = "notes";
	public static final String OUTNUM = "outnum";
	public static final String STONUM = "stonum";
	public static final String WHNAME = "whname";



    
    public void save(Maccounting transientInstance) {
        log.debug("saving Maccounting instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Maccounting persistentInstance) {
        log.debug("deleting Maccounting instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Maccounting findById( java.lang.Integer id) {
        log.debug("getting Maccounting instance with id: " + id);
        try {
            Maccounting instance = (Maccounting) getSession()
                    .get("com.fjsdfx.bean.Maccounting", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Maccounting instance) {
        log.debug("finding Maccounting instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Maccounting")
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
      log.debug("finding Maccounting instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Maccounting as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByEnnum(Object ennum
	) {
		return findByProperty(ENNUM, ennum
		);
	}
	
	public List findByNotes(Object notes
	) {
		return findByProperty(NOTES, notes
		);
	}
	
	public List findByOutnum(Object outnum
	) {
		return findByProperty(OUTNUM, outnum
		);
	}
	
	public List findByStonum(Object stonum
	) {
		return findByProperty(STONUM, stonum
		);
	}
	
	public List findByWhname(Object whname
	) {
		return findByProperty(WHNAME, whname
		);
	}
	

	public List findAll() {
		log.debug("finding all Maccounting instances");
		try {
			String queryString = "from Maccounting";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Maccounting merge(Maccounting detachedInstance) {
        log.debug("merging Maccounting instance");
        try {
            Maccounting result = (Maccounting) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Maccounting instance) {
        log.debug("attaching dirty Maccounting instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Maccounting instance) {
        log.debug("attaching clean Maccounting instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}