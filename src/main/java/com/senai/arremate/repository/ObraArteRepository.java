package com.senai.arremate.repository;

import com.senai.arremate.entity.ObraArte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObraArteRepository extends JpaRepository<ObraArte, Long> {
}
