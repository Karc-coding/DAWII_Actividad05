package com.consul.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consul.app.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
