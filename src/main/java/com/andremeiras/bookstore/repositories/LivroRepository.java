package com.andremeiras.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andremeiras.bookstore.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
