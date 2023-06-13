package Ejercicio.Model.Repository;

import Ejercicio.Model.Tennis;
import Ejercicio.Model.ObjectSerializaer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TennisListRepository implements TennisRpository{

    private List<Tennis> dataSource;




    @Override
    public List<Tennis> obtainAll() throws IOException, ClassNotFoundException {
       dataSource = (List<Tennis>) ObjectSerializaer.readObjectFromFile("Tennis.ax");
       return dataSource;
    }

    public TennisListRepository() throws  IOException, ClassNotFoundException{
        this.dataSource = new ArrayList<>();
    }
    @Override
    public void add(Tennis tennis) throws IOException {
        this.dataSource.add(tennis);
        ObjectSerializaer.writeObjectToFile(this.dataSource,"Tennis.ax");

    }

    @Override
    public Tennis obtainById(Integer accesedId) {
        Tennis t = null;
        for(Tennis tn: dataSource) {
            if (tn.getAccesedId() != null && tn.getAccesedId().equals(tn.getAccesedId())) {
                t = tn;
                break;
            }
        }
        return t;
    }

    @Override
    public void update(Tennis tennis) throws IOException {

    }

    @Override
    public void delete(Integer accesedId) throws IOException {
        this.dataSource.remove(this.obtainById(accesedId));
        ObjectSerializaer.writeObjectToFile(this.dataSource,"Tennis.ax");
    }

    @Override
    public String mostrarAccion() {
        return "¡Accion realizada con exito!";
    }


}
