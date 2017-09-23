package com.fjsdfx.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Ytrainplan entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Ytrainplan
  * @author MyEclipse Persistence Tools 
 */

public class YtrainplanDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(YtrainplanDAO.class);
		//property constants
	public static final String APPPER = "appper";
	public static final String DRAFTPER = "draftper";
	public static final String SCHDATE1 = "schdate1";
	public static final String SCHDATE2 = "schdate2";
	public static final String SCHDATE3 = "schdate3";
	public static final String SCHDATE4 = "schdate4";
	public static final String TRADDRESS = "traddress";
	public static final String CONTENT = "content";



    
    public void save(Ytrainplan transientInstance) {
        log.debug("saving Ytrainplan instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Ytrainplan persistentInstance) {
        log.debug("deleting Ytrainplan instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Ytrainplan findById( java.lang.Integer id) {
        log.debug("getting Ytrainplan instance with id: " + id);
        try {
            Ytrainplan instance = (Ytrainplan) getSession()
                    .get("com.fjsdfx.bean.Ytrainplan", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Ytrainplan instance) {
        log.debug("finding Ytrainplan instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Ytrainplan")
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
      log.debug("finding Ytrainplan instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Ytrainplan as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByAppper(Object appper
	) {
		return findByProperty(APPPER, appper
		);
	}
	
	public List findByDraftper(Object draftper
	) {
		return findByProperty(DRAFTPER, draftper
		);
	}
	
	public List findBySchdate1(Object schdate1
	) {
		return findByProperty(SCHDATE1, schdate1
		);
	}
	
	public List findBySchdate2(Object schdate2
	) {
		return findByProperty(SCHDATE2, schdate2
		);
	}
	
	public List findBySchdate3(Object schdate3
	) {
		return findByProperty(SCHDATE3, schdate3
		);
	}
	
	public List findBySchdate4(Object schdate4
	) {
		return findByProperty(SCHDATE4, schdate4
		);
	}
	
	public List findByTraddress(Object traddress
	) {
		return findByProperty(TRADDRESS, traddress
		);
	}
	
	public List findByContent(Object content
	) {
		return findByProperty(CONTENT, content
		);
	}
	

	public List findAll() {
		log.debug("finding all Ytrainplan instances");
		try {
			String queryString = "from Ytrainplan";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Ytrainplan merge(Ytrainplan detachedInstance) {
        log.debug("merging Ytrainplan instance");
        try {
            Ytrainplan result = (Ytrainplan) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Ytrainplan instance) {
        log.debug("attaching dirty Ytrainplan instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Ytrainplan instance) {
        log.debug("attaching clean Ytrainplan instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}