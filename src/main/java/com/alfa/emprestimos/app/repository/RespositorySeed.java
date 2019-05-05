package com.alfa.emprestimos.app.repository;

import com.alfa.emprestimos.app.model.Emprestimo;
import com.alfa.emprestimos.app.model.ParcelaEmprestimo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class RespositorySeed {

    @Autowired
    private EmprestimoRepositoryImpl emprestimoRepository;

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        System.out.print("Evento: " + event);
        
        emprestimoRepository.saveAll(criarEmprestimos());
    }

    private List<Emprestimo> criarEmprestimos(){
        List<Emprestimo> emprestimos = new ArrayList<>();
        emprestimos.add(new Emprestimo(100l));
        emprestimos.add(new Emprestimo(101l));
        emprestimos.add(new Emprestimo(102l));
        emprestimos.add(new Emprestimo(103l));
        emprestimos.add(new Emprestimo(104l));
        emprestimos.add(new Emprestimo(105l));
        emprestimos.add(new Emprestimo(106l));
        emprestimos.add(new Emprestimo(107l));
        emprestimos.add(new Emprestimo(108l));
        emprestimos.add(new Emprestimo(109l));
        
        Emprestimo emp = new Emprestimo(109l);
        
        Set<ParcelaEmprestimo> parcelas = new HashSet<ParcelaEmprestimo>();
        
        parcelas.add(new ParcelaEmprestimo());
        
        emp.setParcelas(parcelas);
        
        return emprestimos;
    }

}
