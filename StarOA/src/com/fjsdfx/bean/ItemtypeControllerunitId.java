package com.fjsdfx.bean;



/**
 * ItemtypeControllerunitId entity. @author MyEclipse Persistence Tools
 */

public class ItemtypeControllerunitId  implements java.io.Serializable {


    // Fields    

     private Itemtype itemtype;
     private Controllerunit controllerunit;


    // Constructors

    /** default constructor */
    public ItemtypeControllerunitId() {
    }

    
    /** full constructor */
    public ItemtypeControllerunitId(Itemtype itemtype, Controllerunit controllerunit) {
        this.itemtype = itemtype;
        this.controllerunit = controllerunit;
    }

   
    // Property accessors

    public Itemtype getItemtype() {
        return this.itemtype;
    }
    
    public void setItemtype(Itemtype itemtype) {
        this.itemtype = itemtype;
    }

    public Controllerunit getControllerunit() {
        return this.controllerunit;
    }
    
    public void setControllerunit(Controllerunit controllerunit) {
        this.controllerunit = controllerunit;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ItemtypeControllerunitId) ) return false;
		 ItemtypeControllerunitId castOther = ( ItemtypeControllerunitId ) other; 
         
		 return ( (this.getItemtype()==castOther.getItemtype()) || ( this.getItemtype()!=null && castOther.getItemtype()!=null && this.getItemtype().equals(castOther.getItemtype()) ) )
 && ( (this.getControllerunit()==castOther.getControllerunit()) || ( this.getControllerunit()!=null && castOther.getControllerunit()!=null && this.getControllerunit().equals(castOther.getControllerunit()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getItemtype() == null ? 0 : this.getItemtype().hashCode() );
         result = 37 * result + ( getControllerunit() == null ? 0 : this.getControllerunit().hashCode() );
         return result;
   }   





}