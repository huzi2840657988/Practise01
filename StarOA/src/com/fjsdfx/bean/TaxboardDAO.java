package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Taxboard entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Taxboard
  * @author MyEclipse Persistence Tools 
 */

public class TaxboardDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TaxboardDAO.class);
		//property constants
	public static final String BATCHNO = "batchno";
	public static final String CHECKNUM = "checknum";
	public static final String CRESULT = "cresult";
	public static final String CRESULT2 = "cresult2";
	public static final String DETFINALLY = "detfinally";
	public static final String GOODSTOTAL = "goodstotal";
	public static final String ICTCHK = "ictchk";
	public static final String INSPECTOR = "inspector";
	public static final String LINENO = "lineno";
	public static final String LINENO2 = "lineno2";
	public static final String OUTERCHK = "outerchk";
	public static final String PACKINGCHK = "packingchk";
	public static final String QUACONFIRM = "quaconfirm";
	public static final String RPER = "rper";
	public static final String SERVICINGCHK = "servicingchk";
	public static final String USERF = "userf";



    
    public void save(Taxboard transientInstance) {
        log.debug("saving Taxboard instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Taxboard persistentInstance) {
        log.debug("deleting Taxboard instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Taxboard findById( java.lang.Integer id) {
        log.debug("getting Taxboard instance with id: " + id);
        try {
            Taxboard instance = (Taxboard) getSession()
                    .get("com.fjsdfx.bean.Taxboard", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Taxboard instance) {
        log.debug("finding Taxboard instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Taxboard")
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
      log.debug("finding Taxboard instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Taxboard as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBatchno(Object batchno
	) {
		return findByProperty(BATCHNO, batchno
		);
	}
	
	public List findByChecknum(Object checknum
	) {
		return findByProperty(CHECKNUM, checknum
		);
	}
	
	public List findByCresult(Object cresult
	) {
		return findByProperty(CRESULT, cresult
		);
	}
	
	public List findByCresult2(Object cresult2
	) {
		return findByProperty(CRESULT2, cresult2
		);
	}
	
	public List findByDetfinally(Object detfinally
	) {
		return findByProperty(DETFINALLY, detfinally
		);
	}
	
	public List findByGoodstotal(Object goodstotal
	) {
		return findByProperty(GOODSTOTAL, goodstotal
		);
	}
	
	public List findByIctchk(Object ictchk
	) {
		return findByProperty(ICTCHK, ictchk
		);
	}
	
	public List findByInspector(Object inspector
	) {
		return findByProperty(INSPECTOR, inspector
		);
	}
	
	public List findByLineno(Object lineno
	) {
		return findByProperty(LINENO, lineno
		);
	}
	
	public List findByLineno2(Object lineno2
	) {
		return findByProperty(LINENO2, lineno2
		);
	}
	
	public List findByOuterchk(Object outerchk
	) {
		return findByProperty(OUTERCHK, outerchk
		);
	}
	
	public List findByPackingchk(Object packingchk
	) {
		return findByProperty(PACKINGCHK, packingchk
		);
	}
	
	public List findByQuaconfirm(Object quaconfirm
	) {
		return findByProperty(QUACONFIRM, quaconfirm
		);
	}
	
	public List findByRper(Object rper
	) {
		return findByProperty(RPER, rper
		);
	}
	
	public List findByServicingchk(Object servicingchk
	) {
		return findByProperty(SERVICINGCHK, servicingchk
		);
	}
	
	public List findByUserf(Object userf
	) {
		return findByProperty(USERF, userf
		);
	}
	

	public List findAll() {
		log.debug("finding all Taxboard instances");
		try {
			String queryString = "from Taxboard";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Taxboard merge(Taxboard detachedInstance) {
        log.debug("merging Taxboard instance");
        try {
            Taxboard result = (Taxboard) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Taxboard instance) {
        log.debug("attaching dirty Taxboard instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Taxboard instance) {
        log.debug("attaching clean Taxboard instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}