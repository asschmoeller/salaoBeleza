package br.edu.univille.salaobeleza.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.univille.salaobeleza.Repository.clienteRepository;
import br.edu.univille.salaobeleza.entity.Cliente;
import br.edu.univille.salaobeleza.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ModelAndView index() {

        var listaClientes = service.getAll();

        return new ModelAndView("cliente/index", "listaClientes", listaClientes);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var novoCliente = new Cliente();
        return new ModelAndView("cliente/form", "cliente", novoCliente);
    }

    @PostMapping(params = "form")
    public ModelAndView save(Cliente cliente) {
        service.save(cliente);
        return new ModelAndView("redirect:/clientes");
    }

}