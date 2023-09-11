package br.edu.univille.salaobeleza.entity;

import java.sql.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class MovEstoque{
    private long id;
    @Temporal(TemporalType.DATE)
    private Date data;
    private int quantidade;
    
}