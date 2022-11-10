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
@Entity(name = "Copropietario")
@Table(name = "tbl_copropietario")

public class Copropietario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_copro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcopro;
    @Column(name = "nombre_copro")
    private String nombrecopro;
    @Column(name = "identificacion_copro")
    private int identificacioncopro;
    @ManyToOne
    @JoinColumn(name = "tbl_inmuebles_id_Inmuebles", nullable = false)
        private Inmuebles inmuebles;

  

}
