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
public class proveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proveedorid;
    private String nameempresa;
    private String  direecion;
    private String  telefono;
    private String  email;
    
    // Relación de uno a muchos
    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<producto> producto;

    public proveedor() {
    }

    public proveedor(Long proveedorid, String nameempresa, String direecion, String telefono, String email, List<producto> producto) {
        this.proveedorid = proveedorid;
        this.nameempresa = nameempresa;
        this.direecion = direecion;
        this.telefono = telefono;
        this.email = email;
        this.producto = producto;
    }

    public Long getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(Long proveedorid) {
        this.proveedorid = proveedorid;
    }

    public String getNameempresa() {
        return nameempresa;
    }

    public void setNameempresa(String nameempresa) {
        this.nameempresa = nameempresa;
    }

    public String getDireecion() {
        return direecion;
    }

    public void setDireecion(String direecion) {
        this.direecion = direecion;
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

    public List<producto> getProducto() {
        return producto;
    }

    public void setProducto(List<producto> producto) {
        this.producto = producto;
    }
    
    

  
    
    
}
