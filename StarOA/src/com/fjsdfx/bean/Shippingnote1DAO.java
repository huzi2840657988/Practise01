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
 	* A data access object (DAO) providing persistence and search support for Shippingnote1 entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Shippingnote1
  * @author MyEclipse Persistence Tools 
 */

public class Shippingnote1DAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Shippingnote1DAO.class);
		//property constants
	public static final String EMP_ID = "empId";
	public static final String GOODLIST = "goodlist";
	public static final String SENDED = "sended";
	public static final String SHI1RECEIVE = "shi1receive";
	public static final String SHI1SEND = "shi1send";



    
    public void save(Shippingnote1 transientInstance) {
        log.debug("saving Shippingnote1 instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Shippingnote1 persistentInstance) {
        log.debug("deleting Shippingnote1 instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Shippingnote1 findById( java.lang.Integer id) {
        log.debug("getting Shippingnote1 instance with id: " + id);
        try {
            Shippingnote1 instance = (Shippingnote1) getSession()
                    .get("com.fjsdfx.bean.Shippingnote1", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Shippingnote1 instance) {
        log.debug("finding Shippingnote1 instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Shippingnote1")
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
      log.debug("finding Shippingnote1 instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Shippingnote1 as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByEmpId(Object empId
	) {
		return findByProperty(EMP_ID, empId
		);
	}
	
	public List findByGoodlist(Object goodlist
	) {
		return findByProperty(GOODLIST, goodlist
		);
	}
	
	public List findBySended(Object sended
	) {
		return findByProperty(SENDED, sended
		);
	}
	
	public List findByShi1receive(Object shi1receive
	) {
		return findByProperty(SHI1RECEIVE, shi1receive
		);
	}
	
	public List findByShi1send(Object shi1send
	) {
		return findByProperty(SHI1SEND, shi1send
		);
	}
	

	public List findAll() {
		log.debug("finding all Shippingnote1 instances");
		try {
			String queryString = "from Shippingnote1";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Shippingnote1 merge(Shippingnote1 detachedInstance) {
        log.debug("merging Shippingnote1 instance");
        try {
            Shippingnote1 result = (Shippingnote1) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Shippingnote1 instance) {
        log.debug("attaching dirty Shippingnote1 instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Shippingnote1 instance) {
        log.debug("attaching clean Shippingnote1 instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}