package com.alfa.emprestimos.app.model;

import javax.persistence.*;

@Entity
@Table(name = "setor")
public class Setor {
	
	@Id
    @SequenceGenerator(name = "setor_seq_gen", sequenceName = "setor_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="setor_seq_gen")
    private Long id;
	
	private String nome;

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
