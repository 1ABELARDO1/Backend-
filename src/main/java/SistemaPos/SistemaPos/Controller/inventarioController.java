/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Controller;

import SistemaPos.SistemaPos.Model.cliente;
import SistemaPos.SistemaPos.Model.inventario;
import SistemaPos.SistemaPos.Service.clienteService;
import SistemaPos.SistemaPos.Service.inventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */

@RestController
@RequestMapping("/inventario")
public class inventarioController {
     @Autowired
    private inventarioService inventarioservice;
     
     @PostMapping("/crear")
    public inventario newinventario(@RequestBody inventario inventario){
        
        return this.inventarioservice.newinventario(inventario);
        
    }
    
    
    @GetMapping ("/mostrar")
    public Iterable<inventario> getAll(){
        return inventarioservice.getAll();
    }
    
  @PostMapping("/modificar/{codigo}")
    public inventario updateinventario(@PathVariable Long codigo, @RequestBody inventario inventario) {
        return this.inventarioservice.modifyinventario(codigo, inventario);
    }
    
    
    @PostMapping (value="/{id}")
    public Boolean deleteinventario (@PathVariable(value="id") Long id){
        return this.inventarioservice.deleteinventario(id);
    }
    
}
