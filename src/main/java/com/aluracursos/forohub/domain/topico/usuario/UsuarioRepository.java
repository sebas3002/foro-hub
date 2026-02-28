package com.aluracursos.forohub.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<com.aluracursos.forohub.domain.usuario.Usuario, Long> {
    UserDetails findByLogin(String login);
}