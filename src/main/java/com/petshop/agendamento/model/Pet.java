package com.petshop.agendamento.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String raca;
    private String porte; // Pequeno, Médio, Grande
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // Cria uma coluna de ligação no banco de dados
    private Cliente dono;

}
