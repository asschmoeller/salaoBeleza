package br.edu.univille.salaobeleza.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.entity.Cliente;
import br.edu.univille.salaobeleza.service.AgendamentoServicoService;
import br.edu.univille.salaobeleza.service.ServicoService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/agendamentoservico")
@PreAuthorize("hasAuthority('APPROLE_Admin')")
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
    @GetMapping("/paginacao")
    public ModelAndView indexPaging(@RequestParam(defaultValue = "1") int page, 
        @RequestParam(defaultValue = "3") int size){

        Pageable paging = PageRequest.of(page - 1, size);
        var lastPage = service.findAll(paging);
        var listaAgendamentoServico = lastPage.getContent(); 

        HashMap<String,Object> dados = new HashMap<>();
        dados.put("listaAgendamentoServico",listaAgendamentoServico);
        dados.put("currentPage", lastPage.getNumber() + 1);
        dados.put("totalItems", lastPage.getTotalElements());
        dados.put("totalPages", lastPage.getTotalPages());
        dados.put("pageSize", size);
        
        return new ModelAndView("agendamentoservico/indexpage",dados);
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
    public ModelAndView save(@Valid AgendamentoServico agendamentoServico, 
                BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            HashMap<String,Object> dados = new HashMap<>();
            var listaServico = servicoService.getAll();
            dados.put("AgendamentoServico",agendamentoServico);
            dados.put("listaServico",listaServico);
            return new ModelAndView("agendamentoServico/form", dados);
        }
        service.save(agendamentoServico);
        return new ModelAndView("redirect:/agendamentoservico");
    
    }
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") AgendamentoServico agendamentoservico){

        HashMap<String,Object> dados = new HashMap<>();
        var listaServico = service.getAll();
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