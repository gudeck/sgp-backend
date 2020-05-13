package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.servico.ProvaServico;
import br.com.basis.sgp.servico.dto.prova.ProvaCriarDTO;
import br.com.basis.sgp.servico.dto.prova.ProvaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/provas")
@RequiredArgsConstructor
public class ProvaRecurso implements Recurso<ProvaDTO, ProvaDTO, ProvaCriarDTO, ProvaDTO> {

    private final ProvaServico servico;

    @Override
    @PostMapping
    public ResponseEntity<ProvaDTO> criar(@Valid ProvaCriarDTO usuario) {
        return null;
    }

    @Override
    @PutMapping
    public ResponseEntity<ProvaDTO> alterar(@Valid ProvaDTO usuario) {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ProvaDTO> buscar(Long id) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<ProvaDTO> excluir(Long id) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<ProvaDTO>> listar() {
        return null;
    }
}
