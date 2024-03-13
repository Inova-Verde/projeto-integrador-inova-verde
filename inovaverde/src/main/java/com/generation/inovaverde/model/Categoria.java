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
	private Long id_categoria;

	@NotBlank(message = "O atributo nome categoria é Obrigatório")
	@Size(min = 5, max = 255, message = "O atributo nome categoria deve conter no mínimo 5 e no máximo 255 caracteres")
	private String nome_categoria;

	@NotBlank(message = "O atributo subcategoria é Obrigatório")
	@Size(min = 5, max = 255, message = "O atributo subcategoria deve conter no mínimo 5 e no máximo 255 caracteres")
	private String subcategoria;

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNome_categoria() {
		return nome_categoria;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

}
