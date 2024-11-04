/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Service;

import SistemaPos.SistemaPos.Model.cliente;
import SistemaPos.SistemaPos.Model.inventario;
import SistemaPos.SistemaPos.Repository.inventarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class inventarioServiceImplement implements inventarioService {
     @Autowired
    private inventarioRepository inventarioRepository;

    @Override
    public inventario newinventario(inventario newinventario) {
         return inventarioRepository.save(newinventario);
       
    }

    @Override
    public Iterable<inventario> getAll() {
           return this.inventarioRepository.findAll();
      
    }

    @Override
    public inventario modifyinventario(Long codigo, inventario inventario) {
       Optional<inventario> Elencontrado = this.inventarioRepository.findByCodigo(codigo); // Busca por ID en vez de por código

    if (Elencontrado.isPresent()) { // Verifica si el valor está presente
        inventario inventarioExistente = Elencontrado.get(); // Obtiene el inventario existente
        inventarioExistente.setProducto(inventario.getProducto());
        inventarioExistente.setPrecio(inventario.getPrecio());
        inventarioExistente.setCantidad(inventario.getCantidad());

        return this.inventarioRepository.save(inventarioExistente); // Guarda los cambios en el repositorio
    }
    
    return null; // O puedes lanzar una excepción si prefieres
    
      
    }

    @Override
    public Boolean deleteinventario(Long id) {
          this.inventarioRepository.deleteById(id);
        return true;
      
    }
     
     
    
}
