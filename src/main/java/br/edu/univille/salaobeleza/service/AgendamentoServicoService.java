package br.edu.univille.salaobeleza.service;

import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.entity.Cliente;

import java.util.List;

public interface AgendamentoServicoService {
    List<AgendamentoServico> getAll();

    void save(AgendamentoServico agendamentoservico);

    void delete(AgendamentoServico agendamentoservico);

}
