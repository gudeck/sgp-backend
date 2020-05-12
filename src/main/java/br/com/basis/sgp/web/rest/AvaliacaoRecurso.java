package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.AvaliacaoRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoRecurso {

    private AvaliacaoServico servico;

    public AvaliacaoRecurso(AvaliacaoServico servico) {
        this.servico = servico;
    }
}
