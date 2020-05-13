package br.com.basis.sgp.servico;

import br.com.basis.sgp.servico.dto.tipoquestao.TipoQuestaoDTO;

import java.util.List;

public interface TipoQuestaoServico {

    TipoQuestaoDTO buscar(Long id);

    List<TipoQuestaoDTO> listar();

}
