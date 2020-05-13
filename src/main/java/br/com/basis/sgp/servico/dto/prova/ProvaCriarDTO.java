package br.com.basis.sgp.servico.dto.prova;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ProvaCriarDTO {

    @Size(min = 5, max = 80)
    @NotNull
    private String titulo;

    @NotNull
    private Integer percentualAprovacao;

}
