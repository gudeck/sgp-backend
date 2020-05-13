package br.com.basis.sgp.servico.mapper.senioridade;

import br.com.basis.sgp.dominio.Senioridade;
import br.com.basis.sgp.servico.dto.senioridade.SenioridadeDTO;
import br.com.basis.sgp.servico.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SenioridadeMapper extends EntityMapper<SenioridadeDTO, Senioridade> {
}
