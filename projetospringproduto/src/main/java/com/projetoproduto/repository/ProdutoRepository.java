package com.projetoproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoproduto.entities.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

}
