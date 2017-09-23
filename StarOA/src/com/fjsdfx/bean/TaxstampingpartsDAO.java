package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Taxstampingparts entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Taxstampingparts
  * @author MyEclipse Persistence Tools 
 */

public class TaxstampingpartsDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TaxstampingpartsDAO.class);
		//property constants
	public static final String BATCHNO = "batchno";
	public static final String CHECKRESULT1 = "checkresult1";
	public static final String CHECKRESULT2 = "checkresult2";
	public static final String CHENKRESULT3 = "chenkresult3";
	public static final String CONFIRM = "confirm";
	public static final String GOODSTOTAL = "goodstotal";
	public static final String INSPECTOR = "inspector";
	public static final String QUACONFIRM = "quaconfirm";
	public static final String RPER = "rper";
	public static final String SIZECHECKAQL = "sizecheckaql";
	public static final String SIZECHECKNUM = "sizechecknum";
	public static final String VISCHECKNUM1 = "vischecknum1";
	public static final String VISCHECKNUM2 = "vischecknum2";



    
    public void save(Taxstampingparts transientInstance) {
        log.debug("saving Taxstampingparts instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Taxstampingparts persistentInstance) {
        log.debug("deleting Taxstampingparts instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Taxstampingparts findById( java.lang.Integer id) {
        log.debug("getting Taxstampingparts instance with id: " + id);
        try {
            Taxstampingparts instance = (Taxstampingparts) getSession()
                    .get("com.fjsdfx.bean.Taxstampingparts", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Taxstampingparts instance) {
        log.debug("finding Taxstampingparts instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Taxstampingparts")
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
      log.debug("finding Taxstampingparts instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Taxstampingparts as model where model." 
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
	
	public List findByCheckresult1(Object checkresult1
	) {
		return findByProperty(CHECKRESULT1, checkresult1
		);
	}
	
	public List findByCheckresult2(Object checkresult2
	) {
		return findByProperty(CHECKRESULT2, checkresult2
		);
	}
	
	public List findByChenkresult3(Object chenkresult3
	) {
		return findByProperty(CHENKRESULT3, chenkresult3
		);
	}
	
	public List findByConfirm(Object confirm
	) {
		return findByProperty(CONFIRM, confirm
		);
	}
	
	public List findByGoodstotal(Object goodstotal
	) {
		return findByProperty(GOODSTOTAL, goodstotal
		);
	}
	
	public List findByInspector(Object inspector
	) {
		return findByProperty(INSPECTOR, inspector
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
	
	public List findBySizecheckaql(Object sizecheckaql
	) {
		return findByProperty(SIZECHECKAQL, sizecheckaql
		);
	}
	
	public List findBySizechecknum(Object sizechecknum
	) {
		return findByProperty(SIZECHECKNUM, sizechecknum
		);
	}
	
	public List findByVischecknum1(Object vischecknum1
	) {
		return findByProperty(VISCHECKNUM1, vischecknum1
		);
	}
	
	public List findByVischecknum2(Object vischecknum2
	) {
		return findByProperty(VISCHECKNUM2, vischecknum2
		);
	}
	

	public List findAll() {
		log.debug("finding all Taxstampingparts instances");
		try {
			String queryString = "from Taxstampingparts";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Taxstampingparts merge(Taxstampingparts detachedInstance) {
        log.debug("merging Taxstampingparts instance");
        try {
            Taxstampingparts result = (Taxstampingparts) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Taxstampingparts instance) {
        log.debug("attaching dirty Taxstampingparts instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Taxstampingparts instance) {
        log.debug("attaching clean Taxstampingparts instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}