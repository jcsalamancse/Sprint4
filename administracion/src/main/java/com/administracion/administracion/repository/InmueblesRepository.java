
package com.administracion.administracion.repository;


import com.administracion.administracion.entity.Inmuebles;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface InmueblesRepository  extends JpaRepository<Inmuebles, Long> {
    @Query("select i * from Inmuebles i ") 
    List<Inmuebles> findAllCustom();
}
