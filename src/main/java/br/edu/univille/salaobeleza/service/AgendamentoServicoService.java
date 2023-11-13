package br.edu.univille.salaobeleza.service;

import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.entity.Cliente;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.azure.core.http.rest.Page;
import org.springframework.data.domain.Pageable;

public interface AgendamentoServicoService {
    List<AgendamentoServico> getAll();

    Page<AgendamentoServico> findAll(Pageable pageable);

    void save(AgendamentoServico agendamentoservico);

    void delete(AgendamentoServico agendamentoservico);

}
