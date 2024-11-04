/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPos.SistemaPos.Controller;

import SistemaPos.SistemaPos.Model.empleado;
import SistemaPos.SistemaPos.Service.empleadoService;
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
@RequestMapping("/empleado")
public class empleadoController {
    @Autowired
    private empleadoService empleadoService;

    @PostMapping("/crear")
    public empleado newEmpleado(@RequestBody empleado empleado) {
        return empleadoService.newEmpleado(empleado);
    }

    @GetMapping("/mostrar")
    public Iterable<empleado> getAll() {
        return empleadoService.getAll();
    }

    @PostMapping("/modificar")
    public empleado updateEmpleado(@RequestBody empleado empleado) {
        return empleadoService.modifyEmpleado(empleado);
    }

    @PostMapping("/{id}")
    public Boolean deleteEmpleado(@PathVariable("id") Long id) {
        return empleadoService.deleteEmpleado(id);
    }
    
    
}
