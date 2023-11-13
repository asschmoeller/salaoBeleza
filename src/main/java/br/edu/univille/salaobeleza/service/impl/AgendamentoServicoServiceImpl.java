package br.edu.univille.salaobeleza.service.impl;

import br.edu.univille.salaobeleza.Repository.AgendamentoServicoRepository;
import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.service.AgendamentoServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.init.Jackson2ResourceReader;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonParser;

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
        repository.save(agendamentoservico);

    }

    @Override
    public void delete(AgendamentoServico agendamentoservico) {
         repository.delete(agendamentoservico);

    }
    @Override
    public Page<AgendamentoServico> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}