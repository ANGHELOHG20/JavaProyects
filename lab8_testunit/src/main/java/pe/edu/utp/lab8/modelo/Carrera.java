/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.lab8.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jose Bustamante
 */
@Entity //Si tengo un esquema de base de datos diferente
        // @Table(name ="nombre del esquema" );
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor

public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column (name = "nombrecito) Si la base de datos ya tiene un nombre
    private Integer id;
    private String nombre;
    private int nuCiclos;
    private boolean estado;

}
