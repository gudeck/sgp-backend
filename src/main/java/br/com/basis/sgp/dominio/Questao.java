package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 400, nullable = false)
    private String descricao;

    @Column(length = 400, nullable = false)
    private String alternativa1;

    @Column(length = 400, nullable = false)
    private String alternativa2;

    @Column(length = 400, nullable = false)
    private String alternativa3;

    @Column(length = 400, nullable = false)
    private String alternativa4;

    @Column(length = 400, nullable = false)
    private String alternativa5;

    @Column(nullable = false)
    private Integer resposta;

    @ManyToOne(optional = false)
    private Senioridade senioridade;

    @ManyToOne(optional = false)
    private TipoQuestao tipoQuestao;

}
