package br.com.etechoracio.consultas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.consultas.dao.FuncionarioDAO;
import br.com.etechoracio.consultas.model.Funcionario;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioDAO funDAO;

    @GetMapping
    public List<Funcionario> procurar() {
        return funDAO.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> inserir(@RequestBody Funcionario body) {
        funDAO.save(body);
        return ResponseEntity.ok(body);
    }
}
