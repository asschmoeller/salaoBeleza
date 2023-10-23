package br.edu.univille.salaobeleza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univille.salaobeleza.Repository.ProfissionalRepository;
import br.edu.univille.salaobeleza.entity.Profissional;
import br.edu.univille.salaobeleza.service.ProfissionalService;

@Service
public class ProfissionalServiceImpl implements ProfissionalService {

    @Autowired
    private ProfissionalRepository repository;

    @Override
    public List<Profissional> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Profissional profissional) {
        repository.save(profissional);
    }

    @Override
    public void delete(Profissional profissional) {
        repository.delete(profissional);
    }
}
