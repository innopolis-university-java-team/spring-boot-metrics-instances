package org.some.api.repository;

import org.some.api.model.entity.SomeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @project some-api
 * @created 2021-07-06 17:23
 * <p>
 * @author Alexander A. Kropotin
 */
@Repository("SomeDataRepository")
public interface SomeDataRepository extends JpaRepository<SomeData, Integer> {
}