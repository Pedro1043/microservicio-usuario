package com.medes.microservicio_usuario.service;

import com.medes.microservicio_usuario.domain.entity.Usuario;
import com.medes.microservicio_usuario.domain.repository.UsuarioRepository;
import com.medes.microservicio_usuario.domain.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getById(Long idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public String delete(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
        return "Id: " + idUsuario + " delete";
    }
}
