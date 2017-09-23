package com.fjsdfx.bean;



/**
 * Ytrainplan entity. @author MyEclipse Persistence Tools
 */

public class Ytrainplan  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Department departmentByDptId;
     private Yplanname yplannameByYplannameId;
     private Yplanname yplannameByYplanname;
     private Department departmentByWithf;
     private Training training;
     private String appper;
     private String draftper;
     private String schdate1;
     private String schdate2;
     private String schdate3;
     private String schdate4;
     private String traddress;
     private String content;


    // Constructors

    /** default constructor */
    public Ytrainplan() {
    }

	/** minimal constructor */
    public Ytrainplan(Department departmentByDptId, Yplanname yplannameByYplanname, Department departmentByWithf, Training training) {
        this.departmentByDptId = departmentByDptId;
        this.yplannameByYplanname = yplannameByYplanname;
        this.departmentByWithf = departmentByWithf;
        this.training = training;
    }
    
    /** full constructor */
    public Ytrainplan(Department departmentByDptId, Yplanname yplannameByYplannameId, Yplanname yplannameByYplanname, Department departmentByWithf, Training training, String appper, String draftper, String schdate1, String schdate2, String schdate3, String schdate4, String traddress, String content) {
        this.departmentByDptId = departmentByDptId;
        this.yplannameByYplannameId = yplannameByYplannameId;
        this.yplannameByYplanname = yplannameByYplanname;
        this.departmentByWithf = departmentByWithf;
        this.training = training;
        this.appper = appper;
        this.draftper = draftper;
        this.schdate1 = schdate1;
        this.schdate2 = schdate2;
        this.schdate3 = schdate3;
        this.schdate4 = schdate4;
        this.traddress = traddress;
        this.content = content;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Department getDepartmentByDptId() {
        return this.departmentByDptId;
    }
    
    public void setDepartmentByDptId(Department departmentByDptId) {
        this.departmentByDptId = departmentByDptId;
    }

    public Yplanname getYplannameByYplannameId() {
        return this.yplannameByYplannameId;
    }
    
    public void setYplannameByYplannameId(Yplanname yplannameByYplannameId) {
        this.yplannameByYplannameId = yplannameByYplannameId;
    }

    public Yplanname getYplannameByYplanname() {
        return this.yplannameByYplanname;
    }
    
    public void setYplannameByYplanname(Yplanname yplannameByYplanname) {
        this.yplannameByYplanname = yplannameByYplanname;
    }

    public Department getDepartmentByWithf() {
        return this.departmentByWithf;
    }
    
    public void setDepartmentByWithf(Department departmentByWithf) {
        this.departmentByWithf = departmentByWithf;
    }

    public Training getTraining() {
        return this.training;
    }
    
    public void setTraining(Training training) {
        this.training = training;
    }

    public String getAppper() {
        return this.appper;
    }
    
    public void setAppper(String appper) {
        this.appper = appper;
    }

    public String getDraftper() {
        return this.draftper;
    }
    
    public void setDraftper(String draftper) {
        this.draftper = draftper;
    }

    public String getSchdate1() {
        return this.schdate1;
    }
    
    public void setSchdate1(String schdate1) {
        this.schdate1 = schdate1;
    }

    public String getSchdate2() {
        return this.schdate2;
    }
    
    public void setSchdate2(String schdate2) {
        this.schdate2 = schdate2;
    }

    public String getSchdate3() {
        return this.schdate3;
    }
    
    public void setSchdate3(String schdate3) {
        this.schdate3 = schdate3;
    }

    public String getSchdate4() {
        return this.schdate4;
    }
    
    public void setSchdate4(String schdate4) {
        this.schdate4 = schdate4;
    }

    public String getTraddress() {
        return this.traddress;
    }
    
    public void setTraddress(String traddress) {
        this.traddress = traddress;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
   








}