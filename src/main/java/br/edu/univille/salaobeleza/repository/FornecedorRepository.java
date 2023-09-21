package br.edu.univille.salaobeleza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univille.salaobeleza.entity.Fornecedor;

@Repository
public interface FornecedorRepository
        extends JpaRepository<Fornecedor, Long> {

}