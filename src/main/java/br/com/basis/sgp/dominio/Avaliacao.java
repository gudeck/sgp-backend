package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Calendar;

@Getter
@Setter
@Entity(name = "AVALIACAO")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATA_AVALIACAO", nullable = false)
    private Calendar dataAvaliacao;

    @Column(name = "APROVEITAMENTO", nullable = false)
    private Integer aproveitamento;

    @ManyToOne
    @JoinColumn(name = "ID_CANDIDATO", nullable = false)
    private Usuario candidato;

    @ManyToOne
    @JoinColumn(name = "ID_PROVA", nullable = false)
    private Prova prova;

}


