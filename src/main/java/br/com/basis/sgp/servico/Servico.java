package br.com.basis.sgp.servico;

import java.util.List;

public interface Servico<T> {

    List<T> listar();

    T salvar(T t);

    void excluir(Long id);

}
