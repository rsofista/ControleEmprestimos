package com.alfa.emprestimos.app.resources;

import com.alfa.emprestimos.app.model.Funcionario;
import com.alfa.emprestimos.app.service.FuncionariosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioResourceImpl {

    @Autowired
    private FuncionariosServiceImpl funcionariosService;

    @GetMapping("")
    public ResponseEntity<List<Funcionario>> getAll(){
        return new ResponseEntity<>(funcionariosService.getAll(), HttpStatus.FOUND);
    }
}
