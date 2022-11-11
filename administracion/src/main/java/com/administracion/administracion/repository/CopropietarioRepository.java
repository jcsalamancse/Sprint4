package com.administracion.administracion.repository;

import com.administracion.administracion.entity.Copropietario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CopropietarioRepository extends JpaRepository<Copropietario, Long> {

    @Query("select c * from Copropietario c ")
    List<Copropietario> findAllCustom();

}
