package br.com.basis.sgp.servico.mapper.usuario;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.dto.usuario.UsuarioCriarDTO;
import br.com.basis.sgp.servico.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioCriarMapper extends EntityMapper<UsuarioCriarDTO, Usuario> {
}
