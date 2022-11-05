package Sprint4.adminis.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_copropietario")

public class copropietarioModelo implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_copro;
    private String nombre_copro;
    private String identificacion_copro;

    public Long getId_copro() {
        return id_copro;
    }

    public void setId_copro(Long id_copro) {
        this.id_copro = id_copro;
    }
 
   

}
