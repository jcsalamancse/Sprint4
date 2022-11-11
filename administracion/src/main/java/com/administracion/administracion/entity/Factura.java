package com.administracion.administracion.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Factura")
@Table(name = "tbl_factura")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_factura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idfac;
    @Column(name = "valor")
    private Float valor;
    @Column(name = "mes_facturado")
    private String mesfactu;
    @Column(name = "fecha_pago")
    private Timestamp fechapago;
    @Column(name = "pago")
    private Long pago;
    @OneToOne
    @JoinColumn(name = "tbl_distribucion_inmuebles_id_apartamento", nullable = false)
    private Distribucion_inmuebles distribucioninmuebles;
    @OneToOne
    @JoinColumn(name = "tbl_copropietario_id_copro", nullable = false)
    private Copropietario copropietarioid;       
    @OneToOne
    @JoinColumn(name = "tbl_copropietario_tbl_inmuebles_id_Inmuebles", nullable = false)
    private Copropietario copropietario;
    @OneToOne
    @JoinColumn(name = "tbl_inmuebles_id_Inmuebles", nullable = false)
    private Inmuebles inmuebles;
}
