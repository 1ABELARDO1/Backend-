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
import java.util.Date;
import java.util.List;

/**
 *
 * @author DELL
 */
@Entity
public class venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ventaid;

    private Date fecha;
    private double  total;
    
      // Relación de muchos a uno con administrador
    @ManyToOne
    @JoinColumn(name = "administradorid")
    private administrador administrador;
    
        // Relación de muchos a uno con cliente
    @ManyToOne
    @JoinColumn(name = "clienteid")
    private cliente cliente;
    
       // Relación de uno a muchos con reporteventa
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<reporteVenta> reporteventa;
    
           // Relación de uno a muchos con detalledeventa
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<detalleDeVenta> detalledeventa;
    
      
    // Relación de muchos a uno con proveedores
    @ManyToOne
    @JoinColumn(name = "vendedorid")
    private empleado vendedor;

    public venta() {
    }

    public venta(Long ventaid, Date fecha, double total) {
        this.ventaid = ventaid;
        this.fecha = fecha;
        this.total = total;
    }

    public Long getVentaid() {
        return ventaid;
    }

    public void setVentaid(Long ventaid) {
        this.ventaid = ventaid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(administrador administrador) {
        this.administrador = administrador;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public List<reporteVenta> getReporteventa() {
        return reporteventa;
    }

    public void setReporteventa(List<reporteVenta> reporteventa) {
        this.reporteventa = reporteventa;
    }

    public empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(empleado vendedor) {
        this.vendedor = vendedor;
    }

    public List<detalleDeVenta> getDetalledeventa() {
        return detalledeventa;
    }

    public void setDetalledeventa(List<detalleDeVenta> detalledeventa) {
        this.detalledeventa = detalledeventa;
    }
    
    

    
    
 
    
}
