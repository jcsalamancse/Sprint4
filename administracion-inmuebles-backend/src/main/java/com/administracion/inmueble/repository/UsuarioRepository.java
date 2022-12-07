package com.administracion.inmueble.repository;

import com.administracion.inmueble.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername (String username);
}
