package br.com.etechoracio.consultas.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "paciente")
public class Paciente {
    
    @Id
    @Column(name = "cpf_pac", columnDefinition = "char")
    private String cpf;

    @Column(name = "nome_pac")
    private String nome;

    @Column(name = "dt_nasc")
    private LocalDate dataNascimento;
}
