package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.ProvaRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provas")
public class ProvaRecurso {

    private final ProvaRepositorio repositorio;

    public ProvaRecurso(ProvaRepositorio repositorio) {
        this.repositorio = repositorio;
    }
}
