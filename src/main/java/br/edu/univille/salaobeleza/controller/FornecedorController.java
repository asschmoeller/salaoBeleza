package br.edu.univille.salaobeleza.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.univille.salaobeleza.entity.Fornecedor;

@Controller
@RequestMapping("/fornecedores")

public class FornecedorController {

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("fornecedor/index");

    }
}
