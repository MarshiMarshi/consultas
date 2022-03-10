package br.com.etechoracio.consultas.model;

import java.time.LocalDate;

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
@Table(name = "exame")
public class Exame {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_exa")
    private Integer cod;

    @Column(name = "dt_val")
    private LocalDate dataValidade;

    @Column(name = "nome_exa")
    private String nome;
}
