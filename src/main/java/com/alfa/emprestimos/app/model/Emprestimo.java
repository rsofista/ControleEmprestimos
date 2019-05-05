package com.alfa.emprestimos.app.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private Date dataOperacao;
    
    @ManyToOne
    private Funcionario funcionario;
    
    private BigDecimal valor;
    
    private Integer quantidadeParcelas;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<ParcelaEmprestimo> parcelas;
      
    
    @Override
    public String toString() {
        return "EmprestimoEntity{" +
                "id=" + id +
                ", valor=" + valor +
                '}';
    }

    public Emprestimo() {

    }
    
    public Emprestimo(Date dataOperacao, Funcionario funcionario, BigDecimal valor, Integer quantidadeParcelas,
			Set<ParcelaEmprestimo> parcelas) {
		super();
		this.dataOperacao = dataOperacao;
		this.funcionario = funcionario;
		this.valor = valor;
		this.quantidadeParcelas = quantidadeParcelas;
		this.parcelas = parcelas;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public Date getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public void setValor(Long valor) {
		this.setValor(new BigDecimal(valor));		
	}

	public Set<ParcelaEmprestimo> getParcelas() {
		return parcelas;
	}

	public void setParcelas(Set<ParcelaEmprestimo> parcelas) {
		this.parcelas = parcelas;
	}
}
