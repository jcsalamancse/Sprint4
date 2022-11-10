package com.administracion.administracion.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "DistribucionInmuebles")
@Table(name = "tbl_distribucion_inmuebles")

public class Distribucion_inmuebles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_apartamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idaparta;
    private int numeroapartamento;
    @ManyToOne
    @JoinColumn(name = "tbl_inmuebles_id_Inmuebles", nullable = false)
    private Inmuebles inmuebles;
    @ManyToOne
    @JoinColumn(name = "tbl_copropietario_id_copro", nullable = false)
    private Copropietario idcopropietario;
    @ManyToOne
    @JoinColumn(name = "tbl_copropietario_tbl_inmuebles_id_Inmuebles", nullable = false)
    private Copropietario copropietario;
}
