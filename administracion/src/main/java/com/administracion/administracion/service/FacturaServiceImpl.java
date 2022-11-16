package com.administracion.administracion.service;

import com.administracion.administracion.entity.Factura;
import com.administracion.administracion.repository.FacturaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturarepository;

    @Override
    public List<Factura> find() {
        return facturarepository.findAll();
    }

    @Override
    public List<Factura> findAllCustom() {
        return facturarepository.findAllCustom();
    }

    @Override
    public Optional<Factura> findById(long id) {
        return facturarepository.findById(id);
    }

    @Override
    public Factura add(Factura f) {
        return facturarepository.save(f);
    }

    @Override
    public Factura update(Factura f) {
        Factura objfacturarepository = facturarepository.getById(f.getIdfac());
        BeanUtils.copyProperties(f, objfacturarepository);
        return facturarepository.save(objfacturarepository);
    }

    @Override
    public Factura delete(Factura f) {
        Factura objfacturarepository = facturarepository.getById(f.getIdfac());
        objfacturarepository.setIdfac(0);
        return facturarepository.save(objfacturarepository);
    }

}
