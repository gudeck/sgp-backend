package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.repositorio.UsuarioRepositorio;
import br.com.basis.sgp.servico.UsuarioServico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicoImpl implements UsuarioServico {

    private final UsuarioRepositorio repositorio;

    public UsuarioServicoImpl(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Usuario> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return null;
    }

    @Override
    public Usuario salvar(Usuario registro) {
        return this.repositorio.save(registro);
    }

    @Override
    public void excluir(Usuario registro) {
        this.repositorio.delete(registro);
    }
}
