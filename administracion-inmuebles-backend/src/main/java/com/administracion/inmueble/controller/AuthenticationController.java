package com.administracion.inmueble.controller;


import com.administracion.inmueble.configurations.JwtUtils;
import com.administracion.inmueble.model.JwtRequest;
import com.administracion.inmueble.model.JwtResponse;
import com.administracion.inmueble.services.impl.UserDetailsServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServicesImpl userDetailsServices;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/generate-token")
    public ResponseEntity<?> generarToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        try {
            autenticar(jwtRequest.getUsername(), jwtRequest.getPassword());
        } catch (Exception exception) {
            exception.printStackTrace();
            throw new Exception("Usuario no encontrado");
        }
        UserDetails userDetails = this.userDetailsServices.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }


    private void autenticar(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException disabledException) {
            throw new Exception("Usuario Inactivado " + disabledException.getMessage());

        } catch (BadCredentialsException badCredentialsException) {
            throw new Exception("Credenciales erradas" + badCredentialsException.getMessage());
        }
    }

    /*@GetMapping("/actual-usuario")
    public Usuario obtenerUsuarioActual(Principal principal) {
        return (Usuario) this.userDetailsServices.loadUserByUsername(principal.getName());
    }*/
}
