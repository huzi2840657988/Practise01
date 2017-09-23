package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Itemtype entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Itemtype
  * @author MyEclipse Persistence Tools 
 */

public class ItemtypeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ItemtypeDAO.class);
		//property constants
	public static final String BONDED_NO = "bondedNo";
	public static final String DESCRIPTION = "description";
	public static final String ISBONDED = "isbonded";
	public static final String MCODE = "mcode";
	public static final String NAME = "name";
	public static final String NOTES = "notes";
	public static final String IS_CON = "isCon";



    
    public void save(Itemtype transientInstance) {
        log.debug("saving Itemtype instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Itemtype persistentInstance) {
        log.debug("deleting Itemtype instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Itemtype findById( java.lang.Integer id) {
        log.debug("getting Itemtype instance with id: " + id);
        try {
            Itemtype instance = (Itemtype) getSession()
                    .get("com.fjsdfx.bean.Itemtype", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Itemtype instance) {
        log.debug("finding Itemtype instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Itemtype")
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
      log.debug("finding Itemtype instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Itemtype as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBondedNo(Object bondedNo
	) {
		return findByProperty(BONDED_NO, bondedNo
		);
	}
	
	public List findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List findByIsbonded(Object isbonded
	) {
		return findByProperty(ISBONDED, isbonded
		);
	}
	
	public List findByMcode(Object mcode
	) {
		return findByProperty(MCODE, mcode
		);
	}
	
	public List findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List findByNotes(Object notes
	) {
		return findByProperty(NOTES, notes
		);
	}
	
	public List findByIsCon(Object isCon
	) {
		return findByProperty(IS_CON, isCon
		);
	}
	

	public List findAll() {
		log.debug("finding all Itemtype instances");
		try {
			String queryString = "from Itemtype";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Itemtype merge(Itemtype detachedInstance) {
        log.debug("merging Itemtype instance");
        try {
            Itemtype result = (Itemtype) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Itemtype instance) {
        log.debug("attaching dirty Itemtype instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Itemtype instance) {
        log.debug("attaching clean Itemtype instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}