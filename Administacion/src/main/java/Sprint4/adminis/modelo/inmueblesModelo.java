package Sprint4.adminis.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import javax.persistence.Column;
import javax.validation.constraints.Size;

@Entity

@Table(name = "tbl_inmuebles")

public class inmueblesModelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_Inmuebles;
    @NotEmpty(message = "no puede estar vacio")
    @Size(min = 4, max = 12, message = "el tamaño tiene que estar entre 4 y 12")
    @Column(nullable = false, length = 30)
    private Long nombre_inmueble;
    @NotEmpty(message = "no puede estar vacio")
    @Column(nullable = false, length = 30)

    public Long getId_Inmuebles() {
        return id_Inmuebles;
    }

    public void setId_Inmuebles(Long id_Inmuebles) {
        this.id_Inmuebles = id_Inmuebles;
    }

    public Long getNombre_inmueble() {
        return nombre_inmueble;
    }

    public void setNombre_inmueble(Long nombre_inmueble) {
        this.nombre_inmueble = nombre_inmueble;
    }
  
    
    
}
