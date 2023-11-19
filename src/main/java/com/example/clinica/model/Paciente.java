package com.example.clinica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;
@Entity
public class Paciente extends Pessoa{
    @Column(name = "hora_consulta", nullable = true)
    private LocalDateTime horaConsulta;

    @Column(name = "descriçao", nullable = true)
    private String descricaoConsulta;

    public Paciente(){

    }

    public LocalDateTime getHoraConsulta() {
        return horaConsulta;
    }

    public String getDescricaoConsulta() {
        return descricaoConsulta;
    }

    public Paciente(LocalDateTime horaConsulta, String descricaoConsulta) {
        this.horaConsulta = horaConsulta;
        this.descricaoConsulta = descricaoConsulta;
    }
}
