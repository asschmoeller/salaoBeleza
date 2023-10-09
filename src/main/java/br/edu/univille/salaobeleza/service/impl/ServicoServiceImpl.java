package br.edu.univille.salaobeleza.service.impl;

import br.edu.univille.salaobeleza.Repository.servicoRepository;
import br.edu.univille.salaobeleza.entity.Servico;
import br.edu.univille.salaobeleza.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoServiceImpl implements ServicoService {

    @Autowired
    private servicoRepository repository;

    @Override
    public List<Servico> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Servico servico) {
        repository.save(servico);
    }

    @Override
    public void delete(Servico servico) {
        repository.delete(servico);
    }
}
