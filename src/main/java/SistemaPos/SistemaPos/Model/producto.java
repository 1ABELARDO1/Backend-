/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Model;

import jakarta.persistence.CascadeType;
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
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoid;

    private String name;
    private String  descripcion;
    private String precio;
    private boolean  stock;
    
    // Relación de muchos a uno con proveedores
    @ManyToOne
    @JoinColumn(name = "proveedorid")
    private proveedor proveedor;
    
    
     // Relación de uno a muchos con Inventario
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<detalleInventario> detalleinventario;
    
     // Relación de uno a muchos con detalledeventa
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<detalleDeVenta> detalledeventa;

    public producto() {
    }

    public producto(Long productoid, String name, String descripcion, String precio, boolean stock, proveedor proveedor, List<detalleInventario> detalleinventario) {
        this.productoid = productoid;
        this.name = name;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
        this.detalleinventario = detalleinventario;
    }

    public Long getProductoid() {
        return productoid;
    }

    public void setProductoid(Long productoid) {
        this.productoid = productoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<detalleInventario> getDetalleinventario() {
        return detalleinventario;
    }

    public void setDetalleinventario(List<detalleInventario> detalleinventario) {
        this.detalleinventario = detalleinventario;
    }

    public List<detalleDeVenta> getDetalledeventa() {
        return detalledeventa;
    }

    public void setDetalledeventa(List<detalleDeVenta> detalledeventa) {
        this.detalledeventa = detalledeventa;
    }

    
    
    
    
    
}
