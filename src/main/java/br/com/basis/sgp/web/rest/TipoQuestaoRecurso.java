package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.TipoQuestaoRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipos-questao")
public class TipoQuestaoRecurso {

    private final TipoQuestaoRepositorio repositorio;

    public TipoQuestaoRecurso(TipoQuestaoRepositorio repositorio) {
        this.repositorio = repositorio;
    }
}
