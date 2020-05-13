package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.repositorio.SenioridadeRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/senioridades")
@RequiredArgsConstructor
public class SenioridadeRecurso {

    private final SenioridadeServico servico;

    @GetMapping
    public ResponseEntity<List<Senioridade>> listar() {
        List<Senioridade> senioridades = this.servico.listar();
        return ResponseEntity.status(HttpStatus.OK).body(senioridades);
    }

    @PostMapping
    public ResponseEntity<Senioridade> criar(@Valid @RequestBody Senioridade senioridade) {
        senioridade = this.servico.salvar(senioridade);
        return ResponseEntity.status(HttpStatus.CREATED).body(senioridade);
    }

    @PutMapping
    public ResponseEntity<Senioridade> alterar(@Valid @RequestBody Senioridade senioridade) {
        senioridade = this.servico.salvar(senioridade);
        return ResponseEntity.status(HttpStatus.OK).body(senioridade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Senioridade> excluir(@PathVariable("id") Long id) {
        this.servico.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
