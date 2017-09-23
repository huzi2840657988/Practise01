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
 	* A data access object (DAO) providing persistence and search support for Rmtotal entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Rmtotal
  * @author MyEclipse Persistence Tools 
 */

public class RmtotalDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RmtotalDAO.class);
		//property constants
	public static final String MSENDNUM = "msendnum";
	public static final String MUNQRATE = "munqrate";
	public static final String REPAIRNUM = "repairnum";
	public static final String RNUM = "rnum";
	public static final String RTOTAL = "rtotal";
	public static final String SCRAPNUM = "scrapnum";
	public static final String TSENDNUM = "tsendnum";
	public static final String TUNQRATE = "tunqrate";



    
    public void save(Rmtotal transientInstance) {
        log.debug("saving Rmtotal instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Rmtotal persistentInstance) {
        log.debug("deleting Rmtotal instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Rmtotal findById( java.lang.Integer id) {
        log.debug("getting Rmtotal instance with id: " + id);
        try {
            Rmtotal instance = (Rmtotal) getSession()
                    .get("com.fjsdfx.bean.Rmtotal", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Rmtotal instance) {
        log.debug("finding Rmtotal instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Rmtotal")
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
      log.debug("finding Rmtotal instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Rmtotal as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByMsendnum(Object msendnum
	) {
		return findByProperty(MSENDNUM, msendnum
		);
	}
	
	public List findByMunqrate(Object munqrate
	) {
		return findByProperty(MUNQRATE, munqrate
		);
	}
	
	public List findByRepairnum(Object repairnum
	) {
		return findByProperty(REPAIRNUM, repairnum
		);
	}
	
	public List findByRnum(Object rnum
	) {
		return findByProperty(RNUM, rnum
		);
	}
	
	public List findByRtotal(Object rtotal
	) {
		return findByProperty(RTOTAL, rtotal
		);
	}
	
	public List findByScrapnum(Object scrapnum
	) {
		return findByProperty(SCRAPNUM, scrapnum
		);
	}
	
	public List findByTsendnum(Object tsendnum
	) {
		return findByProperty(TSENDNUM, tsendnum
		);
	}
	
	public List findByTunqrate(Object tunqrate
	) {
		return findByProperty(TUNQRATE, tunqrate
		);
	}
	

	public List findAll() {
		log.debug("finding all Rmtotal instances");
		try {
			String queryString = "from Rmtotal";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Rmtotal merge(Rmtotal detachedInstance) {
        log.debug("merging Rmtotal instance");
        try {
            Rmtotal result = (Rmtotal) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Rmtotal instance) {
        log.debug("attaching dirty Rmtotal instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Rmtotal instance) {
        log.debug("attaching clean Rmtotal instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}