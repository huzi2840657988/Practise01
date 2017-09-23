package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Menuitem entity. @author MyEclipse Persistence Tools
 */

public class Menuitem  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Menu menu;
     private String content;
     private Set resourcesForParentMenuId = new HashSet(0);
     private Set resourcesForMenuId = new HashSet(0);


    // Constructors

    /** default constructor */
    public Menuitem() {
    }

    
    /** full constructor */
    public Menuitem(Menu menu, String content, Set resourcesForParentMenuId, Set resourcesForMenuId) {
        this.menu = menu;
        this.content = content;
        this.resourcesForParentMenuId = resourcesForParentMenuId;
        this.resourcesForMenuId = resourcesForMenuId;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Menu getMenu() {
        return this.menu;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Set getResourcesForParentMenuId() {
        return this.resourcesForParentMenuId;
    }
    
    public void setResourcesForParentMenuId(Set resourcesForParentMenuId) {
        this.resourcesForParentMenuId = resourcesForParentMenuId;
    }

    public Set getResourcesForMenuId() {
        return this.resourcesForMenuId;
    }
    
    public void setResourcesForMenuId(Set resourcesForMenuId) {
        this.resourcesForMenuId = resourcesForMenuId;
    }
   








}