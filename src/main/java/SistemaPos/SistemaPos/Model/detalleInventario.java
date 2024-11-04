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
import java.util.Date;

/**
 *
 * @author DELL
 */
@Entity
public class detalleInventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleInventarioid;

    private boolean stock;
    private Date  fecha_finalizacion;
    
    
    // Relación de muchos a uno con Producto
    @ManyToOne
    @JoinColumn(name = "productoid")
    private producto producto;
    
    // Relación de muchos a uno con inventario
    @ManyToOne
    @JoinColumn(name = "inventarioid")
    private inventario inventario;

    public detalleInventario() {
    }

    public detalleInventario(Long detalleInventarioid, boolean stock, Date fecha_finalizacion, producto producto, inventario inventario) {
        this.detalleInventarioid = detalleInventarioid;
        this.stock = stock;
        this.fecha_finalizacion = fecha_finalizacion;
        this.producto = producto;
        this.inventario = inventario;
    }

    public Long getDetalleInventarioid() {
        return detalleInventarioid;
    }

    public void setDetalleInventarioid(Long detalleInventarioid) {
        this.detalleInventarioid = detalleInventarioid;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }

    public inventario getInventario() {
        return inventario;
    }

    public void setInventario(inventario inventario) {
        this.inventario = inventario;
    }

    
    
    
    
    
    
    
}
