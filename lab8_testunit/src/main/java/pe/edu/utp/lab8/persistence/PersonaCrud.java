/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.utp.lab8.persistence;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import pe.edu.utp.lab8.modelo.Persona;

/**
 *
 * @author Jose Bustamante
 */
public interface PersonaCrud extends CrudRepository<Persona, Integer>{
    
    public Optional<Persona> findByDni(String dni);
}
