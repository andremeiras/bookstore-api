package com.andremeiras.bookstore;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.andremeiras.bookstore.domain.Categoria;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String nome_autor;
	private String texto;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	public Livro(String titulo, String nome_autor, String texto, Categoria categoria) {
		super();
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.texto = texto;
		this.categoria = categoria;
	}

}
