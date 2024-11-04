/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author DELL
 */
@Entity
public class inventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventarioid;
    
    @Column(nullable = false)
    private Long codigo;
    
    @Column(nullable = false)
    private String producto;
    
    @Column(nullable = false)
    private double precio;
    
    @Column(nullable = false)
    private Long cantidad;
     
   
   
    
    
    
    
    // Relación de uno a muchos con Inventario
    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<detalleInventario> detalleinventario;
    
      
    // Relación de muchos a uno con administrador
    @ManyToOne
    @JoinColumn(name = "administradorid")
    private administrador administrador;
    
    

    public inventario() {
    }

    public inventario(Long inventarioid, Long codigo, String producto, double precio, Long cantidad, List<detalleInventario> detalleinventario, administrador administrador) {
        this.inventarioid = inventarioid;
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.detalleinventario = detalleinventario;
        this.administrador = administrador;
    }

    public Long getInventarioid() {
        return inventarioid;
    }

    public void setInventarioid(Long inventarioid) {
        this.inventarioid = inventarioid;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public List<detalleInventario> getDetalleinventario() {
        return detalleinventario;
    }

    public void setDetalleinventario(List<detalleInventario> detalleinventario) {
        this.detalleinventario = detalleinventario;
    }

    public administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(administrador administrador) {
        this.administrador = administrador;
    }

   
   

    
    
}
