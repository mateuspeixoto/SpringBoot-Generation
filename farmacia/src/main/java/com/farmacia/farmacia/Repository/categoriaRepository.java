package com.farmacia.farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.farmacia.model.categoria;

@Repository
public interface categoriaRepository extends JpaRepository<categoria,Long>{
		public List<categoria> findAllByTituloContainingIgnoreCase (String titulo);
	}

	

