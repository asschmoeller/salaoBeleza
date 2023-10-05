package br.edu.univille.salaobeleza.service;

import java.util.List;

import br.edu.univille.salaobeleza.entity.Cliente;

public interface ClienteService {
    List<Cliente> getAll();

    void save(Cliente cliente);

    void delete(Cliente cliente);

}
