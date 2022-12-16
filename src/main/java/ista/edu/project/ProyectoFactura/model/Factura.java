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
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author DELL
 */
@Entity
@Getter
@Setter
public class Factura {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id_factura;
    @Column(name = "fecha")
    private Date fecha;
    
    //Relaciones
    //Relacion con cliente
    @ManyToOne
    @JoinColumn(name = "id_cliente",referencedColumnName = "id_cliente")
    private Cliente cliente;
    
    //Relacion con detalle
    @OneToMany(mappedBy = "factura")
    private List<DetalleFactura> detalles;

}
