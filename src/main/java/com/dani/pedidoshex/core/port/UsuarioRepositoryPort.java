package com.dani.pedidoshex.core.port;

import com.dani.pedidoshex.core.domain.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryPort {
    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Long id);
    Optional<Usuario> findByCorreo(String correo);
    List<Usuario> findAll();
    Usuario update(Usuario usuario);
    void deleteById(Long id);
}