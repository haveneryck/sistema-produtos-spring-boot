package com.haveneryck.meu_projeto_springboot.repository;

import com.haveneryck.meu_projeto_springboot.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}