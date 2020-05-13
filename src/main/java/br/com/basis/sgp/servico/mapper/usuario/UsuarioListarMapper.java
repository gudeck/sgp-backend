package br.com.basis.sgp.servico.mapper.usuario;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.dto.usuario.UsuarioListarDTO;
import br.com.basis.sgp.servico.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioListarMapper extends EntityMapper<UsuarioListarDTO, Usuario> {
}
