package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Resource entity. @author MyEclipse Persistence Tools
 */

public class Resource  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Menuitem menuitemByMenuId;
     private Menuitem menuitemByParentMenuId;
     private String menuCode;
     private String name;
     private String type;
     private String value;
     private Set roleResources = new HashSet(0);


    // Constructors

    /** default constructor */
    public Resource() {
    }

    
    /** full constructor */
    public Resource(Menuitem menuitemByMenuId, Menuitem menuitemByParentMenuId, String menuCode, String name, String type, String value, Set roleResources) {
        this.menuitemByMenuId = menuitemByMenuId;
        this.menuitemByParentMenuId = menuitemByParentMenuId;
        this.menuCode = menuCode;
        this.name = name;
        this.type = type;
        this.value = value;
        this.roleResources = roleResources;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Menuitem getMenuitemByMenuId() {
        return this.menuitemByMenuId;
    }
    
    public void setMenuitemByMenuId(Menuitem menuitemByMenuId) {
        this.menuitemByMenuId = menuitemByMenuId;
    }

    public Menuitem getMenuitemByParentMenuId() {
        return this.menuitemByParentMenuId;
    }
    
    public void setMenuitemByParentMenuId(Menuitem menuitemByParentMenuId) {
        this.menuitemByParentMenuId = menuitemByParentMenuId;
    }

    public String getMenuCode() {
        return this.menuCode;
    }
    
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public Set getRoleResources() {
        return this.roleResources;
    }
    
    public void setRoleResources(Set roleResources) {
        this.roleResources = roleResources;
    }
   








}