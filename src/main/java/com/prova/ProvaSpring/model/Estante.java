package com.prova.ProvaSpring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String genero;
	
	public Estante() {

	}
	
	public Estante(Integer id, String genero) {
		super();
		this.id = id;
		this.genero = genero;
		
	}
	
	@Override
	public String toString() {
		return "Estante [id=" + id + ", genero=" + genero + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}