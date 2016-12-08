package org.codefromhell.test.repoloading;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
    Data findByKey(String key);
    List<Data> findByVal01(String val01);
}
