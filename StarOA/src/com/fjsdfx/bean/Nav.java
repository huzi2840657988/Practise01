package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Nav entity. @author MyEclipse Persistence Tools
 */

public class Nav  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String content;
     private Set menus = new HashSet(0);


    // Constructors

    /** default constructor */
    public Nav() {
    }

    
    /** full constructor */
    public Nav(String content, Set menus) {
        this.content = content;
        this.menus = menus;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Set getMenus() {
        return this.menus;
    }
    
    public void setMenus(Set menus) {
        this.menus = menus;
    }
   








}