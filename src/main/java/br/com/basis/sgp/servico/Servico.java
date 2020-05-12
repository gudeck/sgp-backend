package br.com.basis.sgp.servico;

import java.util.List;

public interface Servico<T> {

    List<T> listar();

    T buscarPorId(Long id);

    T salvar(T novoRegistro);

    void excluir(T registro);

}
