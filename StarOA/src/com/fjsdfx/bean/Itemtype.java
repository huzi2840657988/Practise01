package com.fjsdfx.bean;

import java.util.HashSet;
import java.util.Set;


/**
 * Itemtype entity. @author MyEclipse Persistence Tools
 */

public class Itemtype  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Item item;
     private Controllerunit controllerunit;
     private Integer bondedNo;
     private String description;
     private Integer isbonded;
     private String mcode;
     private String name;
     private String notes;
     private Integer isCon;
     private Set warehouses = new HashSet(0);
     private Set shi1goods = new HashSet(0);
     private Set pergoods = new HashSet(0);
     private Set taxstampingpartses = new HashSet(0);
     private Set proSchedules = new HashSet(0);
     private Set discardproductions = new HashSet(0);
     private Set changefsForFormerPro = new HashSet(0);
     private Set stoschgoods = new HashSet(0);
     private Set purgoodsForIteId = new HashSet(0);
     private Set resgoodsForIteId = new HashSet(0);
     private Set shogoods = new HashSet(0);
     private Set maccountings = new HashSet(0);
     private Set resgoodsForItemtypeId = new HashSet(0);
     private Set vargoods = new HashSet(0);
     private Set inventories = new HashSet(0);
     private Set dailyproductions = new HashSet(0);
     private Set unqualifieds = new HashSet(0);
     private Set itemrelationsForPartId = new HashSet(0);
     private Set discardverifies = new HashSet(0);
     private Set stocks = new HashSet(0);
     private Set rmtotals = new HashSet(0);
     private Set changefsForToPro = new HashSet(0);
     private Set susgoods = new HashSet(0);
     private Set susgood3s = new HashSet(0);
     private Set trackingtests = new HashSet(0);
     private Set feegoods = new HashSet(0);
     private Set shi2goods = new HashSet(0);
     private Set taxboards = new HashSet(0);
     private Set qualityanalysises = new HashSet(0);
     private Set purgoodsForItemtypeId = new HashSet(0);
     private Set retgoods = new HashSet(0);
     private Set samidentifieds = new HashSet(0);
     private Set supsendms = new HashSet(0);
     private Set itemtypeControllerunits = new HashSet(0);
     private Set picgoods = new HashSet(0);
     private Set rewgoods = new HashSet(0);
     private Set items = new HashSet(0);
     private Set itemrelationsForPitemId = new HashSet(0);
     private Set supsendm3s = new HashSet(0);


    // Constructors

    /** default constructor */
    public Itemtype() {
    }

	/** minimal constructor */
    public Itemtype(String name) {
        this.name = name;
    }
    
    /** full constructor */
    public Itemtype(Item item, Controllerunit controllerunit, Integer bondedNo, String description, Integer isbonded, String mcode, String name, String notes, Integer isCon, Set warehouses, Set shi1goods, Set pergoods, Set taxstampingpartses, Set proSchedules, Set discardproductions, Set changefsForFormerPro, Set stoschgoods, Set purgoodsForIteId, Set resgoodsForIteId, Set shogoods, Set maccountings, Set resgoodsForItemtypeId, Set vargoods, Set inventories, Set dailyproductions, Set unqualifieds, Set itemrelationsForPartId, Set discardverifies, Set stocks, Set rmtotals, Set changefsForToPro, Set susgoods, Set susgood3s, Set trackingtests, Set feegoods, Set shi2goods, Set taxboards, Set qualityanalysises, Set purgoodsForItemtypeId, Set retgoods, Set samidentifieds, Set supsendms, Set itemtypeControllerunits, Set picgoods, Set rewgoods, Set items, Set itemrelationsForPitemId, Set supsendm3s) {
        this.item = item;
        this.controllerunit = controllerunit;
        this.bondedNo = bondedNo;
        this.description = description;
        this.isbonded = isbonded;
        this.mcode = mcode;
        this.name = name;
        this.notes = notes;
        this.isCon = isCon;
        this.warehouses = warehouses;
        this.shi1goods = shi1goods;
        this.pergoods = pergoods;
        this.taxstampingpartses = taxstampingpartses;
        this.proSchedules = proSchedules;
        this.discardproductions = discardproductions;
        this.changefsForFormerPro = changefsForFormerPro;
        this.stoschgoods = stoschgoods;
        this.purgoodsForIteId = purgoodsForIteId;
        this.resgoodsForIteId = resgoodsForIteId;
        this.shogoods = shogoods;
        this.maccountings = maccountings;
        this.resgoodsForItemtypeId = resgoodsForItemtypeId;
        this.vargoods = vargoods;
        this.inventories = inventories;
        this.dailyproductions = dailyproductions;
        this.unqualifieds = unqualifieds;
        this.itemrelationsForPartId = itemrelationsForPartId;
        this.discardverifies = discardverifies;
        this.stocks = stocks;
        this.rmtotals = rmtotals;
        this.changefsForToPro = changefsForToPro;
        this.susgoods = susgoods;
        this.susgood3s = susgood3s;
        this.trackingtests = trackingtests;
        this.feegoods = feegoods;
        this.shi2goods = shi2goods;
        this.taxboards = taxboards;
        this.qualityanalysises = qualityanalysises;
        this.purgoodsForItemtypeId = purgoodsForItemtypeId;
        this.retgoods = retgoods;
        this.samidentifieds = samidentifieds;
        this.supsendms = supsendms;
        this.itemtypeControllerunits = itemtypeControllerunits;
        this.picgoods = picgoods;
        this.rewgoods = rewgoods;
        this.items = items;
        this.itemrelationsForPitemId = itemrelationsForPitemId;
        this.supsendm3s = supsendm3s;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }

    public Controllerunit getControllerunit() {
        return this.controllerunit;
    }
    
    public void setControllerunit(Controllerunit controllerunit) {
        this.controllerunit = controllerunit;
    }

    public Integer getBondedNo() {
        return this.bondedNo;
    }
    
    public void setBondedNo(Integer bondedNo) {
        this.bondedNo = bondedNo;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsbonded() {
        return this.isbonded;
    }
    
    public void setIsbonded(Integer isbonded) {
        this.isbonded = isbonded;
    }

    public String getMcode() {
        return this.mcode;
    }
    
    public void setMcode(String mcode) {
        this.mcode = mcode;
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

    public Integer getIsCon() {
        return this.isCon;
    }
    
    public void setIsCon(Integer isCon) {
        this.isCon = isCon;
    }

    public Set getWarehouses() {
        return this.warehouses;
    }
    
    public void setWarehouses(Set warehouses) {
        this.warehouses = warehouses;
    }

    public Set getShi1goods() {
        return this.shi1goods;
    }
    
    public void setShi1goods(Set shi1goods) {
        this.shi1goods = shi1goods;
    }

    public Set getPergoods() {
        return this.pergoods;
    }
    
    public void setPergoods(Set pergoods) {
        this.pergoods = pergoods;
    }

    public Set getTaxstampingpartses() {
        return this.taxstampingpartses;
    }
    
    public void setTaxstampingpartses(Set taxstampingpartses) {
        this.taxstampingpartses = taxstampingpartses;
    }

    public Set getProSchedules() {
        return this.proSchedules;
    }
    
    public void setProSchedules(Set proSchedules) {
        this.proSchedules = proSchedules;
    }

    public Set getDiscardproductions() {
        return this.discardproductions;
    }
    
    public void setDiscardproductions(Set discardproductions) {
        this.discardproductions = discardproductions;
    }

    public Set getChangefsForFormerPro() {
        return this.changefsForFormerPro;
    }
    
    public void setChangefsForFormerPro(Set changefsForFormerPro) {
        this.changefsForFormerPro = changefsForFormerPro;
    }

    public Set getStoschgoods() {
        return this.stoschgoods;
    }
    
    public void setStoschgoods(Set stoschgoods) {
        this.stoschgoods = stoschgoods;
    }

    public Set getPurgoodsForIteId() {
        return this.purgoodsForIteId;
    }
    
    public void setPurgoodsForIteId(Set purgoodsForIteId) {
        this.purgoodsForIteId = purgoodsForIteId;
    }

    public Set getResgoodsForIteId() {
        return this.resgoodsForIteId;
    }
    
    public void setResgoodsForIteId(Set resgoodsForIteId) {
        this.resgoodsForIteId = resgoodsForIteId;
    }

    public Set getShogoods() {
        return this.shogoods;
    }
    
    public void setShogoods(Set shogoods) {
        this.shogoods = shogoods;
    }

    public Set getMaccountings() {
        return this.maccountings;
    }
    
    public void setMaccountings(Set maccountings) {
        this.maccountings = maccountings;
    }

    public Set getResgoodsForItemtypeId() {
        return this.resgoodsForItemtypeId;
    }
    
    public void setResgoodsForItemtypeId(Set resgoodsForItemtypeId) {
        this.resgoodsForItemtypeId = resgoodsForItemtypeId;
    }

    public Set getVargoods() {
        return this.vargoods;
    }
    
    public void setVargoods(Set vargoods) {
        this.vargoods = vargoods;
    }

    public Set getInventories() {
        return this.inventories;
    }
    
    public void setInventories(Set inventories) {
        this.inventories = inventories;
    }

    public Set getDailyproductions() {
        return this.dailyproductions;
    }
    
    public void setDailyproductions(Set dailyproductions) {
        this.dailyproductions = dailyproductions;
    }

    public Set getUnqualifieds() {
        return this.unqualifieds;
    }
    
    public void setUnqualifieds(Set unqualifieds) {
        this.unqualifieds = unqualifieds;
    }

    public Set getItemrelationsForPartId() {
        return this.itemrelationsForPartId;
    }
    
    public void setItemrelationsForPartId(Set itemrelationsForPartId) {
        this.itemrelationsForPartId = itemrelationsForPartId;
    }

    public Set getDiscardverifies() {
        return this.discardverifies;
    }
    
    public void setDiscardverifies(Set discardverifies) {
        this.discardverifies = discardverifies;
    }

    public Set getStocks() {
        return this.stocks;
    }
    
    public void setStocks(Set stocks) {
        this.stocks = stocks;
    }

    public Set getRmtotals() {
        return this.rmtotals;
    }
    
    public void setRmtotals(Set rmtotals) {
        this.rmtotals = rmtotals;
    }

    public Set getChangefsForToPro() {
        return this.changefsForToPro;
    }
    
    public void setChangefsForToPro(Set changefsForToPro) {
        this.changefsForToPro = changefsForToPro;
    }

    public Set getSusgoods() {
        return this.susgoods;
    }
    
    public void setSusgoods(Set susgoods) {
        this.susgoods = susgoods;
    }

    public Set getSusgood3s() {
        return this.susgood3s;
    }
    
    public void setSusgood3s(Set susgood3s) {
        this.susgood3s = susgood3s;
    }

    public Set getTrackingtests() {
        return this.trackingtests;
    }
    
    public void setTrackingtests(Set trackingtests) {
        this.trackingtests = trackingtests;
    }

    public Set getFeegoods() {
        return this.feegoods;
    }
    
    public void setFeegoods(Set feegoods) {
        this.feegoods = feegoods;
    }

    public Set getShi2goods() {
        return this.shi2goods;
    }
    
    public void setShi2goods(Set shi2goods) {
        this.shi2goods = shi2goods;
    }

    public Set getTaxboards() {
        return this.taxboards;
    }
    
    public void setTaxboards(Set taxboards) {
        this.taxboards = taxboards;
    }

    public Set getQualityanalysises() {
        return this.qualityanalysises;
    }
    
    public void setQualityanalysises(Set qualityanalysises) {
        this.qualityanalysises = qualityanalysises;
    }

    public Set getPurgoodsForItemtypeId() {
        return this.purgoodsForItemtypeId;
    }
    
    public void setPurgoodsForItemtypeId(Set purgoodsForItemtypeId) {
        this.purgoodsForItemtypeId = purgoodsForItemtypeId;
    }

    public Set getRetgoods() {
        return this.retgoods;
    }
    
    public void setRetgoods(Set retgoods) {
        this.retgoods = retgoods;
    }

    public Set getSamidentifieds() {
        return this.samidentifieds;
    }
    
    public void setSamidentifieds(Set samidentifieds) {
        this.samidentifieds = samidentifieds;
    }

    public Set getSupsendms() {
        return this.supsendms;
    }
    
    public void setSupsendms(Set supsendms) {
        this.supsendms = supsendms;
    }

    public Set getItemtypeControllerunits() {
        return this.itemtypeControllerunits;
    }
    
    public void setItemtypeControllerunits(Set itemtypeControllerunits) {
        this.itemtypeControllerunits = itemtypeControllerunits;
    }

    public Set getPicgoods() {
        return this.picgoods;
    }
    
    public void setPicgoods(Set picgoods) {
        this.picgoods = picgoods;
    }

    public Set getRewgoods() {
        return this.rewgoods;
    }
    
    public void setRewgoods(Set rewgoods) {
        this.rewgoods = rewgoods;
    }

    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }

    public Set getItemrelationsForPitemId() {
        return this.itemrelationsForPitemId;
    }
    
    public void setItemrelationsForPitemId(Set itemrelationsForPitemId) {
        this.itemrelationsForPitemId = itemrelationsForPitemId;
    }

    public Set getSupsendm3s() {
        return this.supsendm3s;
    }
    
    public void setSupsendm3s(Set supsendm3s) {
        this.supsendm3s = supsendm3s;
    }
   








}