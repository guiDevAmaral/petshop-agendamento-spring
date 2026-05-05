package com.petshop.agendamento.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;

    @ManyToOne
    private Pet pet;

    @ManyToOne
    private Servico servico;

    private String status; // Ex: "Agendado", "Concluído", "Cancelado"
}
