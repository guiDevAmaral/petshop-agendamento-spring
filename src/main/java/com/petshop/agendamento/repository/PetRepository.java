package com.petshop.agendamento.repository;

import com.petshop.agendamento.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    // Aqui o Spring já te dá métodos como save(), findAll() e delete() de graça!
}
