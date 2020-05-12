package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.UsuarioRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRecurso {

    private final UsuarioServico servico;

    public UsuarioRecurso(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
        Usuario usuario = servico.buscarPorId(id);
        if (usuario == null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return this.servico.listar();
    }

    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario) {
        usuario = servico.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @PutMapping
    public ResponseEntity<Usuario> alterar(@RequestBody Usuario usuario) {
//        Usuario usuarioSalvo = servico.buscarPorId(usuario.getId());
//        if (usuarioSalvo == null)
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//
//        BeanUtils.copyProperties(usuarioSalvo, usuario);
//        servico.salvar(usuario);
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @DeleteMapping
    public ResponseEntity<Usuario> excluir(@RequestBody Usuario usuario) {
//        servico.excluir(usuario);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
