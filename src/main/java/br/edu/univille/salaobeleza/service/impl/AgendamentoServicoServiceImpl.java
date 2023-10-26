package br.edu.univille.salaobeleza.service.impl;

import br.edu.univille.salaobeleza.Repository.AgendamentoServicoRepository;
import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.service.AgendamentoServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoServicoServiceImpl implements AgendamentoServicoService {

    @Autowired
    private AgendamentoServicoRepository repository;

    @Override
    public List<AgendamentoServico> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(AgendamentoServico agendamentoservico) {

    }

    @Override
    public void delete(AgendamentoServico agendamentoservico) {

    }
}