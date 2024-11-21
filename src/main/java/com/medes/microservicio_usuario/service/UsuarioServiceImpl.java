package com.medes.microservicio_usuario.service;
/*
import com.medes.microservicio_usuario.domain.entity.Usuario;
import com.medes.microservicio_usuario.domain.repository.UsuarioRepository;
import com.medes.microservicio_usuario.domain.service.UsuarioService;
import com.medes.microservicio_usuario.jwt.JwtUtil;
import lombok.AllArgsConstructor;*/
/*
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository usuarioRepository;
    private JwtUtil jwtUtil;
    private BCryptPasswordEncoder passwordEncoder;

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
        // Cifrar la contraseña antes de almacenarla
        String encryptedPassword = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(encryptedPassword);
        return usuarioRepository.save(usuario);
    }

    @Override
    public String delete(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
        return "Id: " + idUsuario + " delete";
    }

    // Aquí puedes tener un repositorio que consulte la base de datos
    // pero por ahora supongamos que tienes un método simple de validación
    @Override
    public String authenticate(String username, String password) {
        // Buscar el usuario en la base de datos
        Optional<Usuario> usuario = usuarioRepository.findByUsername(username);
        if (usuario.isEmpty()) {
            throw new RuntimeException("Usuario no encontrado");
        }

        // Obtener el objeto Usuario
        Usuario user = usuario.get();

        // Verificar si la contraseña proporcionada coincide con la almacenada en la base de datos
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Credenciales incorrectas");
        }

        // Generar el token JWT
        return jwtUtil.generateToken(user.getUsername());
    }
}
*/