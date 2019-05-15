package com.alfa.emprestimos.app.service;

import com.alfa.emprestimos.app.model.Funcionario;
import com.alfa.emprestimos.app.repository.FuncionarioRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionariosServiceImpl {

    @Autowired
    private FuncionarioRepositoryImpl funcionarioRepository;

    public List<Funcionario> getAll(){
        return funcionarioRepository.findAll();
    }
    
    public Funcionario inserir(Funcionario funcionario) {
    	funcionario.setId(null);

    	return funcionarioRepository.save(funcionario);
    }
    
    public Funcionario editar(Funcionario funcionario) {
    	return funcionarioRepository.save(funcionario);
    }
}
