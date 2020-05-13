package br.com.basis.sgp.servico.dto.usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Integer admin;

}
