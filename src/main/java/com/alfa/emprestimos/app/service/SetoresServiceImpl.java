package com.alfa.emprestimos.app.service;

import com.alfa.emprestimos.app.model.Setor;
import com.alfa.emprestimos.app.repository.SetorRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SetoresServiceImpl {

    @Autowired
    private SetorRepositoryImpl setorRepository;

    public List<Setor> getAll(){
        return setorRepository.findAll();
    }
}
