package com.administracion.administracion.repository;

import com.administracion.administracion.entity.Factura;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

    @Query("select f * from Factura f ")
    List<Factura> findAllCustom();
}
