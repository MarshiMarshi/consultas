package br.com.etechoracio.consultas.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "consulta")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cons")
    private Integer cod;

    @Column(name = "dt_cons")
    private LocalDate dataConsulta;

    @Column(name = "hora_cons")
    private LocalTime horaConsulta;

    @ManyToOne
    @JoinColumn(name = "cpf_pac", columnDefinition = "char")
    private Paciente cpf;

    @ManyToOne
    @JoinColumn(name = "mat_fun")
    private Funcionario matricula;

    @ManyToOne
    @JoinColumn(name = "cod_histo")
    private Historico codHisto;

    @ManyToOne
    @JoinColumn(name = "crm_med")
    private Medico crm;

    @ManyToMany
    @JoinTable(name = "con_exa", joinColumns = @JoinColumn(name = "cod_cons"), inverseJoinColumns = @JoinColumn(name = "cod_exa"))
    private List<Exame> exames;
}
