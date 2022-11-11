package com.administracion.administracion.service;

import com.administracion.administracion.entity.Copropietario;
import java.util.List;
import java.util.Optional;

public interface CopropietarioService {

    public List<Copropietario> find();

    public List<Copropietario> findAllCustom();

    public Optional<Copropietario> findById(long id);

    public Copropietario add(Copropietario c);

    public Copropietario update(Copropietario c);

    public Copropietario delete(Copropietario c);

}
