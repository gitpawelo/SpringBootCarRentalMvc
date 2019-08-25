package com.mycompany.repository;

import com.mycompany.model.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository<Engine, Long> {
}
