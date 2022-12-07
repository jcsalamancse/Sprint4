package com.administracion.inmueble;

import com.administracion.inmueble.model.Rol;
import com.administracion.inmueble.model.Usuario;
import com.administracion.inmueble.model.UsuarioRol;
import com.administracion.inmueble.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AdministracionInmueblesBackendApplication implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    public static void main(String[] args) {
        SpringApplication.run(AdministracionInmueblesBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* Usuario usuario = new Usuario();

        usuario.setNombre("Juan");
        usuario.setApellido("Salamanca");
        usuario.setUsername("jcsalamancse");
        usuario.setPassword("12345");
        usuario.setEmail("juan.salamanca98@gmail.com");
        usuario.setTelefono("3146807375");
        usuario.setPerfil("foto.foto");

        Rol rol = new Rol();
        rol.setRolId(1L);
        rol.setNombre("ADMIN");

        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setRol(rol);
        usuarioRol.setUsuario(usuario);
        usuarioRoles.add(usuarioRol);
        Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);

        System.out.println(usuarioGuardado.getUsername());*/

    }
}
