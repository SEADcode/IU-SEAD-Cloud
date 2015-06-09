package org.seadva.registry.database.model.dao.vaRegistry;

import org.seadva.registry.database.model.obj.vaRegistry.Aggregation;
import org.seadva.registry.database.model.obj.vaRegistry.AggregationWrapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * DAO interface for table: Aggregation.
 * @author autogenerated
 */
@Transactional
public interface AggregationDao {
	List<AggregationWrapper> getAggregations(String parentId);
    boolean putAggregation(Aggregation aggregation);
}
