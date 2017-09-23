package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Controllerunit entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Controllerunit
  * @author MyEclipse Persistence Tools 
 */

public class ControllerunitDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ControllerunitDAO.class);
		//property constants
	public static final String IP090K = "ip090k";
	public static final String IP690K = "ip690k";
	public static final String PARALLELPORT = "parallelport";
	public static final String PARPORT_U = "parportU";
	public static final String PARPORTETHPOT = "parportethpot";
	public static final String SERIALAPARPORT = "serialaparport";
	public static final String SERIALOPARPORT = "serialoparport";



    
    public void save(Controllerunit transientInstance) {
        log.debug("saving Controllerunit instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Controllerunit persistentInstance) {
        log.debug("deleting Controllerunit instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Controllerunit findById( java.lang.Integer id) {
        log.debug("getting Controllerunit instance with id: " + id);
        try {
            Controllerunit instance = (Controllerunit) getSession()
                    .get("com.fjsdfx.bean.Controllerunit", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Controllerunit instance) {
        log.debug("finding Controllerunit instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Controllerunit")
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
      log.debug("finding Controllerunit instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Controllerunit as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByIp090k(Object ip090k
	) {
		return findByProperty(IP090K, ip090k
		);
	}
	
	public List findByIp690k(Object ip690k
	) {
		return findByProperty(IP690K, ip690k
		);
	}
	
	public List findByParallelport(Object parallelport
	) {
		return findByProperty(PARALLELPORT, parallelport
		);
	}
	
	public List findByParportU(Object parportU
	) {
		return findByProperty(PARPORT_U, parportU
		);
	}
	
	public List findByParportethpot(Object parportethpot
	) {
		return findByProperty(PARPORTETHPOT, parportethpot
		);
	}
	
	public List findBySerialaparport(Object serialaparport
	) {
		return findByProperty(SERIALAPARPORT, serialaparport
		);
	}
	
	public List findBySerialoparport(Object serialoparport
	) {
		return findByProperty(SERIALOPARPORT, serialoparport
		);
	}
	

	public List findAll() {
		log.debug("finding all Controllerunit instances");
		try {
			String queryString = "from Controllerunit";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Controllerunit merge(Controllerunit detachedInstance) {
        log.debug("merging Controllerunit instance");
        try {
            Controllerunit result = (Controllerunit) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Controllerunit instance) {
        log.debug("attaching dirty Controllerunit instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Controllerunit instance) {
        log.debug("attaching clean Controllerunit instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}