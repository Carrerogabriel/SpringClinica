package com.example.clinica.model;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.validator.constraints.br.CPF;

@MappedSuperclass
public class Pessoa extends EntityId{
    @Column(name = "nome", nullable = true)
    @NotBlank(message = "Campo Nao Informado")
    private String nome;
    @Column(name = "cpf", nullable = true)
    @NotBlank(message = "Campo Nao Informado")
    @CPF(message = "Campo Invalido")
    private String cpf;
    @Column(name = "telefone", nullable = true)
    @NotBlank(message = "Campo Nao Informado")
    private String telefone;
    @Column(name = "cidade", nullable = true)
    @NotBlank(message = "Campo Nao Informado")
    private String cidade;



    public Pessoa() {}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


}
