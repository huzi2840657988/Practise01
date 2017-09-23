package com.fjsdfx.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Quaprolist entity. @author MyEclipse Persistence Tools
 */

public class Quaprolist  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Supplierinfo supplierinfo;
     private String quaprolistAsslevel;
     private String brand;
     private String note;
     private Date time;
     private Set purorders = new HashSet(0);
     private Set spares = new HashSet(0);
     private Set auxmaterials = new HashSet(0);
     private Set requisitionses = new HashSet(0);
     private Set feedexamines = new HashSet(0);


    // Constructors

    /** default constructor */
    public Quaprolist() {
    }

    
    /** full constructor */
    public Quaprolist(Supplierinfo supplierinfo, String quaprolistAsslevel, String brand, String note, Date time, Set purorders, Set spares, Set auxmaterials, Set requisitionses, Set feedexamines) {
        this.supplierinfo = supplierinfo;
        this.quaprolistAsslevel = quaprolistAsslevel;
        this.brand = brand;
        this.note = note;
        this.time = time;
        this.purorders = purorders;
        this.spares = spares;
        this.auxmaterials = auxmaterials;
        this.requisitionses = requisitionses;
        this.feedexamines = feedexamines;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Supplierinfo getSupplierinfo() {
        return this.supplierinfo;
    }
    
    public void setSupplierinfo(Supplierinfo supplierinfo) {
        this.supplierinfo = supplierinfo;
    }

    public String getQuaprolistAsslevel() {
        return this.quaprolistAsslevel;
    }
    
    public void setQuaprolistAsslevel(String quaprolistAsslevel) {
        this.quaprolistAsslevel = quaprolistAsslevel;
    }

    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }

    public Set getPurorders() {
        return this.purorders;
    }
    
    public void setPurorders(Set purorders) {
        this.purorders = purorders;
    }

    public Set getSpares() {
        return this.spares;
    }
    
    public void setSpares(Set spares) {
        this.spares = spares;
    }

    public Set getAuxmaterials() {
        return this.auxmaterials;
    }
    
    public void setAuxmaterials(Set auxmaterials) {
        this.auxmaterials = auxmaterials;
    }

    public Set getRequisitionses() {
        return this.requisitionses;
    }
    
    public void setRequisitionses(Set requisitionses) {
        this.requisitionses = requisitionses;
    }

    public Set getFeedexamines() {
        return this.feedexamines;
    }
    
    public void setFeedexamines(Set feedexamines) {
        this.feedexamines = feedexamines;
    }
   








}