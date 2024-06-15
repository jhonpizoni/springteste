package com.prova.ProvaSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prova.ProvaSpring.model.Estante;
import com.prova.ProvaSpring.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

	List<Livro> findByEstante(Estante e);
}