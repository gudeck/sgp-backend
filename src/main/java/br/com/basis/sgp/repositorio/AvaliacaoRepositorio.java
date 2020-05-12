package br.com.basis.sgp.repositorio;

import br.com.basis.sgp.dominio.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepositorio extends JpaRepository<Avaliacao, Long> {

}
