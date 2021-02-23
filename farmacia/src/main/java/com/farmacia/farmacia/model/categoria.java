package com.farmacia.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@javax.validation.constraints.NotNull
	@Size(min = 5, max = 100)
	private String titulo;
	
	@javax.validation.constraints.NotNull
	@Size(min = 5, max = 100)
	private String descricao;
	
	@javax.validation.constraints.NotNull
	private Long setor;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<produtos> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getSetor() {
		return setor;
	}

	public void setSetor(Long setor) {
		this.setor = setor;
	}

	public List<produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<produtos> produtos) {
		this.produtos = produtos;
	}
	

	

}
