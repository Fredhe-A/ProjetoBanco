package com.db.academia.service;

import com.db.academia.entity.Usuario;
import com.db.academia.repository.RepUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServUsuario {
    private final RepUsuario repUsuario;

    @Autowired
    public ServUsuario(RepUsuario _repUsuario) {
        this.repUsuario = _repUsuario;
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return repUsuario.save(usuario);
    }
}
