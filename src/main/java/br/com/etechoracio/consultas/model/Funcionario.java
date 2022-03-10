package br.com.etechoracio.consultas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mat_fun")
    private Integer matricula;

    @Column(name = "nome_fun")
    private String nome;

    @Column(name = "fone_fun", columnDefinition = "char")
    private String fone;
}
