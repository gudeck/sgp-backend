package br.com.basis.sgp.servico.dto.usuario;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UsuarioAlterarDTO {

    @NotNull(message = "Campo ID não deve ficar em branco")
    private Long id;

    @Size(min = 2, max = 80, message = "Tamanho do NOME inválido")
    private String nome;

    @Size(min = 11, max = 11, message = "Tamanho do CPF inválido")
    @CPF(message = "CPF inválido")
    private String cpf;

    @Size(min = 6, max = 20, message = "Tamanho da SENHA inválida")
    private String senha;

    @Size(min = 6, max = 80, message = "Tamanho do EMAIL inválido")
    private String email;

}
