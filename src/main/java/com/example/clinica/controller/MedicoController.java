package com.example.clinica.controller;


import com.example.clinica.model.Medico;
import com.example.clinica.service.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/medico")
public class MedicoController {
    @Autowired
    private MedicoService service;

    @GetMapping("/medicos")
    public ResponseEntity listarMedicos() {
        List<Medico> medicos = service.trazerTodos();
        return ResponseEntity.ok(medicos);
    }

    @PostMapping("/salvar")
    public ResponseEntity salvar (@RequestBody @Valid Medico medicos){
        Medico salvar = service.salvarMedicos(medicos);
        return ResponseEntity.created(URI.create("medico/salvar"+medicos.getId())).body(salvar);

    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> HandValidationException(MethodArgumentNotValidException ex){
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) ->{
            String fieldName =((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);

        });
        return errors;
    }




}