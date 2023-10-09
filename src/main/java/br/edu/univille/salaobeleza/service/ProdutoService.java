package br.edu.univille.salaobeleza.service;

import java.util.List;

import br.edu.univille.salaobeleza.entity.Produto;

public interface ProdutoService {
    List<Produto> getAll();

    void save(Produto produto);

    void delete(Produto produto);

}
