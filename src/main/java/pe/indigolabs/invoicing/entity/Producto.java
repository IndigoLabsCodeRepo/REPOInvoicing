package pe.indigolabs.invoicing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_Producto")
@Entity(name = "Producto")
public class Producto {

    @Id
    @Column(name = "Producto_id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "cantidad")
    private Integer cantidad;

}
