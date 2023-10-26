package br.edu.univille.salaobeleza.controller;

import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.service.AgendamentoServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/agendamentoservico")
public class AgendamentoServicoController {

    @Autowired
    private AgendamentoServicoService service;

    @GetMapping
    public ModelAndView index() {

        var listaAgendamentoServico = service.getAll();

        return new ModelAndView("agendamentoservico/index", "listaAgendamentoServico", listaAgendamentoServico);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var novoAgendamentoServico = new AgendamentoServico();
        return new ModelAndView("agendamentoservico/form", "agendamentoservico", novoAgendamentoServico);
    }

    @PostMapping
    public ModelAndView save(AgendamentoServico agendamentoservico) {
        service.save(agendamentoservico);
        return new ModelAndView("redirect:/agendamentoservico");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") AgendamentoServico agendamentoservico) {
        return new ModelAndView("agendamentoservico/form", "agendamentoservico", agendamentoservico);
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") AgendamentoServico agendamentoservico) {
        service.delete(agendamentoservico);
        return new ModelAndView("redirect:/agendamentoservico");
    }
}