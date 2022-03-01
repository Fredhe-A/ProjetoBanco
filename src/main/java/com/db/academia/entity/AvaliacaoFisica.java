package com.db.academia.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "avaliacaoFisica")
@Data

public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDAVALIACAO")
    private long IDAVALIACAO;

    @Column()
    private double peso;
    private double altura ;
    private double imc;
    private Date data_avaliacao;
    private int idaluno;
}
