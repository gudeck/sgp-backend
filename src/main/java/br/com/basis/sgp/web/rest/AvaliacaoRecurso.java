package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.dominio.Avaliacao;
import br.com.basis.sgp.servico.AvaliacaoServico;
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
@RequestMapping("/avaliacoes")
@RequiredArgsConstructor
public class AvaliacaoRecurso {

    private final AvaliacaoServico servico;

    @GetMapping
    public ResponseEntity<List<Avaliacao>> listar() {
        List<Avaliacao> avaliacoes = this.servico.listar();
        return ResponseEntity.ok(avaliacoes);
    }

    @PostMapping
    public ResponseEntity<Avaliacao> criar(@Valid @RequestBody Avaliacao avaliacao) {
        avaliacao = this.servico.salvar(avaliacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacao);
    }

    @PutMapping
    public ResponseEntity<Avaliacao> alterar(@Valid @RequestBody Avaliacao avaliacao) {
        avaliacao = this.servico.salvar(avaliacao);
        return ResponseEntity.status(HttpStatus.OK).body(avaliacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Avaliacao> excluir(@PathVariable("id") Long id) {
        this.servico.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
