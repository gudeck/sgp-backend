package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.servico.ProvaServico;
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
@RequestMapping("/provas")
@RequiredArgsConstructor
public class ProvaRecurso {

    private final ProvaServico servico;

    @GetMapping
    public ResponseEntity<List<Prova>> listar() {
        List<Prova> provas = this.servico.listar();
        return ResponseEntity.ok(provas);
    }

    @PostMapping
    public ResponseEntity<Prova> criar(@Valid @RequestBody Prova prova) {
        prova = this.servico.salvar(prova);
        return ResponseEntity.status(HttpStatus.CREATED).body(prova);
    }

    @PutMapping
    public ResponseEntity<Prova> alterar(@Valid @RequestBody Prova prova) {
        prova = this.servico.salvar(prova);
        return ResponseEntity.status(HttpStatus.OK).body(prova);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Prova> excluir(@PathVariable("id") Long id) {
        this.servico.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
