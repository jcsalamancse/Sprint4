package com.administracion.administracion.service;

import com.administracion.administracion.entity.Inmuebles;
import com.administracion.administracion.repository.InmueblesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InmuebleServiceImpl implements InmuebleService {
    
    @Autowired
    private InmueblesRepository inmueblerepository;
    
    @Override
    public List<Inmuebles> find() {
        return inmueblerepository.findAll();
    }
    
    @Override
    public List<Inmuebles> findAllCustom() {
        return inmueblerepository.findAllCustom();
    }
    
    @Override
    public Optional<Inmuebles> findById(long id) {
        return inmueblerepository.findById(id);
    }
    
    @Override
    public Inmuebles add(Inmuebles i) {
        return inmueblerepository.save(i);
    }
    
    @Override
    public Inmuebles update(Inmuebles i) {
        Inmuebles objinmueblesrepository = inmueblerepository.getById(i.getIdinmueble());
        BeanUtils.copyProperties(i, objinmueblesrepository);
        return inmueblerepository.save(objinmueblesrepository);
    }
    
    @Override
    public Inmuebles delete(Inmuebles i) {
        Inmuebles objinmueblesrepository = inmueblerepository.getById(i.getIdinmueble());
        String nombreinmueble = null;
        objinmueblesrepository.setNombreinmueble(nombreinmueble);
        return inmueblerepository.save(objinmueblesrepository);
    }
    
}
