package com.alfa.emprestimos.app.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "funcionario")
public class Funcionario {

	@Id
    @SequenceGenerator(name = "funcionario_seq_gen", sequenceName = "funcionario_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="funcionario_seq_gen")
    private Long id;
	
	private String nome;
	
	private String cpf;
	
	private Date dataAdmissao;
	
	private String observacao;
	
	@ManyToOne
	private Cargo cargo;
	
	@ManyToOne
	private Setor setor;

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

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	
}
