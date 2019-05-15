package com.alfa.emprestimos.app.resources;

import com.alfa.emprestimos.app.model.Cargo;
import com.alfa.emprestimos.app.model.Funcionario;
import com.alfa.emprestimos.app.model.Setor;
import com.alfa.emprestimos.app.service.CargosServiceImpl;
import com.alfa.emprestimos.app.service.FuncionariosServiceImpl;
import com.alfa.emprestimos.app.service.SetoresServiceImpl;
import com.alfa.emprestimos.dto.FuncionarioDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioResourceImpl {
	
	@Autowired
    private ModelMapper modelMapper;

    @Autowired
    private FuncionariosServiceImpl funcionariosService;
    
    @Autowired
    private CargosServiceImpl cargosService;
    
    @Autowired
    private SetoresServiceImpl setoresService;

    @GetMapping("")
    public ResponseEntity<List<Funcionario>> getAll() {
        return new ResponseEntity<>(funcionariosService.getAll(), HttpStatus.FOUND);
    }
    
    @PostMapping("/inserir")
    public ResponseEntity<Funcionario> inserir(@RequestBody FuncionarioDto funcionarioDto) {
    	Funcionario funcionario = dtoToFuncionario(funcionarioDto);
    	funcionario.setId(null);
    	
    	funcionario = funcionariosService.inserir(funcionario);
        return new ResponseEntity<>(funcionario, HttpStatus.FOUND);
    }
    
    @PostMapping("/editar")
    public ResponseEntity<Funcionario> editar(@RequestBody FuncionarioDto funcionarioDto) {
    	Funcionario funcionario = dtoToFuncionario(funcionarioDto);

    	if (funcionario.getId() != null) {
	    	funcionario = funcionariosService.editar(funcionario);
	        return new ResponseEntity<>(funcionario, HttpStatus.FOUND);
    	}
    	else {
    		return new ResponseEntity<>(new Funcionario(), HttpStatus.FOUND);
    	}
    }
    
    private Funcionario dtoToFuncionario(FuncionarioDto funcionarioDto) {
    	Funcionario funcionario = modelMapper.map(funcionarioDto, Funcionario.class);
    	Optional<Cargo> cargo   = cargosService.findById(funcionarioDto.getCargoId());
    	Optional<Setor> setor   = setoresService.findById(funcionarioDto.getCargoId());    	
    	    	
    	funcionario.setCargo(cargo.orElse(null));
    	funcionario.setSetor(setor.orElse(null));
    	return funcionario;
    }
}
