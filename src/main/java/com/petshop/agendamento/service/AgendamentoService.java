package com.petshop.agendamento.service;

import com.petshop.agendamento.model.Agendamento;
import com.petshop.agendamento.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public Agendamento salvar(Agendamento agendamento) {
        // REGRA 1: Não permitir data no passado
        if (agendamento.getDataHora().isBefore(LocalDateTime.now())) {
            throw new RuntimeException("Não é possível agendar para uma data passada.");
        }

        // REGRA 2: Definir status inicial
        if (agendamento.getStatus() == null) {
            agendamento.setStatus("AGENDADO");
        }

        return repository.save(agendamento);
    }
}
