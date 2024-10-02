package pe.edu.utp.lab8.persistence;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pe.edu.utp.lab8.modelo.Carrera;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals; // Importa assertEquals para hacer las aserciones


@DataJpaTest
@AutoConfigureTestDatabase (connection = )

public class CarreraCrudTest {
    @Autowired
    private CarreraRepository repository;
    private Carrera sistemas = Carrera.builder()
            .nombre("Informatica y Sistemas")
            .nuCiclos("10")
            .estado(true)
            .build();
    private Carrera software;
    private List<Carrera> carreras;
    @BeforeEach
    public void setUp(){
        this.sistemas = Carrera.builder()
                .nombre("Informatica y Sistemas")
                .nuCiclos("10")
                .estado(true)
                .build();
        this.software = Carrera.builder()
                .nombre("Software")
                .nuCiclos("10")
                .estado(true)
                .build();
        this.carreras.add(sistemas);
        this.carreras.add(software);
    }
    @AfterEach
    public void tearDown(){
        this.sistemas = null;
        this.software = null;

    }
    @Test
    public void existByIdTest(){
        Carrera c = repository.save(this.sistemas);
        boolean existe = repository.existsById(c.getId());
        assertEquals(true, existe);
    }
}
