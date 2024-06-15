package com.prova.ProvaSpring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.ProvaSpring.model.Estante;
import com.prova.ProvaSpring.model.Livro;
import com.prova.ProvaSpring.service.EstanteService;
import com.prova.ProvaSpring.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroResource {

	
	@Autowired
	LivroService service;
	
	@Autowired
	EstanteService estanteService;
	
	@GetMapping
	public List<Livro> listaTodos(){
		return service.listaTodosLivros();
	}
	
	@GetMapping("/{id}")
	public Livro buscarPorCodigo(@PathVariable Integer id){
		return service.buscaPorCodigo(id);
	}
	
	@GetMapping("/estante/{id}")
	public List<Livro> buscarPorEstante(@PathVariable Integer id){
		Estante e = estanteService.buscaPorCodigo(id);
		return service.listaPorEstante(e);
	}
	
	@PostMapping
	public Livro cadastra(@RequestBody Livro l) {
		return service.insereLivro(l);
	}
	
	@PutMapping("/{id}")
	public Livro altera(@PathVariable Integer id, @RequestBody Livro l) {
		Livro antigo = service.buscaPorCodigo(id);
		antigo.setTitulo(l.getTitulo());
		antigo.setEstante(l.getEstante());
		return service.alteraLivro(antigo);
	}
	
	@DeleteMapping("/{id}")
	public void exclui(@PathVariable Integer id) {
		Livro antigo = service.buscaPorCodigo(id);
		service.excluiLivro(antigo);
	}
}