package com.administracion.administracion.service;

import com.administracion.administracion.entity.Distribucion_inmuebles;
import com.administracion.administracion.repository.DistribInmuebleRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Distribucion_InmueblesServiceImpl implements Distribucion_InmueblesService {

    @Autowired
    private DistribInmuebleRepository distribucioninmuebles;

    @Override
    public List<Distribucion_inmuebles> find() {
        return distribucioninmuebles.findAll();
    }

    @Override
    public List<Distribucion_inmuebles> findAllCustom() {
        return distribucioninmuebles.findAllCustom();
    }

    @Override
    public Optional<Distribucion_inmuebles> findById(long id) {
        return distribucioninmuebles.findById(id);
    }

    @Override
    public Distribucion_inmuebles add(Distribucion_inmuebles di) {
        return distribucioninmuebles.save(di);
    }

    @Override
    public Distribucion_inmuebles update(Distribucion_inmuebles di) {
        Distribucion_inmuebles objdistribucioninmueble = distribucioninmuebles.getById(di.getIdaparta());
        BeanUtils.copyProperties(di, objdistribucioninmueble);
        return distribucioninmuebles.save(objdistribucioninmueble);
    }

    @Override
    public Distribucion_inmuebles delete(Distribucion_inmuebles di) {
        Distribucion_inmuebles objdistribucioninmueble = distribucioninmuebles.getById(di.getIdaparta());
        objdistribucioninmueble.setNumeroapartamento(0);
        return distribucioninmuebles.save(objdistribucioninmueble);
    }

}
