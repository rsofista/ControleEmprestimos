package com.alfa.emprestimos.dto;

import java.math.BigDecimal;
import java.util.Date;

public class EmprestimoDto {
	private Long id;
    
    private Date dataOperacao;
    
    private FuncionarioDto funcionario;
    
    private BigDecimal valor;
    
    private Integer quantidadeParcelas;
}
