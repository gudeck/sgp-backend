package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.UsuarioRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioRecurso {

    private final UsuarioServico servico;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        List<Usuario> usuarios = this.servico.listar();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> criar(@Valid @RequestBody Usuario usuario) {
        usuario = this.servico.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @PutMapping
    public ResponseEntity<Usuario> alterar(@Valid @RequestBody Usuario usuario) {
        usuario = this.servico.salvar(usuario);
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> excluir(@PathVariable("id") Long id) {
        this.servico.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
