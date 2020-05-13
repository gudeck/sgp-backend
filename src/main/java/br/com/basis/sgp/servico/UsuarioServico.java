package br.com.basis.sgp.servico;

import br.com.basis.sgp.servico.dto.usuario.UsuarioAlterarDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioCriarDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioListarDTO;

import java.util.List;

public interface UsuarioServico {
    UsuarioDTO criar(UsuarioCriarDTO usuario);

    UsuarioDTO alterar(UsuarioAlterarDTO usuario);

    UsuarioDTO buscar(Long id);

    void excluir(Long id);

    List<UsuarioListarDTO> listar();
}
