package com.administracion.administracion.service;

import com.administracion.administracion.entity.Factura;
import java.util.List;
import java.util.Optional;

public interface FacturaService {

    public List<Factura> find();

    public List<Factura> findAllCustom();

    public Optional<Factura> findById(long id);

    public Factura add(Factura f);

    public Factura update(Factura f);

    public Factura delete(Factura f);
}
