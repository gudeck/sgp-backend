package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Questao;
import br.com.basis.sgp.repositorio.QuestaoRepository;
import br.com.basis.sgp.servico.QuestaoServico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestaoServicoImpl implements QuestaoServico {

    private final QuestaoRepository repository;

    @Override
    public List<Questao> listar() {
        return this.repository.findAll();
    }

    @Override
    public Questao salvar(Questao questao) {
        return this.repository.save(questao);
    }

    @Override
    public void excluir(Long id) {
        this.repository.findById(id).ifPresent(this.repository::delete);
    }
}
