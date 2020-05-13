package br.com.basis.sgp.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface Recurso<ClasseDTO, ListaDTO, CriarDTO, AlterarDTO> {
    @PostMapping
    ResponseEntity<ClasseDTO> criar(@Valid @RequestBody CriarDTO usuario);

    @PutMapping
    ResponseEntity<ClasseDTO> alterar(@Valid @RequestBody AlterarDTO usuario);

    @GetMapping("/{id}")
    ResponseEntity<ClasseDTO> buscar(@PathVariable("id") Long id);

    @DeleteMapping("/{id}")
    ResponseEntity<ClasseDTO> excluir(@PathVariable("id") Long id);

    @GetMapping
    ResponseEntity<List<ListaDTO>> listar();
}
