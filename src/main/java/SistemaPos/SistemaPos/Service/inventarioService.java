/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaPos.SistemaPos.Service;

import SistemaPos.SistemaPos.Model.cliente;
import SistemaPos.SistemaPos.Model.inventario;

/**
 *
 * @author DELL
 */
public interface inventarioService {
    inventario newinventario (inventario newinventario);
    Iterable<inventario> getAll();
    inventario modifyinventario(Long codigo,inventario inventario);
    Boolean deleteinventario (Long id);
    
}
