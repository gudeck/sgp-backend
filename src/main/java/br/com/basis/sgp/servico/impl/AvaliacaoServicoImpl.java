package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Avaliacao;
import br.com.basis.sgp.repositorio.AvaliacaoRepositorio;
import br.com.basis.sgp.servico.AvaliacaoServico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AvaliacaoServicoImpl implements AvaliacaoServico {

    private final AvaliacaoRepositorio repositorio;

    @Override
    public List<Avaliacao> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public Avaliacao salvar(Avaliacao avaliacao) {
        return this.repositorio.save(avaliacao);
    }

    @Override
    public void excluir(Long id) {
        this.repositorio.findById(id).ifPresent(this.repositorio::delete);
    }
}
