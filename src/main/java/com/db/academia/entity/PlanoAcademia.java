package com.db.academia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "planoAcademia")
@Data

public class PlanoAcademia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPLANO")
    private long IDPLANO;

    @Column()
    private String tipo_plano;
    private double valor_plano;
    
}
