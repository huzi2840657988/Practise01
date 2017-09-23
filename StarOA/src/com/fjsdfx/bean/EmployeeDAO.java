package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Employee entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.fjsdfx.bean.Employee
  * @author MyEclipse Persistence Tools 
 */

public class EmployeeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(EmployeeDAO.class);
		//property constants
	public static final String DEFAULT_MENU = "defaultMenu";
	public static final String DORMITORY = "dormitory";
	public static final String EDUCATION = "education";
	public static final String EMP_NAME = "empName";
	public static final String EMP_SN = "empSn";
	public static final String ID_CARD_NO = "idCardNo";
	public static final String JOB_TITLE = "jobTitle";
	public static final String MAR_STATUS = "marStatus";
	public static final String NATURE = "nature";
	public static final String PHONE_NO = "phoneNo";
	public static final String PIC = "pic";
	public static final String POLITICAL = "political";
	public static final String SEX = "sex";
	public static final String STATUS = "status";
	public static final String TR_STATUS = "trStatus";
	public static final String ISDEL = "isdel";



    
    public void save(Employee transientInstance) {
        log.debug("saving Employee instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Employee persistentInstance) {
        log.debug("deleting Employee instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Employee findById( java.lang.Integer id) {
        log.debug("getting Employee instance with id: " + id);
        try {
            Employee instance = (Employee) getSession()
                    .get("com.fjsdfx.bean.Employee", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Employee instance) {
        log.debug("finding Employee instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.fjsdfx.bean.Employee")
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
      log.debug("finding Employee instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Employee as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByDefaultMenu(Object defaultMenu
	) {
		return findByProperty(DEFAULT_MENU, defaultMenu
		);
	}
	
	public List findByDormitory(Object dormitory
	) {
		return findByProperty(DORMITORY, dormitory
		);
	}
	
	public List findByEducation(Object education
	) {
		return findByProperty(EDUCATION, education
		);
	}
	
	public List findByEmpName(Object empName
	) {
		return findByProperty(EMP_NAME, empName
		);
	}
	
	public List findByEmpSn(Object empSn
	) {
		return findByProperty(EMP_SN, empSn
		);
	}
	
	public List findByIdCardNo(Object idCardNo
	) {
		return findByProperty(ID_CARD_NO, idCardNo
		);
	}
	
	public List findByJobTitle(Object jobTitle
	) {
		return findByProperty(JOB_TITLE, jobTitle
		);
	}
	
	public List findByMarStatus(Object marStatus
	) {
		return findByProperty(MAR_STATUS, marStatus
		);
	}
	
	public List findByNature(Object nature
	) {
		return findByProperty(NATURE, nature
		);
	}
	
	public List findByPhoneNo(Object phoneNo
	) {
		return findByProperty(PHONE_NO, phoneNo
		);
	}
	
	public List findByPic(Object pic
	) {
		return findByProperty(PIC, pic
		);
	}
	
	public List findByPolitical(Object political
	) {
		return findByProperty(POLITICAL, political
		);
	}
	
	public List findBySex(Object sex
	) {
		return findByProperty(SEX, sex
		);
	}
	
	public List findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List findByTrStatus(Object trStatus
	) {
		return findByProperty(TR_STATUS, trStatus
		);
	}
	
	public List findByIsdel(Object isdel
	) {
		return findByProperty(ISDEL, isdel
		);
	}
	

	public List findAll() {
		log.debug("finding all Employee instances");
		try {
			String queryString = "from Employee";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Employee merge(Employee detachedInstance) {
        log.debug("merging Employee instance");
        try {
            Employee result = (Employee) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Employee instance) {
        log.debug("attaching dirty Employee instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Employee instance) {
        log.debug("attaching clean Employee instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}