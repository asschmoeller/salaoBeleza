package br.edu.univille.salaobeleza.service;

import java.util.List;

import br.edu.univille.salaobeleza.entity.Profissional;

public interface ProfissionalService {
    List<Profissional> getAll();

    void save(Profissional profissional);

    void delete(Profissional profissional);

}
