package br.com.basis.sgp.servico.mapper.prova;

import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.servico.dto.prova.ProvaCriarDTO;
import br.com.basis.sgp.servico.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProvaCriarMapper extends EntityMapper<ProvaCriarDTO, Prova> {
}
