package com.petshop.agendamento.controller;

import com.petshop.agendamento.model.Pet;
import com.petshop.agendamento.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets") // Define que este controller responde no endereço http://localhost:8080/pets
public class PetController {

    @Autowired
    private PetRepository repository;

    // Método para listar todos os pets
    @GetMapping
    public List<Pet> listarTodos() {
        return repository.findAll();
    }

    // Método para salvar um novo pet
    @PostMapping
    public Pet adicionar(@RequestBody Pet pet) {
        return repository.save(pet);
    }
}
