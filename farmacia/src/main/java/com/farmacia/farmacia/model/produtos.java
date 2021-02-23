package com.farmacia.farmacia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produtos")
public class produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produtos;
	
	@NotNull
	@Size(min = 1, max = 100)
	private String nome;
	
	
	
	private Long qtd;
	
	@ManyToOne()
	@JsonIgnoreProperties("produtos")
	private categoria categoria;

	public Long getId_produtos() {
		return id_produtos;
	}

	public void setId_produtos(Long id_produtos) {
		this.id_produtos = id_produtos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getQtd() {
		return qtd;
	}

	public void setQtd(Long qtd) {
		this.qtd = qtd;
	}

	public categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}
	



}

