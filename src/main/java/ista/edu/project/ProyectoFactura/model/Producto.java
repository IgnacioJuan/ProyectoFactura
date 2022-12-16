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
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author DELL
 */
@Getter
@Setter
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id_producto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "stock")
    private Integer stock;

    //RELACIONES
    //Relacion con detalle
    @OneToMany(mappedBy = "producto")
    private List<DetalleFactura> detalles;

}
