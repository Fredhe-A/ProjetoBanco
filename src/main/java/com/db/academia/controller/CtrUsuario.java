package com.db.academia.controller;

import com.db.academia.entity.Usuario;
import com.db.academia.service.ServUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/usuario")
public class CtrUsuario {
    private final ServUsuario servUsuario;

    @Autowired
    public CtrUsuario(ServUsuario _servUsuario) {
        this.servUsuario = _servUsuario;
    }

    @PostMapping("/salvar")
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return servUsuario.salvarUsuario(usuario);
    }

}
