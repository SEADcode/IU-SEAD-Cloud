package org.seadva.registry.database.model.dao.vaRegistry;

/**
 * DAO interface for table: Repository.
 * @author autogenerated
 */
public interface RepositoryDao{
	// constructor only
    public org.seadva.registry.database.model.obj.vaRegistry.Repository getRepository(String repoName);
    public org.seadva.registry.database.model.obj.vaRegistry.Repository getRepositoryById(String repoId);
}

