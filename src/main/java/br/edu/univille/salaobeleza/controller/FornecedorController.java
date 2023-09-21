package br.edu.univille.salaobeleza.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.univille.salaobeleza.repository.FornecedorRepository;
import br.edu.univille.salaobeleza.entity.Fornecedor;
import br.edu.univille.salaobeleza.service.FornecedorService;

@Controller
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService service;

    @GetMapping
    public ModelAndView index() {

        var listaFornecedores = service.getAll();

        return new ModelAndView("fornecedor/index", "listaFornecedores", listaFornecedores);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var novoFornecedor = new Fornecedor();
        return new ModelAndView("fornecedor/form", "fornecedor", novoFornecedor);
    }

    @PostMapping
    public ModelAndView save(Fornecedor fornecedor) {
        service.save(fornecedor);
        return new ModelAndView("redirect:/fornecedores");
    }

    @GetMapping("alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Fornecedor fornecedor) {
        return new ModelAndView("fornecedor/form",
                "fornecedor", fornecedor);

    }

}