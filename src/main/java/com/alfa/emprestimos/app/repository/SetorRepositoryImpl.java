package com.alfa.emprestimos.app.repository;

import com.alfa.emprestimos.app.model.Setor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SetorRepositoryImpl extends CrudRepository<Setor, Long> {

    @Override
    List<Setor> findAll();
}
