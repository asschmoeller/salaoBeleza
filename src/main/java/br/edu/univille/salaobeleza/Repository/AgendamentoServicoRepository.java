package br.edu.univille.salaobeleza.Repository;

import br.edu.univille.salaobeleza.entity.AgendamentoServico;
import br.edu.univille.salaobeleza.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoServicoRepository
                extends JpaRepository<AgendamentoServico, Long> {

}
