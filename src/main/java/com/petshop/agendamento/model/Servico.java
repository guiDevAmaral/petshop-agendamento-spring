package com.petshop.agendamento.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // Ex: "Banho e Tosa Higiênica"
    private Double preco;
    private Integer duracaoMinutos; // Ex: 60
}
