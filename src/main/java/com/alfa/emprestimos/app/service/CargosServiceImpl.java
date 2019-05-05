package com.alfa.emprestimos.app.service;

import com.alfa.emprestimos.app.model.Cargo;
import com.alfa.emprestimos.app.repository.CargoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CargosServiceImpl {

    @Autowired
    private CargoRepositoryImpl cargoRepository;

    public List<Cargo> getAll(){
        return cargoRepository.findAll();
    }
}
