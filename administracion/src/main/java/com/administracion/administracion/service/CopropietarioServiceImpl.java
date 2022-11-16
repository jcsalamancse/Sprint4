package com.administracion.administracion.service;

import com.administracion.administracion.entity.Copropietario;
import com.administracion.administracion.repository.CopropietarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopropietarioServiceImpl implements CopropietarioService {

    @Autowired
    private CopropietarioRepository copropietariorepositorio;

    @Override
    public List<Copropietario> find() {
        return copropietariorepositorio.findAll();
    }

    @Override
    public List<Copropietario> findAllCustom() {
        return copropietariorepositorio.findAllCustom();
    }

    @Override
    public Optional<Copropietario> findById(long id) {
        return copropietariorepositorio.findById(id);
    }

    @Override
    public Copropietario add(Copropietario c) {
        return copropietariorepositorio.save(c);
    }

    @Override
    public Copropietario update(Copropietario c) {
        Copropietario objcopropietario = copropietariorepositorio.getById(c.getIdcopro());
        BeanUtils.copyProperties(c, objcopropietario);;
        return copropietariorepositorio.save(objcopropietario);
    }

    @Override
    public Copropietario delete(Copropietario c) {
        Copropietario objcopropietario = copropietariorepositorio.getById(c.getIdcopro());
        objcopropietario.setIdentificacioncopro(0);
        return copropietariorepositorio.save(objcopropietario);
    }

}
