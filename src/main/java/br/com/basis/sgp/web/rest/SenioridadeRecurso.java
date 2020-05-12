package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.SenioridadeRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/senioridades")
public class SenioridadeRecurso {

    private final SenioridadeRepositorio repositorio;

    public SenioridadeRecurso(SenioridadeRepositorio repositorio) {
        this.repositorio = repositorio;
    }
}
