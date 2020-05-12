package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Avaliacao;
import br.com.basis.sgp.repositorio.AvaliacaoRepositorio;
import br.com.basis.sgp.servico.AvaliacaoServico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoServicoImpl implements AvaliacaoServico {

    private final AvaliacaoRepositorio repositorio;

    public AvaliacaoServicoImpl(AvaliacaoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Avaliacao> listar() {
        return null;
    }

    @Override
    public Avaliacao buscarPorId(Long id) {
        return null;
    }

    @Override
    public Avaliacao salvar(Avaliacao novoRegistro) {
        return null;
    }

    @Override
    public void excluir(Avaliacao registro) {

    }
}
