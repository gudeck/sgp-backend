package br.com.basis.sgp.servico;

import br.com.basis.sgp.servico.dto.senioridade.SenioridadeDTO;

import java.util.List;

public interface SenioridadeServico {

    SenioridadeDTO buscar(Long id);

    List<SenioridadeDTO> listar();

}
