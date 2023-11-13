package br.edu.univille.salaobeleza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univille.salaobeleza.entity.Profissional;

@Repository
public interface ProfissionalRepository 
        extends JpaRepository<Profissional, Long>{
    
}