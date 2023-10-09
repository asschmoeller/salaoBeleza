package br.edu.univille.salaobeleza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univille.salaobeleza.repository.FornecedorRepository;
import br.edu.univille.salaobeleza.entity.Fornecedor;
import br.edu.univille.salaobeleza.service.FornecedorService;

@Service
public class FornecedorServiceImpl implements FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    @Override
    public List<Fornecedor> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Fornecedor fornecedor) {
        repository.save(fornecedor);
    }

    @Override
    public void delete(Fornecedor fornecedor) {
        repository.delete(fornecedor);
    }
}
