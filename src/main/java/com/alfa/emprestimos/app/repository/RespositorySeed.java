package com.alfa.emprestimos.app.repository;

import com.alfa.emprestimos.app.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class RespositorySeed {

    @Autowired
    private EmprestimoRepositoryImpl emprestimoRepository;

    @Autowired
    private FuncionarioRepositoryImpl funcionarioRepository;
    
    @Autowired
    private SetorRepositoryImpl setorRepository;

    @Autowired
    private CargoRepositoryImpl cargoRepository;

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        Cargo cargoProgramador = new Cargo("Programador");
        Cargo cargoFaxineiro   = new Cargo("Faxineiro");
        Cargo cargoGerente     = new Cargo("Gerente");
        Setor setorRH          = new Setor("RH");
        Setor setorTI          = new Setor("TI");
                
        cargoRepository.save(cargoProgramador);
        cargoRepository.save(cargoFaxineiro);
        cargoRepository.save(cargoGerente);
        
        setorRepository.save(setorRH);
        setorRepository.save(setorTI);
        
        List<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Funcionario("Lucas Steffen", "07510034922", new Date(), null, cargoProgramador, setorTI));
    	funcionarios.add(new Funcionario("Zonatan Zonat", "07541687411", new Date(), null, cargoProgramador, setorRH));
    	funcionarios.add(new Funcionario("Marcos Itoa",   "54878451488", new Date(), null, cargoProgramador, setorTI));
    	funcionarios.add(new Funcionario("Zonatan Jó",    "07541687411", new Date(), "Nome possívelmente incorreto", cargoGerente, setorTI));
    	funcionarios.add(new Funcionario("Don Mort",      "07541687411", new Date(), "Nome possívelmente incorreto", cargoFaxineiro, null));
    	
    	funcionarioRepository.saveAll(funcionarios);
    	
    	List<Emprestimo> emprestimos = new ArrayList<>();
    	
    	emprestimos.add(new Emprestimo(new Date(), funcionarios.get(0), new BigDecimal(1187.45), 3, null));
    	emprestimos.add(new Emprestimo(new Date(), funcionarios.get(1), new BigDecimal(257.85),  6, null));
    	emprestimos.add(new Emprestimo(new Date(), funcionarios.get(2), new BigDecimal(5668.00), 12, null));
    	emprestimos.add(new Emprestimo(new Date(), funcionarios.get(3), new BigDecimal(888.60),  24, null));
    	
    	emprestimoRepository.saveAll(emprestimos);
    }
}
