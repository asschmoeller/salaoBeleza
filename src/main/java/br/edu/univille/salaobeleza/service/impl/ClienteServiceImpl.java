package br.edu.univille.salaobeleza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.univille.salaobeleza.Repository.clienteRepository;
import br.edu.univille.salaobeleza.entity.Cliente;
import br.edu.univille.salaobeleza.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private clienteRepository repository;
    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }
    
}
