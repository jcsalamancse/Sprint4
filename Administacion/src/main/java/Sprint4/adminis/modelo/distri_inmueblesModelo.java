package Sprint4.adminis.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_distribucion_inmuebles")

public class distri_inmueblesModelo implements Serializable {

    @Id
    private Long id_apartamento;
    private Long No_apto;

    public Long getNo_apto() {
        return No_apto;
    }

    public void setNo_apto(Long No_apto) {
        this.No_apto = No_apto;
    }

    public Long getId_apartamento() {
        return id_apartamento;
    }

    public void setId_apartamento(Long id_apartamento) {
        this.id_apartamento = id_apartamento;
    }

}
