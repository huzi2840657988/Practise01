package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Rewgood entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Rewgood
  * @author MyEclipse Persistence Tools 
 */

public class RewgoodDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RewgoodDAO.class);
		//property constants
	public static final String BSNO = "bsno";
	public static final String FACTNO = "factno";
	public static final String REWEXAMINE = "rewexamine";
	public static final String REWNO = "rewno";
	public static final String REWNOTE = "rewnote";
	public static final String REWPRICE = "rewprice";
	public static final String REWUNIT = "rewunit";
	public static final String REWUPRICE = "rewuprice";



    
    public void save(Rewgood transientInstance) {
        log.debug("saving Rewgood instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Rewgood persistentInstance) {
        log.debug("deleting Rewgood instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Rewgood findById( java.lang.Integer id) {
        log.debug("getting Rewgood instance with id: " + id);
        try {
            Rewgood instance = (Rewgood) getSession()
                    .get("com.fjsdfx.bean.Rewgood", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Rewgood instance) {
        log.debug("finding Rewgood instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Rewgood")
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
      log.debug("finding Rewgood instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Rewgood as model where model." 
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
	
	public List findByFactno(Object factno
	) {
		return findByProperty(FACTNO, factno
		);
	}
	
	public List findByRewexamine(Object rewexamine
	) {
		return findByProperty(REWEXAMINE, rewexamine
		);
	}
	
	public List findByRewno(Object rewno
	) {
		return findByProperty(REWNO, rewno
		);
	}
	
	public List findByRewnote(Object rewnote
	) {
		return findByProperty(REWNOTE, rewnote
		);
	}
	
	public List findByRewprice(Object rewprice
	) {
		return findByProperty(REWPRICE, rewprice
		);
	}
	
	public List findByRewunit(Object rewunit
	) {
		return findByProperty(REWUNIT, rewunit
		);
	}
	
	public List findByRewuprice(Object rewuprice
	) {
		return findByProperty(REWUPRICE, rewuprice
		);
	}
	

	public List findAll() {
		log.debug("finding all Rewgood instances");
		try {
			String queryString = "from Rewgood";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Rewgood merge(Rewgood detachedInstance) {
        log.debug("merging Rewgood instance");
        try {
            Rewgood result = (Rewgood) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Rewgood instance) {
        log.debug("attaching dirty Rewgood instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Rewgood instance) {
        log.debug("attaching clean Rewgood instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}