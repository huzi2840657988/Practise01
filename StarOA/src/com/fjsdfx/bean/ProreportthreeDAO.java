package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Proreportthree entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Proreportthree
  * @author MyEclipse Persistence Tools 
 */

public class ProreportthreeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ProreportthreeDAO.class);
		//property constants
	public static final String PASSRATE = "passrate";
	public static final String PROBATCH = "probatch";
	public static final String QUABATCH = "quabatch";
	public static final String UNQBATCH = "unqbatch";
	public static final String UNQCON = "unqcon";



    
    public void save(Proreportthree transientInstance) {
        log.debug("saving Proreportthree instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Proreportthree persistentInstance) {
        log.debug("deleting Proreportthree instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Proreportthree findById( java.lang.Integer id) {
        log.debug("getting Proreportthree instance with id: " + id);
        try {
            Proreportthree instance = (Proreportthree) getSession()
                    .get("com.fjsdfx.bean.Proreportthree", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Proreportthree instance) {
        log.debug("finding Proreportthree instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Proreportthree")
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
      log.debug("finding Proreportthree instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Proreportthree as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPassrate(Object passrate
	) {
		return findByProperty(PASSRATE, passrate
		);
	}
	
	public List findByProbatch(Object probatch
	) {
		return findByProperty(PROBATCH, probatch
		);
	}
	
	public List findByQuabatch(Object quabatch
	) {
		return findByProperty(QUABATCH, quabatch
		);
	}
	
	public List findByUnqbatch(Object unqbatch
	) {
		return findByProperty(UNQBATCH, unqbatch
		);
	}
	
	public List findByUnqcon(Object unqcon
	) {
		return findByProperty(UNQCON, unqcon
		);
	}
	

	public List findAll() {
		log.debug("finding all Proreportthree instances");
		try {
			String queryString = "from Proreportthree";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Proreportthree merge(Proreportthree detachedInstance) {
        log.debug("merging Proreportthree instance");
        try {
            Proreportthree result = (Proreportthree) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Proreportthree instance) {
        log.debug("attaching dirty Proreportthree instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Proreportthree instance) {
        log.debug("attaching clean Proreportthree instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}