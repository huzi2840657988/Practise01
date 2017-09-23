package com.fjsdfx.bean;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Item entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Item
  * @author MyEclipse Persistence Tools 
 */

public class ItemDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ItemDAO.class);
		//property constants
	public static final String DESCRIPTION = "description";
	public static final String ITEM_CATEGORY = "itemCategory";
	public static final String NAME = "name";
	public static final String NOTES = "notes";



    
    public void save(Item transientInstance) {
        log.debug("saving Item instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Item persistentInstance) {
        log.debug("deleting Item instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Item findById( java.lang.Integer id) {
        log.debug("getting Item instance with id: " + id);
        try {
            Item instance = (Item) getSession()
                    .get("com.fjsdfx.bean.Item", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Item instance) {
        log.debug("finding Item instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Item")
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
      log.debug("finding Item instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Item as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List findByItemCategory(Object itemCategory
	) {
		return findByProperty(ITEM_CATEGORY, itemCategory
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
	

	public List findAll() {
		log.debug("finding all Item instances");
		try {
			String queryString = "from Item";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Item merge(Item detachedInstance) {
        log.debug("merging Item instance");
        try {
            Item result = (Item) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Item instance) {
        log.debug("attaching dirty Item instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Item instance) {
        log.debug("attaching clean Item instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}