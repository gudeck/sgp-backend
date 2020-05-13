package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.dominio.TipoQuestao;
import br.com.basis.sgp.servico.TipoQuestaoServico;
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
@RequestMapping("/tipos-questao")
@RequiredArgsConstructor
public class TipoQuestaoRecurso {

    private final TipoQuestaoServico servico;

    @GetMapping
    public ResponseEntity<List<TipoQuestao>> listar() {
        List<TipoQuestao> tiposQuestao = this.servico.listar();
        return ResponseEntity.ok(tiposQuestao);
    }

    @PostMapping
    public ResponseEntity<TipoQuestao> criar(@Valid @RequestBody TipoQuestao tipoQuestao) {
        tipoQuestao = this.servico.salvar(tipoQuestao);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoQuestao);
    }

    @PutMapping
    public ResponseEntity<TipoQuestao> alterar(@Valid @RequestBody TipoQuestao tipoQuestao) {
        tipoQuestao = this.servico.salvar(tipoQuestao);
        return ResponseEntity.status(HttpStatus.OK).body(tipoQuestao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TipoQuestao> excluir(@PathVariable("id") Long id) {
        this.servico.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
