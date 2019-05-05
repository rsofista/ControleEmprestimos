package com.alfa.emprestimos.app.model;

import javax.persistence.*;

@Entity
@Table(name = "setor")
public class Setor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	
	private String nome;
	
	public Setor() {
		
	}

	public Setor(String nome) {
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
