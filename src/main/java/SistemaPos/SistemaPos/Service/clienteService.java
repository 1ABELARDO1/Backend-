/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaPos.SistemaPos.Service;


import SistemaPos.SistemaPos.Model.cliente;

/**
 *
 * @author DELL
 */
public interface clienteService {
    cliente newcliente (cliente newcliente);
    Iterable<cliente> getAll();
    cliente modifycliente (cliente cliente);
    Boolean deletecliente (Long id);
    
}
