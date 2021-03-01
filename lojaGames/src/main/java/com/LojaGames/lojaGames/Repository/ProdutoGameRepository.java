package com.LojaGames.lojaGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaGames.lojaGames.Model.ProdutoGame;

@Repository
public interface ProdutoGameRepository extends JpaRepository<ProdutoGame, Long> {
	public List<ProdutoGame> findAllByNomeContainingIgnoreCase(String nome);


}
