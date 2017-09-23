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
 	* A data access object (DAO) providing persistence and search support for Purorder entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Purorder
  * @author MyEclipse Persistence Tools 
 */

public class PurorderDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(PurorderDAO.class);
		//property constants
	public static final String FIRM = "firm";
	public static final String PNO = "pno";
	public static final String PNOTE = "pnote";
	public static final String PURCONFIRM = "purconfirm";
	public static final String SREP = "srep";
	public static final String ENTER = "enter";



    
    public void save(Purorder transientInstance) {
        log.debug("saving Purorder instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Purorder persistentInstance) {
        log.debug("deleting Purorder instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Purorder findById( java.lang.Integer id) {
        log.debug("getting Purorder instance with id: " + id);
        try {
            Purorder instance = (Purorder) getSession()
                    .get("com.fjsdfx.bean.Purorder", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Purorder instance) {
        log.debug("finding Purorder instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Purorder")
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
      log.debug("finding Purorder instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Purorder as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByFirm(Object firm
	) {
		return findByProperty(FIRM, firm
		);
	}
	
	public List findByPno(Object pno
	) {
		return findByProperty(PNO, pno
		);
	}
	
	public List findByPnote(Object pnote
	) {
		return findByProperty(PNOTE, pnote
		);
	}
	
	public List findByPurconfirm(Object purconfirm
	) {
		return findByProperty(PURCONFIRM, purconfirm
		);
	}
	
	public List findBySrep(Object srep
	) {
		return findByProperty(SREP, srep
		);
	}
	
	public List findByEnter(Object enter
	) {
		return findByProperty(ENTER, enter
		);
	}
	

	public List findAll() {
		log.debug("finding all Purorder instances");
		try {
			String queryString = "from Purorder";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Purorder merge(Purorder detachedInstance) {
        log.debug("merging Purorder instance");
        try {
            Purorder result = (Purorder) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Purorder instance) {
        log.debug("attaching dirty Purorder instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Purorder instance) {
        log.debug("attaching clean Purorder instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}