/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Service;


import SistemaPos.SistemaPos.Model.cliente;
import SistemaPos.SistemaPos.Repository.clienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */

@Service
public class clienteServiceImplement implements clienteService{
    
      
    @Autowired
    private clienteRepository clienteRepository;

    @Override
    public cliente newcliente(cliente newcliente) {
        return clienteRepository.save(newcliente);
    }

    @Override
    public Iterable<cliente> getAll() {
      return this.clienteRepository.findAll();
    }

    @Override
    public cliente modifycliente(cliente cliente) {
        Optional<cliente> Elencontrado=this.clienteRepository.findById(cliente.getClienteid());
        if(Elencontrado.get()!=null){
            Elencontrado.get().setName(cliente.getName());
            Elencontrado.get().setEmail(cliente.getEmail());
         
            
            return this.newcliente(Elencontrado.get());
            
        }
        
       return null;
    }

    @Override
    public Boolean deletecliente(Long id) {
       this.clienteRepository.deleteById(id);
        return true;
    }
    
}
