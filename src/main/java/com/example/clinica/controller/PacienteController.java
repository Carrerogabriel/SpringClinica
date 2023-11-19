package com.example.clinica.controller;
import com.example.clinica.model.Paciente;

import com.example.clinica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/paciente")
public class PacienteController {
    @Autowired
    private PacienteService servicePaciente;
    @GetMapping("/pacientes")
    public ResponseEntity listarMedicos() {
        List<Paciente> pacientes = servicePaciente.trazerTodos();
        return ResponseEntity.ok(pacientes);
    }

    @PostMapping("/salvar")
    public ResponseEntity salvarPaciente (@RequestBody Paciente paciente){
        Paciente salvar = servicePaciente.salvarPaciente(paciente);
        return ResponseEntity.created(URI.create("pacientes/salvar"+paciente.getId())).body(salvar);

    }

}
