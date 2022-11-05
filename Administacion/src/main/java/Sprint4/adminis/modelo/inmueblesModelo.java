package Sprint4.adminis.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;

@Entity
@Table(name = "tbl_inmuebles")

public class inmueblesModelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Inmuebles;

    private Long nombre_inmueble;
    @NotEmpty(message = "no puede estar vacio")
    @Column(nullable = false, length = 30)
  


}
