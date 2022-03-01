package com.db.academia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "endereco")
@Data

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDENDERECO")
    private long IDENDERECO;

    @Column()
    private long cep;
    private String cidade;
    private String bairro;
    private String rua;
    private String uf;
    
}
