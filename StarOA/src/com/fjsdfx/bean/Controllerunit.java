package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Controllerunit entity. @author MyEclipse Persistence Tools
 */

public class Controllerunit  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String ip090k;
     private String ip690k;
     private String parallelport;
     private String parportU;
     private String parportethpot;
     private String serialaparport;
     private String serialoparport;
     private Set itemtypeControllerunits = new HashSet(0);
     private Set itemtypes = new HashSet(0);


    // Constructors

    /** default constructor */
    public Controllerunit() {
    }

    
    /** full constructor */
    public Controllerunit(String ip090k, String ip690k, String parallelport, String parportU, String parportethpot, String serialaparport, String serialoparport, Set itemtypeControllerunits, Set itemtypes) {
        this.ip090k = ip090k;
        this.ip690k = ip690k;
        this.parallelport = parallelport;
        this.parportU = parportU;
        this.parportethpot = parportethpot;
        this.serialaparport = serialaparport;
        this.serialoparport = serialoparport;
        this.itemtypeControllerunits = itemtypeControllerunits;
        this.itemtypes = itemtypes;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp090k() {
        return this.ip090k;
    }
    
    public void setIp090k(String ip090k) {
        this.ip090k = ip090k;
    }

    public String getIp690k() {
        return this.ip690k;
    }
    
    public void setIp690k(String ip690k) {
        this.ip690k = ip690k;
    }

    public String getParallelport() {
        return this.parallelport;
    }
    
    public void setParallelport(String parallelport) {
        this.parallelport = parallelport;
    }

    public String getParportU() {
        return this.parportU;
    }
    
    public void setParportU(String parportU) {
        this.parportU = parportU;
    }

    public String getParportethpot() {
        return this.parportethpot;
    }
    
    public void setParportethpot(String parportethpot) {
        this.parportethpot = parportethpot;
    }

    public String getSerialaparport() {
        return this.serialaparport;
    }
    
    public void setSerialaparport(String serialaparport) {
        this.serialaparport = serialaparport;
    }

    public String getSerialoparport() {
        return this.serialoparport;
    }
    
    public void setSerialoparport(String serialoparport) {
        this.serialoparport = serialoparport;
    }

    public Set getItemtypeControllerunits() {
        return this.itemtypeControllerunits;
    }
    
    public void setItemtypeControllerunits(Set itemtypeControllerunits) {
        this.itemtypeControllerunits = itemtypeControllerunits;
    }

    public Set getItemtypes() {
        return this.itemtypes;
    }
    
    public void setItemtypes(Set itemtypes) {
        this.itemtypes = itemtypes;
    }
   








}