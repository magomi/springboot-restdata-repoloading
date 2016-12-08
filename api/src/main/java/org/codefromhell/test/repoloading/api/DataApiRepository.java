package org.codefromhell.test.repoloading.api;

import org.codefromhell.test.repoloading.Data;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "data", path = "data")
public interface DataApiRepository extends PagingAndSortingRepository<Data, Long> {
    Data findByKey(@Param("key") String key);
}
