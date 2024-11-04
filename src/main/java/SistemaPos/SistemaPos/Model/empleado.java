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
public class empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empleadoid;

    private String nombre;
    private String puesto;
    private double salario;
    private String  telefono;
    private String  email;
    
         // Relación de uno a muchos con venta
    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<venta> venta;

   public empleado() {
    }

    public empleado(Long empleadoid, String nombre, String puesto, double salario, String telefono, String email) {
        this.empleadoid = empleadoid;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.telefono=telefono;
        this.email=email;
    }

    public Long getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(Long empleadoid) {
        this.empleadoid = empleadoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    


   
    public List<venta> getVenta() {
        return venta;
    }

    public void setVenta(List<venta> venta) {
        this.venta = venta;
    }

   
    
    
    
}
