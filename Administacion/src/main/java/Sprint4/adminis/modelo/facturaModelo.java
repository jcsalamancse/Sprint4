package Sprint4.adminis.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_factura")

public class facturaModelo implements Serializable {

    @Id
    private Long id_factura;
    private Float valor;
    private Long valor;

   
}
