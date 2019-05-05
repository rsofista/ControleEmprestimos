package com.alfa.emprestimos.app.repository;

import com.alfa.emprestimos.app.model.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CargoRepositoryImpl extends CrudRepository<Cargo, Long> {

    @Override
    List<Cargo> findAll();
}
