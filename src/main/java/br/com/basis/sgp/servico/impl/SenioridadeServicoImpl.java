package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Senioridade;
import br.com.basis.sgp.repositorio.SenioridadeRepositorio;
import br.com.basis.sgp.servico.SenioridadeServico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenioridadeServicoImpl implements SenioridadeServico {
    private final SenioridadeRepositorio repositorio;

    public SenioridadeServicoImpl(SenioridadeRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Senioridade> listar() {
        return null;
    }

    @Override
    public Senioridade buscarPorId(Long id) {
        return null;
    }

    @Override
    public Senioridade salvar(Senioridade novoRegistro) {
        return null;
    }

    @Override
    public void excluir(Senioridade registro) {

    }
}
