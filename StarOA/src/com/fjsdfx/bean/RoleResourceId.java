package com.fjsdfx.bean;



/**
 * RoleResourceId entity. @author MyEclipse Persistence Tools
 */

public class RoleResourceId  implements java.io.Serializable {


    // Fields    

     private Role role;
     private Resource resource;


    // Constructors

    /** default constructor */
    public RoleResourceId() {
    }

    
    /** full constructor */
    public RoleResourceId(Role role, Resource resource) {
        this.role = role;
        this.resource = resource;
    }

   
    // Property accessors

    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

    public Resource getResource() {
        return this.resource;
    }
    
    public void setResource(Resource resource) {
        this.resource = resource;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RoleResourceId) ) return false;
		 RoleResourceId castOther = ( RoleResourceId ) other; 
         
		 return ( (this.getRole()==castOther.getRole()) || ( this.getRole()!=null && castOther.getRole()!=null && this.getRole().equals(castOther.getRole()) ) )
 && ( (this.getResource()==castOther.getResource()) || ( this.getResource()!=null && castOther.getResource()!=null && this.getResource().equals(castOther.getResource()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRole() == null ? 0 : this.getRole().hashCode() );
         result = 37 * result + ( getResource() == null ? 0 : this.getResource().hashCode() );
         return result;
   }   





}