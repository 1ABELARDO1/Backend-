/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Service;

import SistemaPos.SistemaPos.Model.empleado;
import SistemaPos.SistemaPos.Repository.empleadoRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class empleadoServiceImplement implements empleadoService {
    
    
    @Autowired
    private empleadoRepository empleadoRepository;
    
    
    @Override
    public empleado newEmpleado(empleado newEmpleado) {
        return empleadoRepository.save(newEmpleado);
    }

    @Override
    public Iterable<empleado> getAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public empleado modifyEmpleado(empleado empleado) {
        Optional<empleado> encontrado = empleadoRepository.findById(empleado.getEmpleadoid());
        if (encontrado.isPresent()) {
            empleado existente = encontrado.get();
            encontrado.get().setNombre(empleado.getNombre());
            encontrado.get().setPuesto(empleado.getPuesto());
            encontrado.get().setSalario(empleado.getSalario());
            encontrado.get().setTelefono(empleado.getTelefono());
            encontrado.get().setEmail(empleado.getEmail());
           // Guarda y retorna el empleado actualizado
        return empleadoRepository.save(existente);
        } else {
        // Manejo de error en caso de que el empleado no exista
        throw new EntityNotFoundException("Empleado no encontrado con el id: " + empleado.getEmpleadoid());
    }
        
    }

    @Override
    public Boolean deleteEmpleado(Long id) {
        empleadoRepository.deleteById(id);
        return true;
    }
    
}
