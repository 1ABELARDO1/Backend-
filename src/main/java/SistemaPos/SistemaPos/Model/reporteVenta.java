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
public class reporteVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reporteVentaid;

    private Date fechaReporte;
    private double  totalVentas;
    
      // Relación de muchos a uno con proveedores
    @ManyToOne
    @JoinColumn(name = "ventaid")
    private venta venta;

    public reporteVenta() {
    }

    public reporteVenta(Long reporteVentaid, Date fechaReporte, double totalVentas) {
        this.reporteVentaid = reporteVentaid;
        this.fechaReporte = fechaReporte;
        this.totalVentas = totalVentas;
    }

    public Long getReporteVentaid() {
        return reporteVentaid;
    }

    public void setReporteVentaid(Long reporteVentaid) {
        this.reporteVentaid = reporteVentaid;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public venta getVenta() {
        return venta;
    }

    public void setVenta(venta venta) {
        this.venta = venta;
    }
    

   
    
   
    
}
