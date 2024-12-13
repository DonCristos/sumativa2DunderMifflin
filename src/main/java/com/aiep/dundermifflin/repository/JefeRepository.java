package com.aiep.dundermifflin.repository;

import com.aiep.dundermifflin.domain.Jefe;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Jefe entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JefeRepository extends JpaRepository<Jefe, Long> {}
