package br.edu.univille.salaobeleza.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.service.AgendamentoServicoService;
import br.edu.univille.salaobeleza.service.ServicoService;

@Controller
@RequestMapping("/agendamentoservico")
public class AgendamentoServicoController {

    @Autowired
    private AgendamentoServicoService service;
    @Autowired
    private ServicoService servicoService;

    @GetMapping
    public ModelAndView index(){

        var listaAgendamentoServico = service.getAll();
        
        return new ModelAndView("agendamentoServico/index","listaAgendamentoServico",listaAgendamentoServico);
    }
    @GetMapping("/novo")
    public ModelAndView novo(){
        HashMap<String,Object> dados = new HashMap<>();
        var novoAgendamentoServico = new AgendamentoServico();
        var listaServico = servicoService.getAll();

        dados.put("agendamentoServico",novoAgendamentoServico);
        dados.put("listaServico",listaServico);

        return new ModelAndView("agendamentoServico/form", dados);
    }
    @PostMapping
    public ModelAndView save(AgendamentoServico agendamentoservico){
        service.save(agendamentoservico);
        return new ModelAndView("redirect:/agendamentoservico");

    }
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") AgendamentoServico agendamentoservico){

        HashMap<String,Object> dados = new HashMap<>();
        var listaServico = ServicoService.getAll();
        dados.put("agendamentoservico",agendamentoservico);
        dados.put("listaServicos",listaServico);
        

        return new ModelAndView("agendamentoServico/form",dados);
    }


    @GetMapping("/remover/{id}")
    public ModelAndView remover(
            @PathVariable("id") AgendamentoServico agendamentoservico){
        service.delete(agendamentoservico);
        return new ModelAndView("redirect:/agendamentoservico");
    }

}