package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.QuestaoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questoes")
public class QuestaoRecurso {

    private final QuestaoRepository repository;

    public QuestaoRecurso(QuestaoRepository repository) {
        this.repository = repository;
    }

}
