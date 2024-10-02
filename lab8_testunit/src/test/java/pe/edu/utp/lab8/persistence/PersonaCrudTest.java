/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pe.edu.utp.lab8.persistence;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;
import org.assertj.core.util.Lists;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import pe.edu.utp.lab8.modelo.Persona;

/**
 *
 * @author Jose Bustamante
 */
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class PersonaCrudTest {

    @Autowired
    private PersonaCrud persistence;
    private Persona persona1;
    private Persona persona2;
    private List<Persona> personas;

    @BeforeEach
    void setUp() throws Exception {
        this.persona1 = new Persona();
        this.persona1.setDni("40597166");
        this.persona1.setNombre("Jose");
        this.persona1.setApellido1("Bustamante");
        this.persona1.setApellido2("Romero");
        this.persona1.setEmail("c29692@utp.edu.pe");
        
        this.persona2 = new Persona();
        this.persona2.setDni("40597167");
        this.persona2.setNombre("Jose");
        this.persona2.setApellido1("Bustamante");
        this.persona2.setApellido2("Romero");
        this.persona2.setEmail("c29692@utp.edu.pe");

        personas = List.of(this.persona1, this.persona2);
    }

    @AfterEach
    void tearDown() throws Exception {
        persona1 = null;
        persona2 = null;
        //listPersonas.clear();
    }
    
    @DisplayName("Guardar persona y reportar persona guardada")
    @Test
    void test_save_returnSavePersona() {
        Persona savePersona = persistence.save(persona1);
        assertNotNull(savePersona);
        assertEquals("c29692@utp.edu.pe", savePersona.getEmail());
        assertThat(savePersona.getId()).isNotNull();
    }

    @DisplayName("Actualizando persona")
    @Test
    void test_update_returnUpdatePersona() {
        Persona savePersona = persistence.save(persona1);
        Persona personaUp = persistence.findById(savePersona.getId()).get();
        personaUp.setNombre("Josecito");
        personaUp.setApellido1("Levano");
        Persona update = persistence.save(personaUp);
        assertNotNull(update);
        assertEquals("Josecito", update.getNombre() );
        assertEquals("Levano", update.getApellido1() );
    }
    
    @DisplayName("Listar Personas")
    @Test
    void test_list_returnPersonas(){
        persistence.saveAll(this.personas);
        List<Persona> lista = Lists.newArrayList(persistence.findAll());
        int size = lista.size();
        assertEquals(2, size);
        assertEquals("c29692@utp.edu.pe", lista.get(0).getEmail());
    }
    
    @DisplayName("Eliminar Personas")
    @Test
    void test_delete_persona(){
        persistence.saveAll(this.personas);
        Optional<Persona> personaA = persistence.findByDni("40597166");
        persistence.delete(personaA.get());
        //Optional<Persona> personaB = persistence.findById(2);
        //persistence.deleteById(personaB.get().getId());
        Optional<Persona> personaDel = persistence.findById(personaA.get().getId());
        assertEquals(Optional.empty(), personaDel, "Persona no se encuentra");
    }
}
