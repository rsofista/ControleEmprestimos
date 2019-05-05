package com.alfa.emprestimos.app.resources;

import com.alfa.emprestimos.app.model.Emprestimo;
import com.alfa.emprestimos.app.service.EmprestimosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoResourceImpl {

    @Autowired
    private EmprestimosServiceImpl emprestimosService;

    @GetMapping("/inserir/{valor}")
    public ResponseEntity<Emprestimo> inserir(@PathVariable("valor") Long valor) {
    	Emprestimo emprestimoInserido = emprestimosService.inserir(valor);
        return new ResponseEntity<Emprestimo>(emprestimoInserido, HttpStatus.FOUND);
    }

    @GetMapping("")
    public ResponseEntity<List<Emprestimo>> getAll(){
        return new ResponseEntity<>(emprestimosService.getAll(), HttpStatus.FOUND);
    }


}
