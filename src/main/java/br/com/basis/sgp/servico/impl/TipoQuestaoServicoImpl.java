package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.TipoQuestao;
import br.com.basis.sgp.repositorio.TipoQuestaoRepositorio;
import br.com.basis.sgp.servico.TipoQuestaoServico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TipoQuestaoServicoImpl implements TipoQuestaoServico {

    private final TipoQuestaoRepositorio repositorio;

    @Override
    public List<TipoQuestao> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public TipoQuestao salvar(TipoQuestao tipoQuestao) {
        return this.repositorio.save(tipoQuestao);
    }

    @Override
    public void excluir(Long id) {
        this.repositorio.findById(id).ifPresent(this.repositorio::delete);
    }
}
