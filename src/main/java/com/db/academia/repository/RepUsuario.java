package com.db.academia.repository;

import com.db.academia.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepUsuario extends JpaRepository<Usuario, Long> {
    
}
