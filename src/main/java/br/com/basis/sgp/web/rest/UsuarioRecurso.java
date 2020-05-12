package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.UsuarioRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRecurso {

    private final UsuarioRepositorio repositorio;

    public UsuarioRecurso(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }
}
