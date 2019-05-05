package com.alfa.emprestimos.app.resources;

import com.alfa.emprestimos.app.model.Cargo;
import com.alfa.emprestimos.app.service.CargosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoResourceImpl {

    @Autowired
    private CargosServiceImpl cargosService;

    @GetMapping("")
    public ResponseEntity<List<Cargo>> getAll(){
        return new ResponseEntity<>(cargosService.getAll(), HttpStatus.FOUND);
    }
}
