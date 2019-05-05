package com.alfa.emprestimos.app.service;

import com.alfa.emprestimos.app.model.Emprestimo;
import com.alfa.emprestimos.app.repository.EmprestimoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

@Service
public class EmprestimosServiceImpl {

    @Autowired
    private EmprestimoRepositoryImpl emprestimoRepository;

    public Emprestimo inserir(Long valor){
    	Emprestimo emprestimo = new Emprestimo();
        emprestimo.setValor(valor);
        System.out.println("Inserindo emprestimo com valor " + valor);
        return emprestimoRepository.save(emprestimo);
    }

    public List<Emprestimo> getAll(){
        return emprestimoRepository.findAll();
    }
}
