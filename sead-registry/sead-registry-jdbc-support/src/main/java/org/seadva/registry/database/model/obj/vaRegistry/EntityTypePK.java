package org.seadva.registry.database.model.obj.vaRegistry;


import org.seadva.registry.database.model.obj.vaRegistry.iface.IEntityTypePK;


/** 
 * Object mapping for hibernate-handled table: entity_type.
 * @author autogenerated
 */

public class EntityTypePK implements IEntityTypePK {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559002638L;

	

	/** Field mapping. */
	private BaseEntity entity;

	/** Field mapping. */
	private String entityTypeId;

 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	public Class<?> getClassType() {
		return EntityTypePK.class;
	}
 

    /**
     * Return the value associated with the column: entity.
	 * @return A BaseEntity object (this.entity)
	 */
	public BaseEntity getEntity() {
		return this.entity;
		
	}
	

  
    /**  
     * Set the value related to the column: entity.
	 * @param entity the entity value you wish to set
	 */
	public void setEntity(final BaseEntity entity) {
		this.entity = entity;
	}

    /**
     * Return the value associated with the column: entityTypeId.
	 * @return A String object (this.entityTypeId)
	 */
	public String getEntityTypeId() {
		return this.entityTypeId;
		
	}
	

  
    /**  
     * Set the value related to the column: entityTypeId.
	 * @param entityTypeId the entityTypeId value you wish to set
	 */
	public void setEntityTypeId(final String entityTypeId) {
		this.entityTypeId = entityTypeId;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public EntityTypePK clone() throws CloneNotSupportedException {
		
        final EntityTypePK copy = (EntityTypePK)super.clone();

		copy.setEntityTypeId(this.getEntityTypeId());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("entityTypeId: " + this.getEntityTypeId());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see Object#equals(Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		if (aThat == null)  {
			 return false;
		}
		
		final EntityTypePK that; 
		try {
			that = (EntityTypePK) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((getEntity() == null) && (that.getEntity() == null)) || (getEntity() != null && getEntity().getId().equals(that.getEntity().getId())));	
		result = result && (((getEntityTypeId() == null) && (that.getEntityTypeId() == null)) || (getEntityTypeId() != null && getEntityTypeId().equals(that.getEntityTypeId())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
	int hash = 0;
		hash = hash + getEntity().hashCode();
		hash = hash + getEntityTypeId().hashCode();
	return hash;
	}
	

	
}
