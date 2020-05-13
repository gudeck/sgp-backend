package br.com.basis.sgp.servico.mapper.prova;

import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.servico.dto.prova.ProvaDTO;
import br.com.basis.sgp.servico.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProvaMapper extends EntityMapper<ProvaDTO, Prova> {
}
