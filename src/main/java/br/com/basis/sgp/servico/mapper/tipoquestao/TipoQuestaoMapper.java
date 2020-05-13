package br.com.basis.sgp.servico.mapper.tipoquestao;

import br.com.basis.sgp.dominio.TipoQuestao;
import br.com.basis.sgp.servico.dto.tipoquestao.TipoQuestaoDTO;
import br.com.basis.sgp.servico.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoQuestaoMapper extends EntityMapper<TipoQuestaoDTO, TipoQuestao> {
}
