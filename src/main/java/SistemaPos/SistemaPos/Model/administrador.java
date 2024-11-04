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
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author DELL
 */
@Entity
public class administrador {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long administradorid;

    private String name;
    private String  telefono;
    private String  email;
    
    
     // Relación de uno a muchos con Inventario
    @OneToMany(mappedBy = "administrador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<inventario> inventario;
    
        // Relación de uno a muchos con venta
    @OneToMany(mappedBy = "administrador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<venta> venta;
    

    public administrador() {
    }

    public Long getIadministradorid() {
        return administradorid;
    }

    public void setIadministradorid(Long administradorid) {
        this.administradorid = administradorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<inventario> inventario) {
        this.inventario = inventario;
    }

    public Long getAdministradorid() {
        return administradorid;
    }

    public void setAdministradorid(Long administradorid) {
        this.administradorid = administradorid;
    }

    public List<venta> getVenta() {
        return venta;
    }

    public void setVenta(List<venta> venta) {
        this.venta = venta;
    }
    
    

   
    
    
    
    
    
    
}
