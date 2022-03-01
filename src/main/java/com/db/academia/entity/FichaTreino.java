package com.db.academia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "fichatreino")
@Data
public class FichaTreino {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DATATREINO")
    private long DATATREINO;

    @Column()
    private int repeticoes;
    private int series;
    private String divisaoTreino;
    private long IDPROFESSOR;
    private String IDALUNO;
    private int IDTREINO;
}
