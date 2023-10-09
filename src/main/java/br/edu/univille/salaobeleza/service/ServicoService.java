package br.edu.univille.salaobeleza.service;

import br.edu.univille.salaobeleza.entity.Servico;

import java.util.List;

public interface ServicoService {
    List<Servico> getAll();

    void save(Servico servico);

    void delete(Servico servico);

}
