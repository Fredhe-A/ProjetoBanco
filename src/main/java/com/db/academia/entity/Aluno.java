package com.db.academia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "aluno")
@Data
public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDALUNO")
    private long IDALUNO;
    private long IDPLANO;
    private long IDENDERECO;

    @Column(name = "TELEFONE")
    private String telefone;
    private char sexo;
    private String nome;
    private long cpf;
    private int idade;   
}