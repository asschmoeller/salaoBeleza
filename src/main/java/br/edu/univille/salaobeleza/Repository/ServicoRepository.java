package br.edu.univille.salaobeleza.Repository;

import br.edu.univille.salaobeleza.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository
        extends JpaRepository<Servico, Long>{
    
}
