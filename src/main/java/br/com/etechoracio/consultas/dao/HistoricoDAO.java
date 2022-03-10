package br.com.etechoracio.consultas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.consultas.model.Historico;

public interface HistoricoDAO extends JpaRepository<Historico, Integer> {
    
}
