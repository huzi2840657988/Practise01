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
 	* A data access object (DAO) providing persistence and search support for Testnotes entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Testnotes
  * @author MyEclipse Persistence Tools 
 */

public class TestnotesDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TestnotesDAO.class);
		//property constants
	public static final String BASIS = "basis";
	public static final String BRAND = "brand";
	public static final String CHECKREPORT = "checkreport";
	public static final String NOTE = "note";
	public static final String NUM = "num";
	public static final String QUADVICE = "quadvice";
	public static final String RESULT = "result";
	public static final String SAMID = "samid";
	public static final String TIEMS = "tiems";
	public static final String TRACKTEST_ID = "tracktestId";



    
    public void save(Testnotes transientInstance) {
        log.debug("saving Testnotes instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Testnotes persistentInstance) {
        log.debug("deleting Testnotes instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Testnotes findById( java.lang.Integer id) {
        log.debug("getting Testnotes instance with id: " + id);
        try {
            Testnotes instance = (Testnotes) getSession()
                    .get("com.fjsdfx.bean.Testnotes", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Testnotes instance) {
        log.debug("finding Testnotes instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Testnotes")
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
      log.debug("finding Testnotes instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Testnotes as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBasis(Object basis
	) {
		return findByProperty(BASIS, basis
		);
	}
	
	public List findByBrand(Object brand
	) {
		return findByProperty(BRAND, brand
		);
	}
	
	public List findByCheckreport(Object checkreport
	) {
		return findByProperty(CHECKREPORT, checkreport
		);
	}
	
	public List findByNote(Object note
	) {
		return findByProperty(NOTE, note
		);
	}
	
	public List findByNum(Object num
	) {
		return findByProperty(NUM, num
		);
	}
	
	public List findByQuadvice(Object quadvice
	) {
		return findByProperty(QUADVICE, quadvice
		);
	}
	
	public List findByResult(Object result
	) {
		return findByProperty(RESULT, result
		);
	}
	
	public List findBySamid(Object samid
	) {
		return findByProperty(SAMID, samid
		);
	}
	
	public List findByTiems(Object tiems
	) {
		return findByProperty(TIEMS, tiems
		);
	}
	
	public List findByTracktestId(Object tracktestId
	) {
		return findByProperty(TRACKTEST_ID, tracktestId
		);
	}
	

	public List findAll() {
		log.debug("finding all Testnotes instances");
		try {
			String queryString = "from Testnotes";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Testnotes merge(Testnotes detachedInstance) {
        log.debug("merging Testnotes instance");
        try {
            Testnotes result = (Testnotes) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Testnotes instance) {
        log.debug("attaching dirty Testnotes instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Testnotes instance) {
        log.debug("attaching clean Testnotes instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}