/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Controller;

import SistemaPos.SistemaPos.Model.cliente;
import SistemaPos.SistemaPos.Service.clienteService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/cliente")
public class clienteController {
      
    @Autowired
    private clienteService clienteservice;
    
    
    @PostMapping("/crear")
    public cliente newcliente(@RequestBody cliente cliente){
        
        return this.clienteservice.newcliente(cliente);
        
    }
    
    
    @GetMapping ("/mostrar")
    public Iterable<cliente> getAll(){
        return clienteservice.getAll();
    }
    
    @PostMapping("/modificar")
    
    public cliente updatecliente(@RequestBody cliente cliente){
        return this.clienteservice.modifycliente(cliente);
    }
    
    
    @PostMapping (value="/{id}")
    public Boolean deletecliente (@PathVariable(value="id") Long id){
        return this.clienteservice.deletecliente(id);
    }
    
    
}
