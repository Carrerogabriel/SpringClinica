package com.example.clinica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Medico extends Pessoa {
    @Column(name = "especialidade", nullable = true)
    private String especialidade;

    @Column(name = "crm", nullable = true)
    private String crm;

    @Column(name = "salario", nullable = true)
    private Double salario;



    public Medico() {
        super();
    }


    public String getEspecialidade() {
        return especialidade;
    }


    public String getCrm() {
        return crm;
    }

    public Double getSalario() {
        return salario;

    }

    public Medico(String especialidade, String crm, Double salario) {
        this.especialidade = especialidade;
        this.crm = crm;
        this.salario = salario;
    }
}
