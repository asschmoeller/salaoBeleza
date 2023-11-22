package br.edu.univille.salaobeleza.service;

import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.entity.Cliente;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface AgendamentoServicoService {
    List<AgendamentoServico> getAll();

    Page<AgendamentoServico> findAll(Pageable pageable);

    void save(AgendamentoServico agendamentoservico);

    void delete(AgendamentoServico agendamentoservico);

}
