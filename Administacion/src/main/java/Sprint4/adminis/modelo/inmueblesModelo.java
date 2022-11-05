package Sprint4.adminis.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_inmuebles")

public class inmueblesModelo implements Serializable {

    @Id
    private Long id_Inmuebles;
    private Long nombre_inmueble;

  
}
