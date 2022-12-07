package com.administracion.inmueble.model;

import javax.persistence.*;


@Entity

public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne
    private  Rol rol;

    public Long getUsarioRolId() {
        return usarioRolId;
    }

    public void setUsarioRolId(Long usarioRolId) {
        this.usarioRolId = usarioRolId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public UsuarioRol(Long usarioRolId, Usuario usuario, Rol rol) {
        this.usarioRolId = usarioRolId;
        this.usuario = usuario;
        this.rol = rol;
    }

    public UsuarioRol() {
    }
}
