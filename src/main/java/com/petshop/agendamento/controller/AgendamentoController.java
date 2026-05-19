package com.petshop.agendamento.controller;

import com.petshop.agendamento.model.Agendamento;
import com.petshop.agendamento.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @PostMapping
    public Agendamento criar(@RequestBody Agendamento agendamento) {
        return service.salvar(agendamento);
    }

    @Autowired
    private com.petshop.agendamento.repository.AgendamentoRepository repository; // para listagem direta

    @GetMapping
    public java.util.List<Agendamento> listarTodos() {
        return repository.findAll();
    }
}