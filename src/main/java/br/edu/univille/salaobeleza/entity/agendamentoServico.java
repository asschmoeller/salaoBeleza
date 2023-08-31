package br.edu.univille.salaobeleza.entity;

import java.util.Date;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity 
public class agendamentoServico{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date data;

    @ManyToOne (cascade = {CascadeType.MERGE,
                           CascadeType.REFRESH})
    private Servico servico;
    
    @ManyToOne (cascade = {CascadeType.MERGE,
        CascadeType.REFRESH})
    private Profissional profissional;

    @ManyToOne (cascade = {CascadeType.MERGE,
        CascadeType.REFRESH})
    private Cliente cliente;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}