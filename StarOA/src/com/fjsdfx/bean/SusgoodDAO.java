package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Susgood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Susgood
  * @author MyEclipse Persistence Tools 
 */

public class SusgoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(SusgoodDAO.class);
		//property constants
	public static final String BONDEDNUM = "bondednum";
	public static final String GENERALNO = "generalno";
	public static final String LBALANCE = "lbalance";
	public static final String NO = "no";
	public static final String NOTE = "note";
	public static final String SINGLESET = "singleset";
	public static final String TBALANCE = "tbalance";



    
    public void save(Susgood transientInstance) {
        log.debug("saving Susgood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Susgood persistentInstance) {
        log.debug("deleting Susgood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Susgood findById( java.lang.Integer id) {
        log.debug("getting Susgood instance with id: " + id);
        try {
            Susgood instance = (Susgood) getSession()
                    .get("com.fjsdfx.bean.Susgood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Susgood instance) {
        log.debug("finding Susgood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Susgood")
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
      log.debug("finding Susgood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Susgood as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBondednum(Object bondednum
	) {
		return findByProperty(BONDEDNUM, bondednum
		);
	}
	
	public List findByGeneralno(Object generalno
	) {
		return findByProperty(GENERALNO, generalno
		);
	}
	
	public List findByLbalance(Object lbalance
	) {
		return findByProperty(LBALANCE, lbalance
		);
	}
	
	public List findByNo(Object no
	) {
		return findByProperty(NO, no
		);
	}
	
	public List findByNote(Object note
	) {
		return findByProperty(NOTE, note
		);
	}
	
	public List findBySingleset(Object singleset
	) {
		return findByProperty(SINGLESET, singleset
		);
	}
	
	public List findByTbalance(Object tbalance
	) {
		return findByProperty(TBALANCE, tbalance
		);
	}
	

	public List findAll() {
		log.debug("finding all Susgood instances");
		try {
			String queryString = "from Susgood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Susgood merge(Susgood detachedInstance) {
        log.debug("merging Susgood instance");
        try {
            Susgood result = (Susgood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Susgood instance) {
        log.debug("attaching dirty Susgood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Susgood instance) {
        log.debug("attaching clean Susgood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}