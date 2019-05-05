package com.alfa.emprestimos.app.repository;

import com.alfa.emprestimos.app.model.Funcionario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepositoryImpl extends CrudRepository<Funcionario, Long> {

    @Override
    List<Funcionario> findAll();
}
