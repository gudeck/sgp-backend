package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.TipoQuestao;
import br.com.basis.sgp.repositorio.TipoQuestaoRepositorio;
import br.com.basis.sgp.servico.TipoQuestaoServico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoQuestaoServicoImpl implements TipoQuestaoServico {

    private final TipoQuestaoRepositorio repositorio;

    public TipoQuestaoServicoImpl(TipoQuestaoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<TipoQuestao> listar() {
        return null;
    }

    @Override
    public TipoQuestao buscarPorId(Long id) {
        return null;
    }

    @Override
    public TipoQuestao salvar(TipoQuestao novoRegistro) {
        return null;
    }

    @Override
    public void excluir(TipoQuestao registro) {

    }
}
