package Ejercicio.Model.Repository;

import Ejercicio.Model.Tennis;

import java.io.IOException;
import java.util.List;

public interface TennisRpository {
    List<Tennis> obtainAll() throws IOException, ClassNotFoundException;

    void add(Tennis tennis) throws IOException;
    Tennis obtainById(Integer accesedId) ;
    void update(Tennis tennis) throws IOException;
    void delete(Integer accesedId) throws  IOException;

    abstract String mostrarAccion();
}
