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
@Table(name = "historico")
public class Historico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_histo")
    private Integer codigo;

    @Column(name = "dt_cad")
    private LocalDate dataCadastro;

    @Column(name = "observacao")
    private String descricao;
}
