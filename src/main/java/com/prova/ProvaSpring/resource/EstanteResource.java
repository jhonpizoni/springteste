package com.prova.ProvaSpring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.ProvaSpring.model.Estante;
import com.prova.ProvaSpring.service.EstanteService;

@RestController
@RequestMapping("/estante")
public class EstanteResource {

	
	@Autowired
	EstanteService service;
	
	@GetMapping
	public List<Estante> listaTodas(){
		return service.listaTodasEstantes();
	}
	
	@GetMapping("/{id}")
	public Estante buscarPorCodigo(@PathVariable Integer id){
		return service.buscaPorCodigo(id);
	}
	
	@GetMapping("/genero/{genero}")
	public Estante buscarPorGenero(@PathVariable String genero){
		return service.buscaPorGenero(genero);
	}
	
	@PostMapping
	public Estante cadastra(@RequestBody Estante e) {
		return service.insereEstante(e);
	}

}
