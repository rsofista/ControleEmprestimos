package com.alfa.emprestimos.app.resources;

import com.alfa.emprestimos.app.model.Setor;
import com.alfa.emprestimos.app.service.SetoresServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setores")
public class SetorResourceImpl {

    @Autowired
    private SetoresServiceImpl setoresService;

    @GetMapping("")
    public ResponseEntity<List<Setor>> getAll(){
        return new ResponseEntity<>(setoresService.getAll(), HttpStatus.FOUND);
    }
}
