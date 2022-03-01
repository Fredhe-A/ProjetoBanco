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
@Table(name = "contreleEntrada")
@Data

public class ControleEntrada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontrole")
    private long idcontrole;

    @Column()
    private Date datahora_entrada;
    private Date datahora_saida;
    private int idaluno;
    private int idacademia;
    
}
