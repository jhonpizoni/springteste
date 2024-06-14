package com.prova.ProvaSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.ProvaSpring.model.Estante;
import com.prova.ProvaSpring.model.Livro;
import com.prova.ProvaSpring.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	LivroRepository repository;
	
	public Livro insereLivro(Livro l) {
		return repository.save(l);
	}
	
	public Livro alteraLivro(Livro l) {
		return repository.save(l);
	}
	
	public Livro buscaPorCodigo(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public void excluiLivro(Livro l) {
		repository.delete(l);
	}
	
	public List<Livro> listaTodosLivros(){
		return repository.findAll();
	}
	
	public List<Livro> listaPorEstante(Estante e){
		return repository.findByEstante(e);
	}
	
}
