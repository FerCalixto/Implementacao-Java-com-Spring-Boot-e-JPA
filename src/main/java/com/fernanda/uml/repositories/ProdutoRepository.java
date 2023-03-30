package com.fernanda.uml.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernanda.uml.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{


}
