package br.com.basis.sgp.servico.mapper.usuario;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.dto.usuario.UsuarioDTO;
import br.com.basis.sgp.servico.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper extends EntityMapper<UsuarioDTO, Usuario> {
}
