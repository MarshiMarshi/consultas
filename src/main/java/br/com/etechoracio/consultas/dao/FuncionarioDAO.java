package br.com.etechoracio.consultas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.consultas.model.Funcionario;

public interface FuncionarioDAO extends JpaRepository<Funcionario, Integer> {
    
}
