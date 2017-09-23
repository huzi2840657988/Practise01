package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Annoucement entity. @author MyEclipse Persistence Tools
 */

public class Annoucement  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String content;
     private Timestamp date;
     private String title;


    // Constructors

    /** default constructor */
    public Annoucement() {
    }

    
    /** full constructor */
    public Annoucement(String content, Timestamp date, String title) {
        this.content = content;
        this.date = date;
        this.title = title;
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

    public Timestamp getDate() {
        return this.date;
    }
    
    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
   








}