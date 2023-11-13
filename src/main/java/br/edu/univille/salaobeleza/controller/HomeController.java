package br.edu.univille.salaobeleza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@PreAuthorize("hasAuthority('APPROLE_Admin')")

public class HomeController {
    @GetMapping
    @ResponseBody
    public String index(){
        return "Jo Jo Salão";
    }     
}
