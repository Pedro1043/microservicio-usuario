package com.medes.microservicio_usuario.domain.service;

import com.medes.microservicio_usuario.domain.entity.Usuario;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> getAll();
    Optional<Usuario> getById(Long idUsuario);
    Usuario save(Usuario usuario);
    String delete(Long idUsuario);
    //UserDetails loadUserByUsername(String username);
    String authenticate(String username, String password);
}
