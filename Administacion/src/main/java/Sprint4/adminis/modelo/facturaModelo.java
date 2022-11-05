package Sprint4.adminis.modelo;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_factura")

public class facturaModelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura;
    private Float valor;
    private Long mes_facturado;
    private Time fecha_pago;
    private Boolean pago;
            
  
}
