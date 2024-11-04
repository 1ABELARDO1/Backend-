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
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author DELL
 */
@Entity
public class cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteid;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String  email;
    
       // Relación de uno a muchos con venta
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<venta> venta;
    


    public cliente() {
    }

    public cliente(Long clienteid, String name, String email) {
        this.clienteid = clienteid;
        this.name = name;
        this.email = email;
    }
    

    public Long getClienteid() {
        return clienteid;
    }

    public void setClienteid(Long clienteid) {
        this.clienteid = clienteid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<venta> getVenta() {
        return venta;
    }

    public void setVenta(List<venta> venta) {
        this.venta = venta;
    }

  
    
    
    
    
}
