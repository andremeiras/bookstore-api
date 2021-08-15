package com.andremeiras.bookstore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.andremeiras.bookstore.Livro;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;

	@OneToMany(mappedBy = "categoria")
	private List<Livro> livros = new ArrayList<Livro>();

	public Categoria(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
}
