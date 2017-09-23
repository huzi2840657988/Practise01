package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Shi1good entity. @author MyEclipse Persistence Tools
 */

public class Shi1good  implements java.io.Serializable {


    // Fields    

     private Integer shi1gid;
     private Shippingnote1 shippingnote1;
     private Itemtype itemtype;
     private Integer shi1no;
     private String shi1unit;
     private String shinote;
     private String shitime;
     private String tas;
     private String tax;
     private Set taxstampingpartses = new HashSet(0);
     private Set taxboards = new HashSet(0);


    // Constructors

    /** default constructor */
    public Shi1good() {
    }

    
    /** full constructor */
    public Shi1good(Shippingnote1 shippingnote1, Itemtype itemtype, Integer shi1no, String shi1unit, String shinote, String shitime, String tas, String tax, Set taxstampingpartses, Set taxboards) {
        this.shippingnote1 = shippingnote1;
        this.itemtype = itemtype;
        this.shi1no = shi1no;
        this.shi1unit = shi1unit;
        this.shinote = shinote;
        this.shitime = shitime;
        this.tas = tas;
        this.tax = tax;
        this.taxstampingpartses = taxstampingpartses;
        this.taxboards = taxboards;
    }

   
    // Property accessors

    public Integer getShi1gid() {
        return this.shi1gid;
    }
    
    public void setShi1gid(Integer shi1gid) {
        this.shi1gid = shi1gid;
    }

    public Shippingnote1 getShippingnote1() {
        return this.shippingnote1;
    }
    
    public void setShippingnote1(Shippingnote1 shippingnote1) {
        this.shippingnote1 = shippingnote1;
    }

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getShi1no() {
        return this.shi1no;
    }
    
    public void setShi1no(Integer shi1no) {
        this.shi1no = shi1no;
    }

    public String getShi1unit() {
        return this.shi1unit;
    }
    
    public void setShi1unit(String shi1unit) {
        this.shi1unit = shi1unit;
    }

    public String getShinote() {
        return this.shinote;
    }
    
    public void setShinote(String shinote) {
        this.shinote = shinote;
    }

    public String getShitime() {
        return this.shitime;
    }
    
    public void setShitime(String shitime) {
        this.shitime = shitime;
    }

    public String getTas() {
        return this.tas;
    }
    
    public void setTas(String tas) {
        this.tas = tas;
    }

    public String getTax() {
        return this.tax;
    }
    
    public void setTax(String tax) {
        this.tax = tax;
    }

    public Set getTaxstampingpartses() {
        return this.taxstampingpartses;
    }
    
    public void setTaxstampingpartses(Set taxstampingpartses) {
        this.taxstampingpartses = taxstampingpartses;
    }

    public Set getTaxboards() {
        return this.taxboards;
    }
    
    public void setTaxboards(Set taxboards) {
        this.taxboards = taxboards;
    }
   








}