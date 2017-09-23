package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Nav nav;
     private Menuimage menuimage;
     private String content;
     private Set menuitems = new HashSet(0);


    // Constructors

    /** default constructor */
    public Menu() {
    }

    
    /** full constructor */
    public Menu(Nav nav, Menuimage menuimage, String content, Set menuitems) {
        this.nav = nav;
        this.menuimage = menuimage;
        this.content = content;
        this.menuitems = menuitems;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Nav getNav() {
        return this.nav;
    }
    
    public void setNav(Nav nav) {
        this.nav = nav;
    }

    public Menuimage getMenuimage() {
        return this.menuimage;
    }
    
    public void setMenuimage(Menuimage menuimage) {
        this.menuimage = menuimage;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Set getMenuitems() {
        return this.menuitems;
    }
    
    public void setMenuitems(Set menuitems) {
        this.menuitems = menuitems;
    }
   








}