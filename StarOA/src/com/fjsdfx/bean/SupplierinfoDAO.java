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
 	* A data access object (DAO) providing persistence and search support for Supplierinfo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Supplierinfo
  * @author MyEclipse Persistence Tools 
 */

public class SupplierinfoDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(SupplierinfoDAO.class);
		//property constants
	public static final String ADDRESS = "address";
	public static final String AVAILABILITY = "availability";
	public static final String AWARD = "award";
	public static final String BUSINESS = "business";
	public static final String ITEMNAME = "itemname";
	public static final String ITEMTYPENAME = "itemtypename";
	public static final String MUSER = "muser";
	public static final String NOTES = "notes";
	public static final String OBTAIN = "obtain";
	public static final String OUTPUT = "output";
	public static final String PHONE = "phone";
	public static final String QSITUATION = "qsituation";
	public static final String QUALITY = "quality";
	public static final String QUAMGER = "quamger";
	public static final String SUPCNAME = "supcname";
	public static final String SUPCYCLE = "supcycle";
	public static final String SUPENAME = "supename";
	public static final String TECH = "tech";



    
    public void save(Supplierinfo transientInstance) {
        log.debug("saving Supplierinfo instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Supplierinfo persistentInstance) {
        log.debug("deleting Supplierinfo instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Supplierinfo findById( java.lang.Integer id) {
        log.debug("getting Supplierinfo instance with id: " + id);
        try {
            Supplierinfo instance = (Supplierinfo) getSession()
                    .get("com.fjsdfx.bean.Supplierinfo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Supplierinfo instance) {
        log.debug("finding Supplierinfo instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Supplierinfo")
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
      log.debug("finding Supplierinfo instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Supplierinfo as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByAddress(Object address
	) {
		return findByProperty(ADDRESS, address
		);
	}
	
	public List findByAvailability(Object availability
	) {
		return findByProperty(AVAILABILITY, availability
		);
	}
	
	public List findByAward(Object award
	) {
		return findByProperty(AWARD, award
		);
	}
	
	public List findByBusiness(Object business
	) {
		return findByProperty(BUSINESS, business
		);
	}
	
	public List findByItemname(Object itemname
	) {
		return findByProperty(ITEMNAME, itemname
		);
	}
	
	public List findByItemtypename(Object itemtypename
	) {
		return findByProperty(ITEMTYPENAME, itemtypename
		);
	}
	
	public List findByMuser(Object muser
	) {
		return findByProperty(MUSER, muser
		);
	}
	
	public List findByNotes(Object notes
	) {
		return findByProperty(NOTES, notes
		);
	}
	
	public List findByObtain(Object obtain
	) {
		return findByProperty(OBTAIN, obtain
		);
	}
	
	public List findByOutput(Object output
	) {
		return findByProperty(OUTPUT, output
		);
	}
	
	public List findByPhone(Object phone
	) {
		return findByProperty(PHONE, phone
		);
	}
	
	public List findByQsituation(Object qsituation
	) {
		return findByProperty(QSITUATION, qsituation
		);
	}
	
	public List findByQuality(Object quality
	) {
		return findByProperty(QUALITY, quality
		);
	}
	
	public List findByQuamger(Object quamger
	) {
		return findByProperty(QUAMGER, quamger
		);
	}
	
	public List findBySupcname(Object supcname
	) {
		return findByProperty(SUPCNAME, supcname
		);
	}
	
	public List findBySupcycle(Object supcycle
	) {
		return findByProperty(SUPCYCLE, supcycle
		);
	}
	
	public List findBySupename(Object supename
	) {
		return findByProperty(SUPENAME, supename
		);
	}
	
	public List findByTech(Object tech
	) {
		return findByProperty(TECH, tech
		);
	}
	

	public List findAll() {
		log.debug("finding all Supplierinfo instances");
		try {
			String queryString = "from Supplierinfo";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Supplierinfo merge(Supplierinfo detachedInstance) {
        log.debug("merging Supplierinfo instance");
        try {
            Supplierinfo result = (Supplierinfo) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Supplierinfo instance) {
        log.debug("attaching dirty Supplierinfo instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Supplierinfo instance) {
        log.debug("attaching clean Supplierinfo instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}