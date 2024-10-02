package pe.edu.utp.lab8.persistence;

import org.springframework.data.repository.CrudRepository;
import pe.edu.utp.lab8.modelo.Carrera;

import java.util.List;

public interface CarreraRepository  extends CrudRepository<Carrera, Integer> {
    public List<Carrera> findByActivo(boolean actiivo);
    public List<Carrera> findByActivoTrue();
    public boolean existsById(Integer id); //
    public int countAll();
    public int countByActivoTrue();

}
