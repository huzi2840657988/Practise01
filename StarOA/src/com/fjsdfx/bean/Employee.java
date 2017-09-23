package com.fjsdfx.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee  implements java.io.Serializable {


    // Fields    

     private Integer empId;
     private Department department;
     private Training training;
     private Jobs jobs;
     private Timestamp birdate;
     private String defaultMenu;
     private String dormitory;
     private Timestamp edate;
     private String education;
     private String empName;
     private String empSn;
     private String idCardNo;
     private String jobTitle;
     private Timestamp ldate;
     private String marStatus;
     private String nature;
     private String phoneNo;
     private String pic;
     private String political;
     private String sex;
     private String status;
     private String trStatus;
     private Integer isdel;
     private Set supsendmsForProper = new HashSet(0);
     private Set variationsForUmanager = new HashSet(0);
     private Set empTrains = new HashSet(0);
     private Set preparationsForPleaderEmpId = new HashSet(0);
     private Set changefsForExSign = new HashSet(0);
     private Set trackingtestsForTryEmpId = new HashSet(0);
     private Set requisitionsesForDpmanagerEmpId = new HashSet(0);
     private Set vargoodsForCheckNum = new HashSet(0);
     private Set requisitionsesForBuyerEmpId = new HashSet(0);
     private Set trackingtestsForExa1EmpId = new HashSet(0);
     private Set supidentifiedsForQuaresperEmpId = new HashSet(0);
     private Set taxboardsForInspectorEmp = new HashSet(0);
     private Set supidentifiedsForPurresperEmpId = new HashSet(0);
     private Set accreditions = new HashSet(0);
     private Set discardreviewfs = new HashSet(0);
     private Set changefsForWsSign = new HashSet(0);
     private Set warehousesForWinpectorId = new HashSet(0);
     private Set shippingnote1s = new HashSet(0);
     private Set samidentifiedsForChargeEmpId = new HashSet(0);
     private Set testnotesesForPurperEmpId = new HashSet(0);
     private Set samidentifiedsForHangdingEmpId = new HashSet(0);
     private Set supidentifiedsForRecperEmpId = new HashSet(0);
     private Set requisitionsForDptId = new HashSet(0);
     private Set requisitionsForPinkId = new HashSet(0);
     private Set returnedsForSignatory = new HashSet(0);
     private Set purordersForAuditEmpId = new HashSet(0);
     private Set requisitionsesForCmanagerEmpId = new HashSet(0);
     private Set rewindersForSpectorId = new HashSet(0);
     private Set trackingtestsForExa2EmpId = new HashSet(0);
     private Set prschecksForEaudit = new HashSet(0);
     private Set testnotesesForQuamanperEmpId = new HashSet(0);
     private Set rewindersForWhId = new HashSet(0);
     private Set shortmsForRper = new HashSet(0);
     private Set vargoodsForCjCheck = new HashSet(0);
     private Set testnotesesForPurmanperEmpId = new HashSet(0);
     private Set samidentifiedsForResperEmpId = new HashSet(0);
     private Set taxstampingpartsesForRperEmp = new HashSet(0);
     private Set taxstampingpartsesForInspectorEmp = new HashSet(0);
     private Set taxboardsForQuaconfirmEmp = new HashSet(0);
     private Set supsendmsForWsper = new HashSet(0);
     private Set prschecksForEedit = new HashSet(0);
     private Set shortmsForWsmanager = new HashSet(0);
     private Set unqualifiedsForRecperEmp = new HashSet(0);
     private Set supidentifiedsForReqperEmpId = new HashSet(0);
     private Set trackingtestsForWsr1EmpId = new HashSet(0);
     private Set unqualifiedsForRebperEmp = new HashSet(0);
     private Set employeeraps = new HashSet(0);
     private Set unqualifiedsForReportperEmp = new HashSet(0);
     private Set supsendmsForWhmanager = new HashSet(0);
     private Set supidentifiedsForPurperEmpId = new HashSet(0);
     private Set preparationsForPersonEmpId = new HashSet(0);
     private Set supidentifiedsForManperEmpId = new HashSet(0);
     private Set testnotesesForExaminerEmpId = new HashSet(0);
     private Set discardreviewts = new HashSet(0);
     private Set taxboardsForRperEmp = new HashSet(0);
     private Set requisitionsesForDmanagerEmpId = new HashSet(0);
     private Set warehousesForWhId = new HashSet(0);
     private Set shinote2sForWper = new HashSet(0);
     private Set prschecksForEapprove = new HashSet(0);
     private Set feedexaminesForWhId = new HashSet(0);
     private Set feedexaminesForSpecId = new HashSet(0);
     private Set returnedsForQualitymanager = new HashSet(0);
     private Set returnedsForSignper = new HashSet(0);
     private Set changefsForMenuMake = new HashSet(0);
     private Set testnotesesForQuaperEmpId = new HashSet(0);
     private Set shinote2sForDelper = new HashSet(0);
     private Set purordersForHandingEmpId = new HashSet(0);
     private Set variationsForAppper = new HashSet(0);
     private Set unqualifiedsForRecheckperEmp = new HashSet(0);
     private Set discardverifies = new HashSet(0);
     private Set trackingtestsForWsr2EmpId = new HashSet(0);
     private Set taxstampingpartsesForQuaconfirmEmp = new HashSet(0);
     private Set shinote2sForMtab = new HashSet(0);
     private Set supidentifiedsForQuaperEmpId = new HashSet(0);
     private Set feedexaminesForWh2Id = new HashSet(0);
     private Set supplierinfosForWperEmpId = new HashSet(0);
     private Set purordersForApprovalEmpId = new HashSet(0);
     private Set supplierinfosForCheckperEmpId = new HashSet(0);
     private Set samidentifiedsForExamineEmpId = new HashSet(0);
     private Set changefsForWhSign = new HashSet(0);
     private Set rewindersForBuyerId = new HashSet(0);
     private Set shinote2sForWhmgetEmp = new HashSet(0);
     private Set feedexaminesForBuyerId = new HashSet(0);
     private Set discardreviewses = new HashSet(0);
     private Set users = new HashSet(0);
     private Set unqualifiedsForInspectorEmp = new HashSet(0);
     private Set trackingtestsForManEmpId = new HashSet(0);
     private Set requisitionsForConfId = new HashSet(0);
     private Set requisitionsesForBmanagerEmpId = new HashSet(0);


    // Constructors

    /** default constructor */
    public Employee() {
    }

    
    /** full constructor */
    public Employee(Department department, Training training, Jobs jobs, Timestamp birdate, String defaultMenu, String dormitory, Timestamp edate, String education, String empName, String empSn, String idCardNo, String jobTitle, Timestamp ldate, String marStatus, String nature, String phoneNo, String pic, String political, String sex, String status, String trStatus, Integer isdel, Set supsendmsForProper, Set variationsForUmanager, Set empTrains, Set preparationsForPleaderEmpId, Set changefsForExSign, Set trackingtestsForTryEmpId, Set requisitionsesForDpmanagerEmpId, Set vargoodsForCheckNum, Set requisitionsesForBuyerEmpId, Set trackingtestsForExa1EmpId, Set supidentifiedsForQuaresperEmpId, Set taxboardsForInspectorEmp, Set supidentifiedsForPurresperEmpId, Set accreditions, Set discardreviewfs, Set changefsForWsSign, Set warehousesForWinpectorId, Set shippingnote1s, Set samidentifiedsForChargeEmpId, Set testnotesesForPurperEmpId, Set samidentifiedsForHangdingEmpId, Set supidentifiedsForRecperEmpId, Set requisitionsForDptId, Set requisitionsForPinkId, Set returnedsForSignatory, Set purordersForAuditEmpId, Set requisitionsesForCmanagerEmpId, Set rewindersForSpectorId, Set trackingtestsForExa2EmpId, Set prschecksForEaudit, Set testnotesesForQuamanperEmpId, Set rewindersForWhId, Set shortmsForRper, Set vargoodsForCjCheck, Set testnotesesForPurmanperEmpId, Set samidentifiedsForResperEmpId, Set taxstampingpartsesForRperEmp, Set taxstampingpartsesForInspectorEmp, Set taxboardsForQuaconfirmEmp, Set supsendmsForWsper, Set prschecksForEedit, Set shortmsForWsmanager, Set unqualifiedsForRecperEmp, Set supidentifiedsForReqperEmpId, Set trackingtestsForWsr1EmpId, Set unqualifiedsForRebperEmp, Set employeeraps, Set unqualifiedsForReportperEmp, Set supsendmsForWhmanager, Set supidentifiedsForPurperEmpId, Set preparationsForPersonEmpId, Set supidentifiedsForManperEmpId, Set testnotesesForExaminerEmpId, Set discardreviewts, Set taxboardsForRperEmp, Set requisitionsesForDmanagerEmpId, Set warehousesForWhId, Set shinote2sForWper, Set prschecksForEapprove, Set feedexaminesForWhId, Set feedexaminesForSpecId, Set returnedsForQualitymanager, Set returnedsForSignper, Set changefsForMenuMake, Set testnotesesForQuaperEmpId, Set shinote2sForDelper, Set purordersForHandingEmpId, Set variationsForAppper, Set unqualifiedsForRecheckperEmp, Set discardverifies, Set trackingtestsForWsr2EmpId, Set taxstampingpartsesForQuaconfirmEmp, Set shinote2sForMtab, Set supidentifiedsForQuaperEmpId, Set feedexaminesForWh2Id, Set supplierinfosForWperEmpId, Set purordersForApprovalEmpId, Set supplierinfosForCheckperEmpId, Set samidentifiedsForExamineEmpId, Set changefsForWhSign, Set rewindersForBuyerId, Set shinote2sForWhmgetEmp, Set feedexaminesForBuyerId, Set discardreviewses, Set users, Set unqualifiedsForInspectorEmp, Set trackingtestsForManEmpId, Set requisitionsForConfId, Set requisitionsesForBmanagerEmpId) {
        this.department = department;
        this.training = training;
        this.jobs = jobs;
        this.birdate = birdate;
        this.defaultMenu = defaultMenu;
        this.dormitory = dormitory;
        this.edate = edate;
        this.education = education;
        this.empName = empName;
        this.empSn = empSn;
        this.idCardNo = idCardNo;
        this.jobTitle = jobTitle;
        this.ldate = ldate;
        this.marStatus = marStatus;
        this.nature = nature;
        this.phoneNo = phoneNo;
        this.pic = pic;
        this.political = political;
        this.sex = sex;
        this.status = status;
        this.trStatus = trStatus;
        this.isdel = isdel;
        this.supsendmsForProper = supsendmsForProper;
        this.variationsForUmanager = variationsForUmanager;
        this.empTrains = empTrains;
        this.preparationsForPleaderEmpId = preparationsForPleaderEmpId;
        this.changefsForExSign = changefsForExSign;
        this.trackingtestsForTryEmpId = trackingtestsForTryEmpId;
        this.requisitionsesForDpmanagerEmpId = requisitionsesForDpmanagerEmpId;
        this.vargoodsForCheckNum = vargoodsForCheckNum;
        this.requisitionsesForBuyerEmpId = requisitionsesForBuyerEmpId;
        this.trackingtestsForExa1EmpId = trackingtestsForExa1EmpId;
        this.supidentifiedsForQuaresperEmpId = supidentifiedsForQuaresperEmpId;
        this.taxboardsForInspectorEmp = taxboardsForInspectorEmp;
        this.supidentifiedsForPurresperEmpId = supidentifiedsForPurresperEmpId;
        this.accreditions = accreditions;
        this.discardreviewfs = discardreviewfs;
        this.changefsForWsSign = changefsForWsSign;
        this.warehousesForWinpectorId = warehousesForWinpectorId;
        this.shippingnote1s = shippingnote1s;
        this.samidentifiedsForChargeEmpId = samidentifiedsForChargeEmpId;
        this.testnotesesForPurperEmpId = testnotesesForPurperEmpId;
        this.samidentifiedsForHangdingEmpId = samidentifiedsForHangdingEmpId;
        this.supidentifiedsForRecperEmpId = supidentifiedsForRecperEmpId;
        this.requisitionsForDptId = requisitionsForDptId;
        this.requisitionsForPinkId = requisitionsForPinkId;
        this.returnedsForSignatory = returnedsForSignatory;
        this.purordersForAuditEmpId = purordersForAuditEmpId;
        this.requisitionsesForCmanagerEmpId = requisitionsesForCmanagerEmpId;
        this.rewindersForSpectorId = rewindersForSpectorId;
        this.trackingtestsForExa2EmpId = trackingtestsForExa2EmpId;
        this.prschecksForEaudit = prschecksForEaudit;
        this.testnotesesForQuamanperEmpId = testnotesesForQuamanperEmpId;
        this.rewindersForWhId = rewindersForWhId;
        this.shortmsForRper = shortmsForRper;
        this.vargoodsForCjCheck = vargoodsForCjCheck;
        this.testnotesesForPurmanperEmpId = testnotesesForPurmanperEmpId;
        this.samidentifiedsForResperEmpId = samidentifiedsForResperEmpId;
        this.taxstampingpartsesForRperEmp = taxstampingpartsesForRperEmp;
        this.taxstampingpartsesForInspectorEmp = taxstampingpartsesForInspectorEmp;
        this.taxboardsForQuaconfirmEmp = taxboardsForQuaconfirmEmp;
        this.supsendmsForWsper = supsendmsForWsper;
        this.prschecksForEedit = prschecksForEedit;
        this.shortmsForWsmanager = shortmsForWsmanager;
        this.unqualifiedsForRecperEmp = unqualifiedsForRecperEmp;
        this.supidentifiedsForReqperEmpId = supidentifiedsForReqperEmpId;
        this.trackingtestsForWsr1EmpId = trackingtestsForWsr1EmpId;
        this.unqualifiedsForRebperEmp = unqualifiedsForRebperEmp;
        this.employeeraps = employeeraps;
        this.unqualifiedsForReportperEmp = unqualifiedsForReportperEmp;
        this.supsendmsForWhmanager = supsendmsForWhmanager;
        this.supidentifiedsForPurperEmpId = supidentifiedsForPurperEmpId;
        this.preparationsForPersonEmpId = preparationsForPersonEmpId;
        this.supidentifiedsForManperEmpId = supidentifiedsForManperEmpId;
        this.testnotesesForExaminerEmpId = testnotesesForExaminerEmpId;
        this.discardreviewts = discardreviewts;
        this.taxboardsForRperEmp = taxboardsForRperEmp;
        this.requisitionsesForDmanagerEmpId = requisitionsesForDmanagerEmpId;
        this.warehousesForWhId = warehousesForWhId;
        this.shinote2sForWper = shinote2sForWper;
        this.prschecksForEapprove = prschecksForEapprove;
        this.feedexaminesForWhId = feedexaminesForWhId;
        this.feedexaminesForSpecId = feedexaminesForSpecId;
        this.returnedsForQualitymanager = returnedsForQualitymanager;
        this.returnedsForSignper = returnedsForSignper;
        this.changefsForMenuMake = changefsForMenuMake;
        this.testnotesesForQuaperEmpId = testnotesesForQuaperEmpId;
        this.shinote2sForDelper = shinote2sForDelper;
        this.purordersForHandingEmpId = purordersForHandingEmpId;
        this.variationsForAppper = variationsForAppper;
        this.unqualifiedsForRecheckperEmp = unqualifiedsForRecheckperEmp;
        this.discardverifies = discardverifies;
        this.trackingtestsForWsr2EmpId = trackingtestsForWsr2EmpId;
        this.taxstampingpartsesForQuaconfirmEmp = taxstampingpartsesForQuaconfirmEmp;
        this.shinote2sForMtab = shinote2sForMtab;
        this.supidentifiedsForQuaperEmpId = supidentifiedsForQuaperEmpId;
        this.feedexaminesForWh2Id = feedexaminesForWh2Id;
        this.supplierinfosForWperEmpId = supplierinfosForWperEmpId;
        this.purordersForApprovalEmpId = purordersForApprovalEmpId;
        this.supplierinfosForCheckperEmpId = supplierinfosForCheckperEmpId;
        this.samidentifiedsForExamineEmpId = samidentifiedsForExamineEmpId;
        this.changefsForWhSign = changefsForWhSign;
        this.rewindersForBuyerId = rewindersForBuyerId;
        this.shinote2sForWhmgetEmp = shinote2sForWhmgetEmp;
        this.feedexaminesForBuyerId = feedexaminesForBuyerId;
        this.discardreviewses = discardreviewses;
        this.users = users;
        this.unqualifiedsForInspectorEmp = unqualifiedsForInspectorEmp;
        this.trackingtestsForManEmpId = trackingtestsForManEmpId;
        this.requisitionsForConfId = requisitionsForConfId;
        this.requisitionsesForBmanagerEmpId = requisitionsesForBmanagerEmpId;
    }

   
    // Property accessors

    public Integer getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Training getTraining() {
        return this.training;
    }
    
    public void setTraining(Training training) {
        this.training = training;
    }

    public Jobs getJobs() {
        return this.jobs;
    }
    
    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public Timestamp getBirdate() {
        return this.birdate;
    }
    
    public void setBirdate(Timestamp birdate) {
        this.birdate = birdate;
    }

    public String getDefaultMenu() {
        return this.defaultMenu;
    }
    
    public void setDefaultMenu(String defaultMenu) {
        this.defaultMenu = defaultMenu;
    }

    public String getDormitory() {
        return this.dormitory;
    }
    
    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public Timestamp getEdate() {
        return this.edate;
    }
    
    public void setEdate(Timestamp edate) {
        this.edate = edate;
    }

    public String getEducation() {
        return this.education;
    }
    
    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmpName() {
        return this.empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSn() {
        return this.empSn;
    }
    
    public void setEmpSn(String empSn) {
        this.empSn = empSn;
    }

    public String getIdCardNo() {
        return this.idCardNo;
    }
    
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Timestamp getLdate() {
        return this.ldate;
    }
    
    public void setLdate(Timestamp ldate) {
        this.ldate = ldate;
    }

    public String getMarStatus() {
        return this.marStatus;
    }
    
    public void setMarStatus(String marStatus) {
        this.marStatus = marStatus;
    }

    public String getNature() {
        return this.nature;
    }
    
    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }
    
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPic() {
        return this.pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPolitical() {
        return this.political;
    }
    
    public void setPolitical(String political) {
        this.political = political;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrStatus() {
        return this.trStatus;
    }
    
    public void setTrStatus(String trStatus) {
        this.trStatus = trStatus;
    }

    public Integer getIsdel() {
        return this.isdel;
    }
    
    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Set getSupsendmsForProper() {
        return this.supsendmsForProper;
    }
    
    public void setSupsendmsForProper(Set supsendmsForProper) {
        this.supsendmsForProper = supsendmsForProper;
    }

    public Set getVariationsForUmanager() {
        return this.variationsForUmanager;
    }
    
    public void setVariationsForUmanager(Set variationsForUmanager) {
        this.variationsForUmanager = variationsForUmanager;
    }

    public Set getEmpTrains() {
        return this.empTrains;
    }
    
    public void setEmpTrains(Set empTrains) {
        this.empTrains = empTrains;
    }

    public Set getPreparationsForPleaderEmpId() {
        return this.preparationsForPleaderEmpId;
    }
    
    public void setPreparationsForPleaderEmpId(Set preparationsForPleaderEmpId) {
        this.preparationsForPleaderEmpId = preparationsForPleaderEmpId;
    }

    public Set getChangefsForExSign() {
        return this.changefsForExSign;
    }
    
    public void setChangefsForExSign(Set changefsForExSign) {
        this.changefsForExSign = changefsForExSign;
    }

    public Set getTrackingtestsForTryEmpId() {
        return this.trackingtestsForTryEmpId;
    }
    
    public void setTrackingtestsForTryEmpId(Set trackingtestsForTryEmpId) {
        this.trackingtestsForTryEmpId = trackingtestsForTryEmpId;
    }

    public Set getRequisitionsesForDpmanagerEmpId() {
        return this.requisitionsesForDpmanagerEmpId;
    }
    
    public void setRequisitionsesForDpmanagerEmpId(Set requisitionsesForDpmanagerEmpId) {
        this.requisitionsesForDpmanagerEmpId = requisitionsesForDpmanagerEmpId;
    }

    public Set getVargoodsForCheckNum() {
        return this.vargoodsForCheckNum;
    }
    
    public void setVargoodsForCheckNum(Set vargoodsForCheckNum) {
        this.vargoodsForCheckNum = vargoodsForCheckNum;
    }

    public Set getRequisitionsesForBuyerEmpId() {
        return this.requisitionsesForBuyerEmpId;
    }
    
    public void setRequisitionsesForBuyerEmpId(Set requisitionsesForBuyerEmpId) {
        this.requisitionsesForBuyerEmpId = requisitionsesForBuyerEmpId;
    }

    public Set getTrackingtestsForExa1EmpId() {
        return this.trackingtestsForExa1EmpId;
    }
    
    public void setTrackingtestsForExa1EmpId(Set trackingtestsForExa1EmpId) {
        this.trackingtestsForExa1EmpId = trackingtestsForExa1EmpId;
    }

    public Set getSupidentifiedsForQuaresperEmpId() {
        return this.supidentifiedsForQuaresperEmpId;
    }
    
    public void setSupidentifiedsForQuaresperEmpId(Set supidentifiedsForQuaresperEmpId) {
        this.supidentifiedsForQuaresperEmpId = supidentifiedsForQuaresperEmpId;
    }

    public Set getTaxboardsForInspectorEmp() {
        return this.taxboardsForInspectorEmp;
    }
    
    public void setTaxboardsForInspectorEmp(Set taxboardsForInspectorEmp) {
        this.taxboardsForInspectorEmp = taxboardsForInspectorEmp;
    }

    public Set getSupidentifiedsForPurresperEmpId() {
        return this.supidentifiedsForPurresperEmpId;
    }
    
    public void setSupidentifiedsForPurresperEmpId(Set supidentifiedsForPurresperEmpId) {
        this.supidentifiedsForPurresperEmpId = supidentifiedsForPurresperEmpId;
    }

    public Set getAccreditions() {
        return this.accreditions;
    }
    
    public void setAccreditions(Set accreditions) {
        this.accreditions = accreditions;
    }

    public Set getDiscardreviewfs() {
        return this.discardreviewfs;
    }
    
    public void setDiscardreviewfs(Set discardreviewfs) {
        this.discardreviewfs = discardreviewfs;
    }

    public Set getChangefsForWsSign() {
        return this.changefsForWsSign;
    }
    
    public void setChangefsForWsSign(Set changefsForWsSign) {
        this.changefsForWsSign = changefsForWsSign;
    }

    public Set getWarehousesForWinpectorId() {
        return this.warehousesForWinpectorId;
    }
    
    public void setWarehousesForWinpectorId(Set warehousesForWinpectorId) {
        this.warehousesForWinpectorId = warehousesForWinpectorId;
    }

    public Set getShippingnote1s() {
        return this.shippingnote1s;
    }
    
    public void setShippingnote1s(Set shippingnote1s) {
        this.shippingnote1s = shippingnote1s;
    }

    public Set getSamidentifiedsForChargeEmpId() {
        return this.samidentifiedsForChargeEmpId;
    }
    
    public void setSamidentifiedsForChargeEmpId(Set samidentifiedsForChargeEmpId) {
        this.samidentifiedsForChargeEmpId = samidentifiedsForChargeEmpId;
    }

    public Set getTestnotesesForPurperEmpId() {
        return this.testnotesesForPurperEmpId;
    }
    
    public void setTestnotesesForPurperEmpId(Set testnotesesForPurperEmpId) {
        this.testnotesesForPurperEmpId = testnotesesForPurperEmpId;
    }

    public Set getSamidentifiedsForHangdingEmpId() {
        return this.samidentifiedsForHangdingEmpId;
    }
    
    public void setSamidentifiedsForHangdingEmpId(Set samidentifiedsForHangdingEmpId) {
        this.samidentifiedsForHangdingEmpId = samidentifiedsForHangdingEmpId;
    }

    public Set getSupidentifiedsForRecperEmpId() {
        return this.supidentifiedsForRecperEmpId;
    }
    
    public void setSupidentifiedsForRecperEmpId(Set supidentifiedsForRecperEmpId) {
        this.supidentifiedsForRecperEmpId = supidentifiedsForRecperEmpId;
    }

    public Set getRequisitionsForDptId() {
        return this.requisitionsForDptId;
    }
    
    public void setRequisitionsForDptId(Set requisitionsForDptId) {
        this.requisitionsForDptId = requisitionsForDptId;
    }

    public Set getRequisitionsForPinkId() {
        return this.requisitionsForPinkId;
    }
    
    public void setRequisitionsForPinkId(Set requisitionsForPinkId) {
        this.requisitionsForPinkId = requisitionsForPinkId;
    }

    public Set getReturnedsForSignatory() {
        return this.returnedsForSignatory;
    }
    
    public void setReturnedsForSignatory(Set returnedsForSignatory) {
        this.returnedsForSignatory = returnedsForSignatory;
    }

    public Set getPurordersForAuditEmpId() {
        return this.purordersForAuditEmpId;
    }
    
    public void setPurordersForAuditEmpId(Set purordersForAuditEmpId) {
        this.purordersForAuditEmpId = purordersForAuditEmpId;
    }

    public Set getRequisitionsesForCmanagerEmpId() {
        return this.requisitionsesForCmanagerEmpId;
    }
    
    public void setRequisitionsesForCmanagerEmpId(Set requisitionsesForCmanagerEmpId) {
        this.requisitionsesForCmanagerEmpId = requisitionsesForCmanagerEmpId;
    }

    public Set getRewindersForSpectorId() {
        return this.rewindersForSpectorId;
    }
    
    public void setRewindersForSpectorId(Set rewindersForSpectorId) {
        this.rewindersForSpectorId = rewindersForSpectorId;
    }

    public Set getTrackingtestsForExa2EmpId() {
        return this.trackingtestsForExa2EmpId;
    }
    
    public void setTrackingtestsForExa2EmpId(Set trackingtestsForExa2EmpId) {
        this.trackingtestsForExa2EmpId = trackingtestsForExa2EmpId;
    }

    public Set getPrschecksForEaudit() {
        return this.prschecksForEaudit;
    }
    
    public void setPrschecksForEaudit(Set prschecksForEaudit) {
        this.prschecksForEaudit = prschecksForEaudit;
    }

    public Set getTestnotesesForQuamanperEmpId() {
        return this.testnotesesForQuamanperEmpId;
    }
    
    public void setTestnotesesForQuamanperEmpId(Set testnotesesForQuamanperEmpId) {
        this.testnotesesForQuamanperEmpId = testnotesesForQuamanperEmpId;
    }

    public Set getRewindersForWhId() {
        return this.rewindersForWhId;
    }
    
    public void setRewindersForWhId(Set rewindersForWhId) {
        this.rewindersForWhId = rewindersForWhId;
    }

    public Set getShortmsForRper() {
        return this.shortmsForRper;
    }
    
    public void setShortmsForRper(Set shortmsForRper) {
        this.shortmsForRper = shortmsForRper;
    }

    public Set getVargoodsForCjCheck() {
        return this.vargoodsForCjCheck;
    }
    
    public void setVargoodsForCjCheck(Set vargoodsForCjCheck) {
        this.vargoodsForCjCheck = vargoodsForCjCheck;
    }

    public Set getTestnotesesForPurmanperEmpId() {
        return this.testnotesesForPurmanperEmpId;
    }
    
    public void setTestnotesesForPurmanperEmpId(Set testnotesesForPurmanperEmpId) {
        this.testnotesesForPurmanperEmpId = testnotesesForPurmanperEmpId;
    }

    public Set getSamidentifiedsForResperEmpId() {
        return this.samidentifiedsForResperEmpId;
    }
    
    public void setSamidentifiedsForResperEmpId(Set samidentifiedsForResperEmpId) {
        this.samidentifiedsForResperEmpId = samidentifiedsForResperEmpId;
    }

    public Set getTaxstampingpartsesForRperEmp() {
        return this.taxstampingpartsesForRperEmp;
    }
    
    public void setTaxstampingpartsesForRperEmp(Set taxstampingpartsesForRperEmp) {
        this.taxstampingpartsesForRperEmp = taxstampingpartsesForRperEmp;
    }

    public Set getTaxstampingpartsesForInspectorEmp() {
        return this.taxstampingpartsesForInspectorEmp;
    }
    
    public void setTaxstampingpartsesForInspectorEmp(Set taxstampingpartsesForInspectorEmp) {
        this.taxstampingpartsesForInspectorEmp = taxstampingpartsesForInspectorEmp;
    }

    public Set getTaxboardsForQuaconfirmEmp() {
        return this.taxboardsForQuaconfirmEmp;
    }
    
    public void setTaxboardsForQuaconfirmEmp(Set taxboardsForQuaconfirmEmp) {
        this.taxboardsForQuaconfirmEmp = taxboardsForQuaconfirmEmp;
    }

    public Set getSupsendmsForWsper() {
        return this.supsendmsForWsper;
    }
    
    public void setSupsendmsForWsper(Set supsendmsForWsper) {
        this.supsendmsForWsper = supsendmsForWsper;
    }

    public Set getPrschecksForEedit() {
        return this.prschecksForEedit;
    }
    
    public void setPrschecksForEedit(Set prschecksForEedit) {
        this.prschecksForEedit = prschecksForEedit;
    }

    public Set getShortmsForWsmanager() {
        return this.shortmsForWsmanager;
    }
    
    public void setShortmsForWsmanager(Set shortmsForWsmanager) {
        this.shortmsForWsmanager = shortmsForWsmanager;
    }

    public Set getUnqualifiedsForRecperEmp() {
        return this.unqualifiedsForRecperEmp;
    }
    
    public void setUnqualifiedsForRecperEmp(Set unqualifiedsForRecperEmp) {
        this.unqualifiedsForRecperEmp = unqualifiedsForRecperEmp;
    }

    public Set getSupidentifiedsForReqperEmpId() {
        return this.supidentifiedsForReqperEmpId;
    }
    
    public void setSupidentifiedsForReqperEmpId(Set supidentifiedsForReqperEmpId) {
        this.supidentifiedsForReqperEmpId = supidentifiedsForReqperEmpId;
    }

    public Set getTrackingtestsForWsr1EmpId() {
        return this.trackingtestsForWsr1EmpId;
    }
    
    public void setTrackingtestsForWsr1EmpId(Set trackingtestsForWsr1EmpId) {
        this.trackingtestsForWsr1EmpId = trackingtestsForWsr1EmpId;
    }

    public Set getUnqualifiedsForRebperEmp() {
        return this.unqualifiedsForRebperEmp;
    }
    
    public void setUnqualifiedsForRebperEmp(Set unqualifiedsForRebperEmp) {
        this.unqualifiedsForRebperEmp = unqualifiedsForRebperEmp;
    }

    public Set getEmployeeraps() {
        return this.employeeraps;
    }
    
    public void setEmployeeraps(Set employeeraps) {
        this.employeeraps = employeeraps;
    }

    public Set getUnqualifiedsForReportperEmp() {
        return this.unqualifiedsForReportperEmp;
    }
    
    public void setUnqualifiedsForReportperEmp(Set unqualifiedsForReportperEmp) {
        this.unqualifiedsForReportperEmp = unqualifiedsForReportperEmp;
    }

    public Set getSupsendmsForWhmanager() {
        return this.supsendmsForWhmanager;
    }
    
    public void setSupsendmsForWhmanager(Set supsendmsForWhmanager) {
        this.supsendmsForWhmanager = supsendmsForWhmanager;
    }

    public Set getSupidentifiedsForPurperEmpId() {
        return this.supidentifiedsForPurperEmpId;
    }
    
    public void setSupidentifiedsForPurperEmpId(Set supidentifiedsForPurperEmpId) {
        this.supidentifiedsForPurperEmpId = supidentifiedsForPurperEmpId;
    }

    public Set getPreparationsForPersonEmpId() {
        return this.preparationsForPersonEmpId;
    }
    
    public void setPreparationsForPersonEmpId(Set preparationsForPersonEmpId) {
        this.preparationsForPersonEmpId = preparationsForPersonEmpId;
    }

    public Set getSupidentifiedsForManperEmpId() {
        return this.supidentifiedsForManperEmpId;
    }
    
    public void setSupidentifiedsForManperEmpId(Set supidentifiedsForManperEmpId) {
        this.supidentifiedsForManperEmpId = supidentifiedsForManperEmpId;
    }

    public Set getTestnotesesForExaminerEmpId() {
        return this.testnotesesForExaminerEmpId;
    }
    
    public void setTestnotesesForExaminerEmpId(Set testnotesesForExaminerEmpId) {
        this.testnotesesForExaminerEmpId = testnotesesForExaminerEmpId;
    }

    public Set getDiscardreviewts() {
        return this.discardreviewts;
    }
    
    public void setDiscardreviewts(Set discardreviewts) {
        this.discardreviewts = discardreviewts;
    }

    public Set getTaxboardsForRperEmp() {
        return this.taxboardsForRperEmp;
    }
    
    public void setTaxboardsForRperEmp(Set taxboardsForRperEmp) {
        this.taxboardsForRperEmp = taxboardsForRperEmp;
    }

    public Set getRequisitionsesForDmanagerEmpId() {
        return this.requisitionsesForDmanagerEmpId;
    }
    
    public void setRequisitionsesForDmanagerEmpId(Set requisitionsesForDmanagerEmpId) {
        this.requisitionsesForDmanagerEmpId = requisitionsesForDmanagerEmpId;
    }

    public Set getWarehousesForWhId() {
        return this.warehousesForWhId;
    }
    
    public void setWarehousesForWhId(Set warehousesForWhId) {
        this.warehousesForWhId = warehousesForWhId;
    }

    public Set getShinote2sForWper() {
        return this.shinote2sForWper;
    }
    
    public void setShinote2sForWper(Set shinote2sForWper) {
        this.shinote2sForWper = shinote2sForWper;
    }

    public Set getPrschecksForEapprove() {
        return this.prschecksForEapprove;
    }
    
    public void setPrschecksForEapprove(Set prschecksForEapprove) {
        this.prschecksForEapprove = prschecksForEapprove;
    }

    public Set getFeedexaminesForWhId() {
        return this.feedexaminesForWhId;
    }
    
    public void setFeedexaminesForWhId(Set feedexaminesForWhId) {
        this.feedexaminesForWhId = feedexaminesForWhId;
    }

    public Set getFeedexaminesForSpecId() {
        return this.feedexaminesForSpecId;
    }
    
    public void setFeedexaminesForSpecId(Set feedexaminesForSpecId) {
        this.feedexaminesForSpecId = feedexaminesForSpecId;
    }

    public Set getReturnedsForQualitymanager() {
        return this.returnedsForQualitymanager;
    }
    
    public void setReturnedsForQualitymanager(Set returnedsForQualitymanager) {
        this.returnedsForQualitymanager = returnedsForQualitymanager;
    }

    public Set getReturnedsForSignper() {
        return this.returnedsForSignper;
    }
    
    public void setReturnedsForSignper(Set returnedsForSignper) {
        this.returnedsForSignper = returnedsForSignper;
    }

    public Set getChangefsForMenuMake() {
        return this.changefsForMenuMake;
    }
    
    public void setChangefsForMenuMake(Set changefsForMenuMake) {
        this.changefsForMenuMake = changefsForMenuMake;
    }

    public Set getTestnotesesForQuaperEmpId() {
        return this.testnotesesForQuaperEmpId;
    }
    
    public void setTestnotesesForQuaperEmpId(Set testnotesesForQuaperEmpId) {
        this.testnotesesForQuaperEmpId = testnotesesForQuaperEmpId;
    }

    public Set getShinote2sForDelper() {
        return this.shinote2sForDelper;
    }
    
    public void setShinote2sForDelper(Set shinote2sForDelper) {
        this.shinote2sForDelper = shinote2sForDelper;
    }

    public Set getPurordersForHandingEmpId() {
        return this.purordersForHandingEmpId;
    }
    
    public void setPurordersForHandingEmpId(Set purordersForHandingEmpId) {
        this.purordersForHandingEmpId = purordersForHandingEmpId;
    }

    public Set getVariationsForAppper() {
        return this.variationsForAppper;
    }
    
    public void setVariationsForAppper(Set variationsForAppper) {
        this.variationsForAppper = variationsForAppper;
    }

    public Set getUnqualifiedsForRecheckperEmp() {
        return this.unqualifiedsForRecheckperEmp;
    }
    
    public void setUnqualifiedsForRecheckperEmp(Set unqualifiedsForRecheckperEmp) {
        this.unqualifiedsForRecheckperEmp = unqualifiedsForRecheckperEmp;
    }

    public Set getDiscardverifies() {
        return this.discardverifies;
    }
    
    public void setDiscardverifies(Set discardverifies) {
        this.discardverifies = discardverifies;
    }

    public Set getTrackingtestsForWsr2EmpId() {
        return this.trackingtestsForWsr2EmpId;
    }
    
    public void setTrackingtestsForWsr2EmpId(Set trackingtestsForWsr2EmpId) {
        this.trackingtestsForWsr2EmpId = trackingtestsForWsr2EmpId;
    }

    public Set getTaxstampingpartsesForQuaconfirmEmp() {
        return this.taxstampingpartsesForQuaconfirmEmp;
    }
    
    public void setTaxstampingpartsesForQuaconfirmEmp(Set taxstampingpartsesForQuaconfirmEmp) {
        this.taxstampingpartsesForQuaconfirmEmp = taxstampingpartsesForQuaconfirmEmp;
    }

    public Set getShinote2sForMtab() {
        return this.shinote2sForMtab;
    }
    
    public void setShinote2sForMtab(Set shinote2sForMtab) {
        this.shinote2sForMtab = shinote2sForMtab;
    }

    public Set getSupidentifiedsForQuaperEmpId() {
        return this.supidentifiedsForQuaperEmpId;
    }
    
    public void setSupidentifiedsForQuaperEmpId(Set supidentifiedsForQuaperEmpId) {
        this.supidentifiedsForQuaperEmpId = supidentifiedsForQuaperEmpId;
    }

    public Set getFeedexaminesForWh2Id() {
        return this.feedexaminesForWh2Id;
    }
    
    public void setFeedexaminesForWh2Id(Set feedexaminesForWh2Id) {
        this.feedexaminesForWh2Id = feedexaminesForWh2Id;
    }

    public Set getSupplierinfosForWperEmpId() {
        return this.supplierinfosForWperEmpId;
    }
    
    public void setSupplierinfosForWperEmpId(Set supplierinfosForWperEmpId) {
        this.supplierinfosForWperEmpId = supplierinfosForWperEmpId;
    }

    public Set getPurordersForApprovalEmpId() {
        return this.purordersForApprovalEmpId;
    }
    
    public void setPurordersForApprovalEmpId(Set purordersForApprovalEmpId) {
        this.purordersForApprovalEmpId = purordersForApprovalEmpId;
    }

    public Set getSupplierinfosForCheckperEmpId() {
        return this.supplierinfosForCheckperEmpId;
    }
    
    public void setSupplierinfosForCheckperEmpId(Set supplierinfosForCheckperEmpId) {
        this.supplierinfosForCheckperEmpId = supplierinfosForCheckperEmpId;
    }

    public Set getSamidentifiedsForExamineEmpId() {
        return this.samidentifiedsForExamineEmpId;
    }
    
    public void setSamidentifiedsForExamineEmpId(Set samidentifiedsForExamineEmpId) {
        this.samidentifiedsForExamineEmpId = samidentifiedsForExamineEmpId;
    }

    public Set getChangefsForWhSign() {
        return this.changefsForWhSign;
    }
    
    public void setChangefsForWhSign(Set changefsForWhSign) {
        this.changefsForWhSign = changefsForWhSign;
    }

    public Set getRewindersForBuyerId() {
        return this.rewindersForBuyerId;
    }
    
    public void setRewindersForBuyerId(Set rewindersForBuyerId) {
        this.rewindersForBuyerId = rewindersForBuyerId;
    }

    public Set getShinote2sForWhmgetEmp() {
        return this.shinote2sForWhmgetEmp;
    }
    
    public void setShinote2sForWhmgetEmp(Set shinote2sForWhmgetEmp) {
        this.shinote2sForWhmgetEmp = shinote2sForWhmgetEmp;
    }

    public Set getFeedexaminesForBuyerId() {
        return this.feedexaminesForBuyerId;
    }
    
    public void setFeedexaminesForBuyerId(Set feedexaminesForBuyerId) {
        this.feedexaminesForBuyerId = feedexaminesForBuyerId;
    }

    public Set getDiscardreviewses() {
        return this.discardreviewses;
    }
    
    public void setDiscardreviewses(Set discardreviewses) {
        this.discardreviewses = discardreviewses;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }

    public Set getUnqualifiedsForInspectorEmp() {
        return this.unqualifiedsForInspectorEmp;
    }
    
    public void setUnqualifiedsForInspectorEmp(Set unqualifiedsForInspectorEmp) {
        this.unqualifiedsForInspectorEmp = unqualifiedsForInspectorEmp;
    }

    public Set getTrackingtestsForManEmpId() {
        return this.trackingtestsForManEmpId;
    }
    
    public void setTrackingtestsForManEmpId(Set trackingtestsForManEmpId) {
        this.trackingtestsForManEmpId = trackingtestsForManEmpId;
    }

    public Set getRequisitionsForConfId() {
        return this.requisitionsForConfId;
    }
    
    public void setRequisitionsForConfId(Set requisitionsForConfId) {
        this.requisitionsForConfId = requisitionsForConfId;
    }

    public Set getRequisitionsesForBmanagerEmpId() {
        return this.requisitionsesForBmanagerEmpId;
    }
    
    public void setRequisitionsesForBmanagerEmpId(Set requisitionsesForBmanagerEmpId) {
        this.requisitionsesForBmanagerEmpId = requisitionsesForBmanagerEmpId;
    }
   








}