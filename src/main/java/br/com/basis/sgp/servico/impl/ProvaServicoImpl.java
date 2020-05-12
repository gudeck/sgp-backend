package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.repositorio.ProvaRepositorio;
import br.com.basis.sgp.servico.ProvaServico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvaServicoImpl implements ProvaServico {

    private final ProvaRepositorio repositorio;

    public ProvaServicoImpl(ProvaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Prova> listar() {
        return null;
    }

    @Override
    public Prova buscarPorId(Long id) {
        return null;
    }

    @Override
    public Prova salvar(Prova novoRegistro) {
        return null;
    }

    @Override
    public void excluir(Prova registro) {

    }
}
