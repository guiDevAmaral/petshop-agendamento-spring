package com.petshop.agendamento.repository;

import com.petshop.agendamento.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    Optional<Agendamento> findByDataHora(LocalDateTime dataHora);
}
