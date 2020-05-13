package br.com.basis.sgp.servico;

import br.com.basis.sgp.servico.dto.prova.ProvaCriarDTO;
import br.com.basis.sgp.servico.dto.prova.ProvaDTO;

import java.util.List;

public interface ProvaServico {

    ProvaDTO criar(ProvaCriarDTO prova);

    ProvaDTO alterar(ProvaDTO prova);

    ProvaDTO buscar(Long id);

    void excluir(Long id);

    List<ProvaDTO> listar();

}
