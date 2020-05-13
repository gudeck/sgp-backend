package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.repositorio.ProvaRepositorio;
import br.com.basis.sgp.servico.ProvaServico;
import br.com.basis.sgp.servico.dto.prova.ProvaCriarDTO;
import br.com.basis.sgp.servico.dto.prova.ProvaDTO;
import br.com.basis.sgp.servico.mapper.prova.ProvaCriarMapper;
import br.com.basis.sgp.servico.mapper.prova.ProvaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProvaServicoImpl implements ProvaServico {

    private final ProvaRepositorio repositorio;

    private final ProvaMapper provaMapper;
    private final ProvaCriarMapper criarMapper;

    @Override
    public ProvaDTO criar(ProvaCriarDTO prova) {
        Prova novaProva = criarMapper.toEntity(prova);
        return provaMapper.toDto(novaProva);
    }

    @Override
    public ProvaDTO alterar(ProvaDTO prova) {
        Prova provaAtual = provaMapper.toEntity(prova);
        return provaMapper.toDto(repositorio.save(provaAtual));
    }

    @Override
    public ProvaDTO buscar(Long id) {
        return provaMapper.toDto(repositorio.getOne(id));
    }

    @Override
    public void excluir(Long id) {
        repositorio.findById(id).ifPresent(repositorio::delete);
    }

    @Override
    public List<ProvaDTO> listar() {
        return provaMapper.toDto(repositorio.findAll());
    }
}
