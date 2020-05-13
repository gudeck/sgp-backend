package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.repositorio.UsuarioRepositorio;
import br.com.basis.sgp.servico.UsuarioServico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsuarioServicoImpl implements UsuarioServico {

    private final UsuarioRepositorio repositorio;

    @Override
    public List<Usuario> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        return this.repositorio.save(usuario);
    }

    @Override
    public void excluir(Long id) {
        this.repositorio.findById(id).ifPresent(this.repositorio::delete);
    }
}
