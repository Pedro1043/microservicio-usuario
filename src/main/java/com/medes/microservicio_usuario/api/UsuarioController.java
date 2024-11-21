/*
package com.medes.microservicio_usuario.api;

import com.medes.microservicio_usuario.domain.entity.Usuario;
import com.medes.microservicio_usuario.jwt.JwtUtil;
import com.medes.microservicio_usuario.service.UsuarioServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/microservicio-usuario/v1/usuario")
public class UsuarioController {

    @Autowired
    private JwtUtil jwtUtil;

    private final UsuarioServiceImpl usuarioService;

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest loginRequest) {
        try {
            // Llamar al servicio para autenticar al usuario y generar el JWT
            return usuarioService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
        } catch (RuntimeException e) {
            return e.getMessage(); // Devuelve el mensaje de error si las credenciales son incorrectas
        }
    }

    @GetMapping("getAll")
    public List<Usuario> fetchAll() {
        return usuarioService.getAll();
    }

    @GetMapping("/{idUsuario}")
    public Optional<Usuario> fetchById (@PathVariable Long idUsuario) {
        return usuarioService.getById(idUsuario);
    }

    @PostMapping("/add")
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idUsuario}")
    public void delete(@PathVariable Long idUsuario) {
        usuarioService.delete(idUsuario);
    }

}
*/