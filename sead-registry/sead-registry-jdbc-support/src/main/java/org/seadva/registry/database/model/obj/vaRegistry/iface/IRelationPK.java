package org.seadva.registry.database.model.obj.vaRegistry.iface;
import javax.persistence.Basic;
import org.seadva.registry.database.model.obj.vaRegistry.BaseEntity;
import org.seadva.registry.database.model.obj.vaRegistry.RelationType;


/** 
 * Object interface mapping for hibernate-handled table: relation.
 * @author autogenerated
 */

public interface IRelationPK {



    /**
     * Return the value associated with the column: cause.
	 * @return A BaseEntity object (this.cause)
	 */
	BaseEntity getCause();
	

  
    /**  
     * Set the value related to the column: cause.
	 * @param cause the cause value you wish to set
	 */
	void setCause(final BaseEntity cause);

    /**
     * Return the value associated with the column: effect.
	 * @return A BaseEntity object (this.effect)
	 */
	BaseEntity getEffect();
	

  
    /**  
     * Set the value related to the column: effect.
	 * @param effect the effect value you wish to set
	 */
	void setEffect(final BaseEntity effect);

    /**
     * Return the value associated with the column: relationType.
	 * @return A RelationType object (this.relationType)
	 */
	RelationType getRelationType();
	

  
    /**  
     * Set the value related to the column: relationType.
	 * @param relationType the relationType value you wish to set
	 */
	void setRelationType(final RelationType relationType);

	// end of interface
}