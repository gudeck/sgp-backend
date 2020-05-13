package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.repositorio.ProvaRepositorio;
import br.com.basis.sgp.servico.ProvaServico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProvaServicoImpl implements ProvaServico {

    private final ProvaRepositorio repositorio;

    @Override
    public List<Prova> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public Prova salvar(Prova prova) {
        return this.repositorio.save(prova);
    }

    @Override
    public void excluir(Long id) {
        this.repositorio.findById(id).ifPresent(this.repositorio::delete);
    }
}
