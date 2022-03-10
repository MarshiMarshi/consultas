package br.com.etechoracio.consultas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.consultas.dao.HistoricoDAO;
import br.com.etechoracio.consultas.model.Historico;

@RestController
@RequestMapping("historicos")
public class HistoricoController {
    
    @Autowired
    private HistoricoDAO hisDAO;

    @GetMapping
    public List<Historico> procurar() {
        return hisDAO.findAll();
    }

    @PostMapping
    public ResponseEntity<Historico> inseriri(@RequestBody Historico body) {
        hisDAO.save(body);
        return ResponseEntity.ok(body);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Historico> atualizar(@PathVariable Integer id, @RequestBody Historico body) {
        Optional<Historico> resultado = hisDAO.findById(id);
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(hisDAO.save(body));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Historico> deletar(@PathVariable Integer id) {
        Optional<Historico> resultado = hisDAO.findById(id);
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        else {
            hisDAO.deleteById(id);;
            return ResponseEntity.ok().build();
        }
    }
}
