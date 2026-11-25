package com.senai.arremate.repository;

import com.senai.arremate.entity.Lance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanceRepository extends JpaRepository<Lance, Long> {
}
