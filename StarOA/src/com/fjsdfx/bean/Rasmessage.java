package com.fjsdfx.bean;

import java.sql.Timestamp;


/**
 * Rasmessage entity. @author MyEclipse Persistence Tools
 */

public class Rasmessage  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private User userByRper;
     private User userBySper;
     private String accessories;
     private String content;
     private String fla1;
     private String rasstatus;
     private Timestamp rastime;
     private String title;
     private String fla2;
     private String fla3;


    // Constructors

    /** default constructor */
    public Rasmessage() {
    }

	/** minimal constructor */
    public Rasmessage(User userByRper, User userBySper) {
        this.userByRper = userByRper;
        this.userBySper = userBySper;
    }
    
    /** full constructor */
    public Rasmessage(User userByRper, User userBySper, String accessories, String content, String fla1, String rasstatus, Timestamp rastime, String title, String fla2, String fla3) {
        this.userByRper = userByRper;
        this.userBySper = userBySper;
        this.accessories = accessories;
        this.content = content;
        this.fla1 = fla1;
        this.rasstatus = rasstatus;
        this.rastime = rastime;
        this.title = title;
        this.fla2 = fla2;
        this.fla3 = fla3;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserByRper() {
        return this.userByRper;
    }
    
    public void setUserByRper(User userByRper) {
        this.userByRper = userByRper;
    }

    public User getUserBySper() {
        return this.userBySper;
    }
    
    public void setUserBySper(User userBySper) {
        this.userBySper = userBySper;
    }

    public String getAccessories() {
        return this.accessories;
    }
    
    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getFla1() {
        return this.fla1;
    }
    
    public void setFla1(String fla1) {
        this.fla1 = fla1;
    }

    public String getRasstatus() {
        return this.rasstatus;
    }
    
    public void setRasstatus(String rasstatus) {
        this.rasstatus = rasstatus;
    }

    public Timestamp getRastime() {
        return this.rastime;
    }
    
    public void setRastime(Timestamp rastime) {
        this.rastime = rastime;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getFla2() {
        return this.fla2;
    }
    
    public void setFla2(String fla2) {
        this.fla2 = fla2;
    }

    public String getFla3() {
        return this.fla3;
    }
    
    public void setFla3(String fla3) {
        this.fla3 = fla3;
    }
   








}