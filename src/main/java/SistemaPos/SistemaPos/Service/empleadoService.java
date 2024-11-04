/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaPos.SistemaPos.Service;

import SistemaPos.SistemaPos.Model.empleado;

/**
 *
 * @author DELL
 */
public interface empleadoService {
    empleado newEmpleado(empleado newEmpleado);
    Iterable<empleado> getAll();
    empleado modifyEmpleado(empleado empleado);
    Boolean deleteEmpleado(Long id);
    
}
