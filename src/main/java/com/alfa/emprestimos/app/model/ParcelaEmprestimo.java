package com.alfa.emprestimos.app.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "parcela")
public class ParcelaEmprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	
	private Integer numero;
	
	private BigDecimal valorParcela;
	
	private BigDecimal valorPago;
	
	private Date dataVencimento;
}
