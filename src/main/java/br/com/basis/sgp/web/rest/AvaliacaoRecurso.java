package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.AvaliacaoRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoRecurso {

    private final AvaliacaoRepositorio repositorio;

    public AvaliacaoRecurso(AvaliacaoRepositorio repositorio) {
        this.repositorio = repositorio;
    }
}
