package com.alfa.emprestimos.app.model;

import javax.persistence.*;

@Entity
@Table(name = "cargo")
public class Cargo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	
	private String nome;
	
	public Cargo() {
		
	}

	public Cargo(String nome) {
		super();
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
