/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ista.edu.project.ProyectoFactura.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author DELL
 */
@Getter
@Setter
@Entity
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer id_detalle;
    @Column(name = "num_factura")
    private Integer num_factura;
    @Column(name = "cantidad")
    private Integer cantidad;
    
    //RELACIONES
    //Relacion con factura
    @ManyToOne
    @JoinColumn(name = "id_factura",referencedColumnName = "id_factura")
    private Factura factura;
    //Relacion con producto
    @ManyToOne
    @JoinColumn(name = "id_producto",referencedColumnName = "id_producto")
    private Producto producto;
}
