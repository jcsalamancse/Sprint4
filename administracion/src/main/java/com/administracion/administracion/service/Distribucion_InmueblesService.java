package com.administracion.administracion.service;

import com.administracion.administracion.entity.Distribucion_inmuebles;
import java.util.List;
import java.util.Optional;

public interface Distribucion_InmueblesService {

    public List<Distribucion_inmuebles> find();

    public List<Distribucion_inmuebles> findAllCustom();

    public Optional<Distribucion_inmuebles> findById(long id);

    public Distribucion_inmuebles add(Distribucion_inmuebles di);

    public Distribucion_inmuebles update(Distribucion_inmuebles di);

    public Distribucion_inmuebles delete(Distribucion_inmuebles di);
}
