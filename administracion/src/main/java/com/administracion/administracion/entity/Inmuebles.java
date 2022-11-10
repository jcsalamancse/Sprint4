
package com.administracion.administracion.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Inmuebles")
@Table(name="tbl_inmuebles")
public class Inmuebles implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_Inmuebles")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idinmueble;
    @Column(name = "nombre_inmueble")
    private String nombreinmueble;
   
    
}
