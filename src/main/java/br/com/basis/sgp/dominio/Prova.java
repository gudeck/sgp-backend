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

@Entity
@Getter
@Setter
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 80, nullable = false)
    private String titulo;

    @Column(nullable = false)
    private Integer percentualAprovacao;

    @ManyToMany
    @JoinTable(name = "prova_questao",
            joinColumns = @JoinColumn(name = "id_prova"),
            inverseJoinColumns = @JoinColumn(name = "id_questao"))
    private List<Questao> questoes;
}
