package com.senai.arremate.repository;

import com.senai.arremate.entity.Colecionador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColecionadorRepository extends JpaRepository<Colecionador, Long> {
}
