
package com.administracion.administracion.repository;



import com.administracion.administracion.entity.Distribucion_inmuebles;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DistribInmuebleRepository extends JpaRepository <Distribucion_inmuebles, Long> {
    @Query("select di * from Distribucion_inmuebles di ")
    List<Distribucion_inmuebles> findAllCustom();
}
