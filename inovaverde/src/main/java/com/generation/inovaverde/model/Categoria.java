package com.generation.inovaverde.model;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
=======
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
>>>>>>> origin/task6
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> origin/task6
>>>>>>> main
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome categoria é Obrigatório")
<<<<<<< HEAD
	@Size(min = 5, max = 255, message = "O atributo nome categoria deve conter no mínimo 5 e no máximo 255 caracteres")
	private String nome;

	@NotBlank(message = "O atributo subcategoria é Obrigatório")
	@Size(min = 5, max = 255, message = "O atributo subcategoria deve conter no mínimo 5 e no máximo 255 caracteres")
	private String subcategoria;
=======
	@Size(min = 5, max = 100, message = "O atributo nome categoria deve conter no mínimo 5 e no máximo 100 caracteres")
	private String nome;

	@NotBlank(message = "O atributo subcategoria é Obrigatório")
	@Size(min = 5, max = 100, message = "O atributo subcategoria deve conter no mínimo 5 e no máximo 100 caracteres")
	private String subcategoria;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
>>>>>>> origin/task6

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
<<<<<<< HEAD
=======
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
>>>>>>> origin/task6

}
