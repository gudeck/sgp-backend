package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.repositorio.UsuarioRepositorio;
import br.com.basis.sgp.servico.UsuarioServico;
import br.com.basis.sgp.servico.dto.usuario.UsuarioAlterarDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioCriarDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioDTO;
import br.com.basis.sgp.servico.dto.usuario.UsuarioListarDTO;
import br.com.basis.sgp.servico.mapper.usuario.UsuarioAlterarMapper;
import br.com.basis.sgp.servico.mapper.usuario.UsuarioCriarMapper;
import br.com.basis.sgp.servico.mapper.usuario.UsuarioListarMapper;
import br.com.basis.sgp.servico.mapper.usuario.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsuarioServicoImpl implements UsuarioServico {


    private final UsuarioRepositorio repositorio;

    private final UsuarioMapper usuarioMapper;
    private final UsuarioAlterarMapper alterarMapper;
    private final UsuarioCriarMapper criarMapper;
    private final UsuarioListarMapper listarMapper;

    @Override
    public UsuarioDTO criar(UsuarioCriarDTO usuario) {
        Usuario novoUsuario = criarMapper.toEntity(usuario);
        return usuarioMapper.toDto(repositorio.save(novoUsuario));
    }

    @Override
    public UsuarioDTO alterar(UsuarioAlterarDTO usuario) {
        Usuario usuarioAtual = alterarMapper.toEntity(usuario);
        return usuarioMapper.toDto(repositorio.save(usuarioAtual));
    }

    @Override
    public UsuarioDTO buscar(Long id) {
        return usuarioMapper.toDto(repositorio.getOne(id));
    }

    @Override
    public void excluir(Long id) {
        repositorio.findById(id).ifPresent(repositorio::delete);
    }

    @Override
    public List<UsuarioListarDTO> listar() {
        return listarMapper.toDto(repositorio.findAll());
    }
}
