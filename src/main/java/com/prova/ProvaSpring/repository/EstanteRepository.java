package com.prova.ProvaSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prova.ProvaSpring.model.Estante;

public interface EstanteRepository extends JpaRepository<Estante, Integer>{
	public Estante findByGenero(String genero);
	
}