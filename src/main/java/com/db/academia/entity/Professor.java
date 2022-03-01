package com.db.academia.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "professor")
@Data
public class Professor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROFESSOR")
    private long IDPROFESSOR;

    @Column()
    private char sexo;
    private String formacao;
    private double salario;
    private String nomeProfessor;
    private String telefone;
    private int idadeProfessor;
    private String periodo;  
}

