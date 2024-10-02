/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.lab8.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Jose Bustamante
 */
@Entity
@Table(name = "estudiante")
@Getter
@Setter
@Builder
public class Estudiante implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private String email;
    private boolean activo;
    @Transient
    private Carrera carrera;

    public Estudiante() {
    }

    public Estudiante(Integer id, String codigo, String email, boolean activo, Carrera carrera) {
        this.id = id;
        this.codigo = codigo;
        this.email = email;
        this.activo = activo;
        this.carrera = carrera;
    }
    
}
