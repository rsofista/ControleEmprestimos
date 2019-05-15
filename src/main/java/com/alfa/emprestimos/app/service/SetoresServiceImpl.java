package com.alfa.emprestimos.app.service;

import com.alfa.emprestimos.app.model.Setor;
import com.alfa.emprestimos.app.repository.SetorRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SetoresServiceImpl {

    @Autowired
    private SetorRepositoryImpl setorRepository;

    public List<Setor> getAll(){
        return setorRepository.findAll();
    }
    
    public Optional<Setor> findById(Long id) {
    	return setorRepository.findById(id);
    }
}
