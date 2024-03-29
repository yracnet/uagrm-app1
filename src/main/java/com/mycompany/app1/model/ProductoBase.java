package com.mycompany.app1.model;

import javax.persistence.Column;
import javax.persistence.Embedded; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class ProductoBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private Double precio;
    @Column
    private Long cantidadDisponible;
    @Embedded
    private CreatedPolice creacion;
    @Embedded
    private UpdatedPolice actualizacion;

    public static ProductoBase createProductoBase(Long id) {
        ProductoBase instance = new ProductoBase();
        instance.setId(id);
        instance.setNombre("Name" + id);
        return instance;
    }

}
