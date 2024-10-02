/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.utp.lab8.persistence;

import java.util.List;
import java.util.Optional;
import pe.edu.utp.lab8.modelo.Estudiante;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jose Bustamante
 */

public interface EstudianteCrud extends CrudRepository<Estudiante, Integer> {
    
    public List<Estudiante> findByActivo(boolean activo);
    
    public Optional<Estudiante> findByIdAndActivo(Integer id, boolean activo);
    
    public Optional<Estudiante> findByIdAndActivoTrue(Integer id);
    
}
