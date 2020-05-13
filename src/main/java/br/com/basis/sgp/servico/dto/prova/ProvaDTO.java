package br.com.basis.sgp.servico.dto.prova;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProvaDTO {

    private Long id;
    private String titulo;
    private Integer percentualAprovacao;

}
