package com.generation.inovaverde.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome categoria é Obrigatório")
	@Size(min = 5, max = 255, message = "O atributo nome categoria deve conter no mínimo 5 e no máximo 255 caracteres")
	private String nome;

	@NotBlank(message = "O atributo subcategoria é Obrigatório")
	@Size(min = 5, max = 255, message = "O atributo subcategoria deve conter no mínimo 5 e no máximo 255 caracteres")
	private String subcategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long idCategoria) {
		this.id = idCategoria;
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

}
