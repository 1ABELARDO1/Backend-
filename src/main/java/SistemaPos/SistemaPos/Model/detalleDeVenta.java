/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author DELL
 */
@Entity
public class detalleDeVenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalledeventaid;
    
    private String  productos;
    private int cantidad;
    private double  subtotal;
    
      // Relación de muchos a uno con detalledeventa
    @ManyToOne
    @JoinColumn(name = "productoid")
    private producto producto;
    
     // Relación de muchos a uno con venta
    @ManyToOne
    @JoinColumn(name = "ventaid")
    private venta venta;

    public detalleDeVenta() {
    }

    public detalleDeVenta(Long detalledeventaid, String producto, int cantidad, double subtotal) {
        this.detalledeventaid = detalledeventaid;
        this.productos = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Long getDetalledeventaid() {
        return detalledeventaid;
    }

    public void setDetalledeventaid(Long detalledeventaid) {
        this.detalledeventaid = detalledeventaid;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }

    public venta getVenta() {
        return venta;
    }

    public void setVenta(venta venta) {
        this.venta = venta;
    }
    

    
    
    
    
    
    

  
    
    
}
