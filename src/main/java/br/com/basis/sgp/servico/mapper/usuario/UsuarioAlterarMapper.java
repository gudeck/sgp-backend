package br.com.basis.sgp.servico.mapper.usuario;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.dto.usuario.UsuarioAlterarDTO;
import br.com.basis.sgp.servico.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioAlterarMapper extends EntityMapper<UsuarioAlterarDTO, Usuario> {
}
