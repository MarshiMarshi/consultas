package br.com.etechoracio.consultas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.consultas.enums.EspecialidadeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "medico")
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crm_med")
    private Integer crm;

    @Column(name = "nome_med")
    private String nome;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "esp_med")
    private EspecialidadeEnum especialidade;
}
