package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Senioridade;
import br.com.basis.sgp.repositorio.SenioridadeRepositorio;
import br.com.basis.sgp.servico.SenioridadeServico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SenioridadeServicoImpl implements SenioridadeServico {

    private final SenioridadeRepositorio repositorio;

    @Override
    public List<Senioridade> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public Senioridade salvar(Senioridade senioridade) {
        return this.repositorio.save(senioridade);
    }

    @Override
    public void excluir(Long id) {
        this.repositorio.findById(id).ifPresent(this.repositorio::delete);
    }
}
