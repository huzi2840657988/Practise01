package com.fjsdfx.bean;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Shinote2 entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Shinote2
  * @author MyEclipse Persistence Tools 
 */

public class Shinote2DAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Shinote2DAO.class);
		//property constants
	public static final String LETRECPER = "letrecper";
	public static final String RADDRESS = "raddress";
	public static final String RCODE = "rcode";
	public static final String RECPER = "recper";
	public static final String RECSTYLE = "recstyle";
	public static final String RECUNIT = "recunit";
	public static final String SBRANCH1 = "sbranch1";
	public static final String SBRANCH2 = "sbranch2";
	public static final String SBRANCH3 = "sbranch3";
	public static final String SCHPER = "schper";
	public static final String SHI2NOTE = "shi2note";
	public static final String SN = "sn";
	public static final String STORAGEPER = "storageper";
	public static final String TOSTATION = "tostation";
	public static final String TOTALS = "totals";
	public static final String TRNO = "trno";
	public static final String WHMGER = "whmger";



    
    public void save(Shinote2 transientInstance) {
        log.debug("saving Shinote2 instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Shinote2 persistentInstance) {
        log.debug("deleting Shinote2 instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Shinote2 findById( java.lang.Integer id) {
        log.debug("getting Shinote2 instance with id: " + id);
        try {
            Shinote2 instance = (Shinote2) getSession()
                    .get("com.fjsdfx.bean.Shinote2", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Shinote2 instance) {
        log.debug("finding Shinote2 instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Shinote2")
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
      log.debug("finding Shinote2 instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Shinote2 as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByLetrecper(Object letrecper
	) {
		return findByProperty(LETRECPER, letrecper
		);
	}
	
	public List findByRaddress(Object raddress
	) {
		return findByProperty(RADDRESS, raddress
		);
	}
	
	public List findByRcode(Object rcode
	) {
		return findByProperty(RCODE, rcode
		);
	}
	
	public List findByRecper(Object recper
	) {
		return findByProperty(RECPER, recper
		);
	}
	
	public List findByRecstyle(Object recstyle
	) {
		return findByProperty(RECSTYLE, recstyle
		);
	}
	
	public List findByRecunit(Object recunit
	) {
		return findByProperty(RECUNIT, recunit
		);
	}
	
	public List findBySbranch1(Object sbranch1
	) {
		return findByProperty(SBRANCH1, sbranch1
		);
	}
	
	public List findBySbranch2(Object sbranch2
	) {
		return findByProperty(SBRANCH2, sbranch2
		);
	}
	
	public List findBySbranch3(Object sbranch3
	) {
		return findByProperty(SBRANCH3, sbranch3
		);
	}
	
	public List findBySchper(Object schper
	) {
		return findByProperty(SCHPER, schper
		);
	}
	
	public List findByShi2note(Object shi2note
	) {
		return findByProperty(SHI2NOTE, shi2note
		);
	}
	
	public List findBySn(Object sn
	) {
		return findByProperty(SN, sn
		);
	}
	
	public List findByStorageper(Object storageper
	) {
		return findByProperty(STORAGEPER, storageper
		);
	}
	
	public List findByTostation(Object tostation
	) {
		return findByProperty(TOSTATION, tostation
		);
	}
	
	public List findByTotals(Object totals
	) {
		return findByProperty(TOTALS, totals
		);
	}
	
	public List findByTrno(Object trno
	) {
		return findByProperty(TRNO, trno
		);
	}
	
	public List findByWhmger(Object whmger
	) {
		return findByProperty(WHMGER, whmger
		);
	}
	

	public List findAll() {
		log.debug("finding all Shinote2 instances");
		try {
			String queryString = "from Shinote2";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Shinote2 merge(Shinote2 detachedInstance) {
        log.debug("merging Shinote2 instance");
        try {
            Shinote2 result = (Shinote2) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Shinote2 instance) {
        log.debug("attaching dirty Shinote2 instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Shinote2 instance) {
        log.debug("attaching clean Shinote2 instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}