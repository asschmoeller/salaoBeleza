package br.edu.univille.salaobeleza.controller;

import br.edu.univille.salaobeleza.entity.Servico;
import br.edu.univille.salaobeleza.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/servicos")
@PreAuthorize("hasAuthority('APPROLE_Admin')")

public class ServicoController {

    @Autowired
    private ServicoService service;

    @GetMapping
    public ModelAndView index() {

        var listaServicos = service.getAll();

        return new ModelAndView("servico/index", "listaServicos", listaServicos);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var novoServico = new Servico();
        return new ModelAndView("servico/form", "servico", novoServico);
    }

    @PostMapping
    public ModelAndView save(Servico servico) {
        service.save(servico);
        return new ModelAndView("redirect:/servicos");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Servico servico) {
        return new ModelAndView("servico/form", "servico", servico);
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") Servico servico) {
        service.delete(servico);
        return new ModelAndView("redirect:/servicos");
    }
}