package com.db.academia.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "estoqueProduto")
@Data

public class EstoqueProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduto")
    private long idproduto;

    @Column()
    private int quantidade;
    private int idproduto;
    private int idacademia;
    
}

