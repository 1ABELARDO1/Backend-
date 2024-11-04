/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaPos.SistemaPos.Repository;


import SistemaPos.SistemaPos.Model.inventario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface inventarioRepository extends JpaRepository<inventario,Long>{
    
     Optional<inventario> findByCodigo(Long codigo);
    
}
