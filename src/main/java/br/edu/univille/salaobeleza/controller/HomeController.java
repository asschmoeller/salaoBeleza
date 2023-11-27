package br.edu.univille.salaobeleza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
@PreAuthorize("hasAuthority('APPROLE_Admin')")

public class HomeController {
    @GetMapping
    public ModelAndView index() {


        return new ModelAndView("index");
    }    
}
