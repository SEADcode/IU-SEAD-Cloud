package org.seadva.registry.database.model.obj.vaRegistry.iface;
import javax.persistence.Basic;
import org.seadva.registry.database.model.obj.vaRegistry.State;
import org.seadva.registry.database.model.obj.vaRegistry.iface.IBaseEntity;


/** 
 * Object interface mapping for hibernate-handled table: collection.
 * @author autogenerated
 */

public interface ICollection extends IBaseEntity {



    /**
     * Return the value associated with the column: isObsolete.
	 * @return A Integer object (this.isObsolete)
	 */
	Integer getIsObsolete();
	

  
    /**  
     * Set the value related to the column: isObsolete.
	 * @param isObsolete the isObsolete value you wish to set
	 */
	void setIsObsolete(final Integer isObsolete);

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	String getName();
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	void setName(final String name);

    /**
     * Return the value associated with the column: state.
	 * @return A State object (this.state)
	 */
	State getState();
	

  
    /**  
     * Set the value related to the column: state.
	 * @param state the state value you wish to set
	 */
	void setState(final State state);

    /**
     * Return the value associated with the column: versionNum.
	 * @return A String object (this.versionNum)
	 */
	String getVersionNum();
	

  
    /**  
     * Set the value related to the column: versionNum.
	 * @param versionNum the versionNum value you wish to set
	 */
	void setVersionNum(final String versionNum);

	// end of interface
}