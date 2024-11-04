/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaPos.SistemaPos.Repository;

import SistemaPos.SistemaPos.Model.cliente;
import SistemaPos.SistemaPos.Model.empleado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface empleadoRepository extends JpaRepository<empleado,Long> {
    
}
