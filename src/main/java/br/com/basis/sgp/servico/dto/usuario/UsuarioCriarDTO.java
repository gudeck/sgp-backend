package br.com.basis.sgp.servico.dto.usuario;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UsuarioCriarDTO {

    @Size(min = 2, max = 80, message = "Tamanho do NOME inválido")
    @NotNull(message = "Campo NOME não deve ficar em branco")
    private String nome;

    @Size(min = 11, max = 11, message = "Tamanho do CPF inválido")
    @CPF(message = "CPF inválido")
    @NotNull(message = "Campo CPF não deve ficar em branco")
    private String cpf;

    @Size(min = 6, max = 20, message = "Tamanho da SENHA inválida")
    @NotNull(message = "Campo SENHA não deve ficar em branco")
    private String senha;

    @Size(min = 6, max = 80, message = "Tamanho do EMAIL inválido")
    @Email(message = "EMAIL inválido")
    @NotNull(message = "Campo EMAIL não deve ficar em branco")
    private String email;

    @Size(min = 8, max = 8, message = "Tamanho do TOKEN inválido")
    @NotNull(message = "Campo TOKEN não deve ficar em branco")
    private String token;

}
