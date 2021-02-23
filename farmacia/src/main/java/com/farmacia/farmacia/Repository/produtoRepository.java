package com.farmacia.farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.farmacia.model.produtos;


@Repository
public interface produtoRepository extends JpaRepository<produtos, Long> {
	public List<produtos> findAllByNomeContainingIgnoreCase(String nome);
}
	
