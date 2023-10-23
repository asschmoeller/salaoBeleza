package br.edu.univille.salaobeleza.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.univille.salaobeleza.entity.Profissional;
import br.edu.univille.salaobeleza.service.ProfissionalService;

@Controller
@RequestMapping("/profissionais")
public class ProfissionalController {

    @Autowired
    private ProfissionalService service;

    @GetMapping
    public ModelAndView index() {

        var listaProfissionais = service.getAll();

        return new ModelAndView("profissional/index", "listaProfissionais", listaProfissionais);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var novoProfissional = new Profissional();
        return new ModelAndView("profissional/form", "profissional", novoProfissional);
    }

    @PostMapping
    public ModelAndView save(Profissional profissional) {
        service.save(profissional);
        return new ModelAndView("redirect:/profissionais");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Profissional profissional) {
        return new ModelAndView("profissional/form", "profissional", profissional);
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") Profissional profissional) {
        service.delete(profissional);
        return new ModelAndView("redirect:/profissionais");
    }
}