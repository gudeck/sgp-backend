package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Questao;
import br.com.basis.sgp.repositorio.QuestaoRepository;
import br.com.basis.sgp.servico.QuestaoServico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestaoServicoImpl implements QuestaoServico {

    private final QuestaoRepository repository;

    public QuestaoServicoImpl(QuestaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Questao> listar() {
        return null;
    }

    @Override
    public Questao buscarPorId(Long id) {
        return null;
    }

    @Override
    public Questao salvar(Questao novoRegistro) {
        return null;
    }

    @Override
    public void excluir(Questao registro) {

    }
}
