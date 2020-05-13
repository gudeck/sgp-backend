package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.dominio.Questao;
import br.com.basis.sgp.servico.QuestaoServico;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/questoes")
@RequiredArgsConstructor
public class QuestaoRecurso {

    private final QuestaoServico servico;

    @GetMapping
    public ResponseEntity<List<Questao>> listar() {
        List<Questao> questoes = this.servico.listar();
        return ResponseEntity.ok(questoes);
    }

    @PostMapping
    public ResponseEntity<Questao> criar(@Valid @RequestBody Questao questao) {
        questao = this.servico.salvar(questao);
        return ResponseEntity.status(HttpStatus.CREATED).body(questao);
    }

    @PutMapping
    public ResponseEntity<Questao> alterar(@Valid @RequestBody Questao questao) {
        questao = this.servico.salvar(questao);
        return ResponseEntity.status(HttpStatus.OK).body(questao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Questao> excluir(@PathVariable("id") Long id) {
        this.servico.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    public QuestaoRecurso(QuestaoRepository repository) {
        this.repository = repository;
    }

}
