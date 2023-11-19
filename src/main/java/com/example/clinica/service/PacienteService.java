package com.example.clinica.service;


import com.example.clinica.model.Paciente;
import com.example.clinica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository repositorioPaciente;
    public List<Paciente> trazerTodos() {
        return repositorioPaciente.findAll();
    }
    public Paciente salvarPaciente(Paciente paciente) {
        return repositorioPaciente.save(paciente);
    }
    public void remover(Long id){repositorioPaciente.deleteById(id);}




}
