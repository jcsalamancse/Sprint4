package com.administracion.administracion.service;

import com.administracion.administracion.entity.Inmuebles;
import java.util.List;
import java.util.Optional;

public interface InmuebleService {

    public List<Inmuebles> find();

    public List<Inmuebles> findAllCustom();

    public Optional<Inmuebles> findById(long id);

    public Inmuebles add(Inmuebles i);

    public Inmuebles update(Inmuebles i);

    public Inmuebles delete(Inmuebles i);
}
