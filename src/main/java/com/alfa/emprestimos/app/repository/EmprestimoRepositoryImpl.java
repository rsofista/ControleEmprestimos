package com.alfa.emprestimos.app.repository;

import com.alfa.emprestimos.app.model.Emprestimo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

@Repository
public interface EmprestimoRepositoryImpl extends CrudRepository<Emprestimo, Long> {

    @Override
    List<Emprestimo> findAll();
}
