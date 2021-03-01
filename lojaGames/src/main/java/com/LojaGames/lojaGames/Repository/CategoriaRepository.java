package com.LojaGames.lojaGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaGames.lojaGames.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long >{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);

}
