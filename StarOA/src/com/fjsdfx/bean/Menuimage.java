package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Menuimage entity. @author MyEclipse Persistence Tools
 */

public class Menuimage  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String url;
     private Set menus = new HashSet(0);


    // Constructors

    /** default constructor */
    public Menuimage() {
    }

    
    /** full constructor */
    public Menuimage(String url, Set menus) {
        this.url = url;
        this.menus = menus;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public Set getMenus() {
        return this.menus;
    }
    
    public void setMenus(Set menus) {
        this.menus = menus;
    }
   








}