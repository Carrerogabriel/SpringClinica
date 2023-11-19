package com.example.clinica.service;

import com.example.clinica.model.Medico;
import com.example.clinica.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository repositorio;

    /*
    * Aqui você implementa os métodos do repositório, tais como:
    *
    * listar
    * editar
    * excluir
    * */


    public List<Medico> trazerTodos() {
        return repositorio.findAll();
    }

    public Medico salvarMedicos(Medico medico) {
        return repositorio.save(medico);
    }
    public void remover(Long id){repositorio.deleteById(id);}
}