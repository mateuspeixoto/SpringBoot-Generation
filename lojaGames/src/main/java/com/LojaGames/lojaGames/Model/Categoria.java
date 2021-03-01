package com.LojaGames.lojaGames.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 1, max =100)
	private String titulo;
	
	@NotNull
	@Size(min = 1, max =100)
	private String descricao;
	
	@NotNull
	private Long corredor;
	
	@OneToMany(mappedBy = "categoria" , cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoGame> produtos;

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

	public Long getCorredor() {
		return corredor;
	}

	public void setCorredor(Long corredor) {
		this.corredor = corredor;
	}

	public List<ProdutoGame> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoGame> produtos) {
		this.produtos = produtos;
	}
	
	

	

}
