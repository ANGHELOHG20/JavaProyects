/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pe.edu.utp.lab8.persistence;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pe.edu.utp.lab8.modelo.Estudiante;

/**
 *
 * @author Jose Bustamante
 */
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class EstudianteCrudTest {
    
    @Autowired
    private EstudianteCrud repository;
    private Estudiante alumno1;
    private Estudiante alumno2;
    private List<Estudiante> alumnos;    
    
    @BeforeEach
    public void setUp() {
        this.alumno1 = Estudiante.builder()
                .codigo("2024")
                .email("2024@utp.edu.pe")
                .activo(true)
                .build();
        
        this.alumno2 = Estudiante.builder()
                .codigo("2025")
                .email("2025@utp.edu.pe")
                .activo(true)
                .build();
                
        this.alumnos = List.of(alumno1, alumno2);
    }
    
    @AfterEach
    public void tearDown() {
        this.alumno1 = null;
        this.alumno2 = null;
        if(!this.alumnos.isEmpty())
            this.alumnos = null;
    }

    @Test
    void save_ReturnSaveEstudiante(){
        Estudiante e = repository.save(this.alumno1);
        assertNotNull(e);
        assertEquals("2024", e.getCodigo());
    }
}
