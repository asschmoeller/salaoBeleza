package br.edu.univille.salaobeleza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univille.salaobeleza.entity.Produto;

@Repository
public interface produtoRepository
                extends JpaRepository<Produto, Long> {

}
