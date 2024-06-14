package com.prova.ProvaSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.ProvaSpring.model.Estante;
import com.prova.ProvaSpring.repository.EstanteRepository;

@Service
public class EstanteService {

	@Autowired
	EstanteRepository repository;
	
	public Estante insereEstante(Estante e) {
		return repository.save(e);
	}
	
	public Estante alteraEstante(Estante e) {
		return repository.save(e);
	}
	
	public Estante buscaPorCodigo(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public Estante buscaPorGenero(String genero) {
		return repository.findByGenero(genero);
	}
	
	public void excluiEstante(Estante e) {
		repository.delete(e);
	}
	
	public List<Estante> listaTodasEstantes(){
		return repository.findAll();
	}

	
}
