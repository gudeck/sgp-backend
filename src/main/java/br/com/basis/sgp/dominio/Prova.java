package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity(name = "PROVA")
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TITULO", nullable = false)
    private String titulo;

    @Column(name = "PERCENTUAL_APROVACAO", nullable = false)
    private Integer percentualAprovacao;

    @ManyToMany
    @JoinTable(name = "PROVA_QUESTAO",
            joinColumns = @JoinColumn(name = "ID_PROVA"),
            inverseJoinColumns = @JoinColumn(name = "ID_QUESTAO"))
    private List<Questao> questoes;
}
