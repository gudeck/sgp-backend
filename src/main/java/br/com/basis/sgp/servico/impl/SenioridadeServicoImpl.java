package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.repositorio.SenioridadeRepositorio;
import br.com.basis.sgp.servico.SenioridadeServico;
import br.com.basis.sgp.servico.dto.senioridade.SenioridadeDTO;
import br.com.basis.sgp.servico.mapper.senioridade.SenioridadeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SenioridadeServicoImpl implements SenioridadeServico {

    private final SenioridadeRepositorio repositorio;

    private final SenioridadeMapper senioridadeMapper;

    @Override
    public SenioridadeDTO buscar(Long id) {
        return senioridadeMapper.toDto(repositorio.getOne(id));
    }

    @Override
    public List<SenioridadeDTO> listar() {
        return senioridadeMapper.toDto(repositorio.findAll());
    }
}
