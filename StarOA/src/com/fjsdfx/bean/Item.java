package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Item entity. @author MyEclipse Persistence Tools
 */

public class Item  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Itemtype itemtype;
     private String description;
     private String itemCategory;
     private String name;
     private String notes;
     private Set purgoods = new HashSet(0);
     private Set resgoods = new HashSet(0);
     private Set itemtypes = new HashSet(0);


    // Constructors

    /** default constructor */
    public Item() {
    }

    
    /** full constructor */
    public Item(Itemtype itemtype, String description, String itemCategory, String name, String notes, Set purgoods, Set resgoods, Set itemtypes) {
        this.itemtype = itemtype;
        this.description = description;
        this.itemCategory = itemCategory;
        this.name = name;
        this.notes = notes;
        this.purgoods = purgoods;
        this.resgoods = resgoods;
        this.itemtypes = itemtypes;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemCategory() {
        return this.itemCategory;
    }
    
    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set getPurgoods() {
        return this.purgoods;
    }
    
    public void setPurgoods(Set purgoods) {
        this.purgoods = purgoods;
    }

    public Set getResgoods() {
        return this.resgoods;
    }
    
    public void setResgoods(Set resgoods) {
        this.resgoods = resgoods;
    }

    public Set getItemtypes() {
        return this.itemtypes;
    }
    
    public void setItemtypes(Set itemtypes) {
        this.itemtypes = itemtypes;
    }
   








}