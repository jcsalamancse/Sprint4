package Sprint4.adminis.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_copropietario")

public class copropietarioModelo implements Serializable {

    @Id
    private Long id_copro;

    public String getNombre_copro() {
        return nombre_copro;
    }

    public void setNombre_copro(String nombre_copro) {
        this.nombre_copro = nombre_copro;
    }

    public String getIdentificacion_copro() {
        return identificacion_copro;
    }

    public void setIdentificacion_copro(String identificacion_copro) {
        this.identificacion_copro = identificacion_copro;
    }
    private String nombre_copro;
    private String identificacion_copro;

    public Long getId_copro() {
        return id_copro;
    }

    public void setId_copro(Long id_copro) {
        this.id_copro = id_copro;
    }

}
