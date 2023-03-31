package com.fernanda.uml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernanda.uml.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{


}
