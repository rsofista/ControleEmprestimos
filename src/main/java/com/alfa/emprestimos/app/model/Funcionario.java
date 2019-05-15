package com.alfa.emprestimos.app.model;

import javax.persistence.*;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Date;
import java.util.Optional;

@Entity
@Table(name = "funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	
	private String nome;
	
	private String cpf;
	
	private Date dataAdmissao;
	
	private String observacao;
	
	@ManyToOne
	private Cargo cargo;

	@ManyToOne
	private Setor setor;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String cpf, Date dataAdmissao, String observacao, @ModelAttribute Cargo cargo, @ModelAttribute Setor setor) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
		this.observacao = observacao;
		this.cargo = cargo;
		this.setor = setor;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
