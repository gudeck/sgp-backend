package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.servico.UsuarioServico;
import br.com.basis.sgp.servico.dto.usuario.UsuarioAlterarDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioCriarDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioListarDTO;
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
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioRecurso implements Recurso<UsuarioDTO, UsuarioListarDTO, UsuarioCriarDTO, UsuarioAlterarDTO> {

    private final UsuarioServico servico;

    @Override
    @PostMapping
    public ResponseEntity<UsuarioDTO> criar(@Valid @RequestBody UsuarioCriarDTO usuario) {
        UsuarioDTO novoUsuario = servico.criar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }

    @Override
    @PutMapping
    public ResponseEntity<UsuarioDTO> alterar(@Valid @RequestBody UsuarioAlterarDTO usuario) {
        UsuarioDTO usuarioAtual = servico.alterar(usuario);
        return ResponseEntity.ok().body(usuarioAtual);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> buscar(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(servico.buscar(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<UsuarioDTO> excluir(@PathVariable("id") Long id) {
        servico.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @GetMapping
    public ResponseEntity<List<UsuarioListarDTO>> listar() {
        return ResponseEntity.ok().body(servico.listar());
    }

}
