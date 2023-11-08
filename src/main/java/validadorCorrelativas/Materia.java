package validadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre){
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
public void agregarCorrelativas(Materia correlativa){

        this.correlativas.add(correlativa);
}
    public boolean puedeCursar(Alumno alumno) {
/**
 * El alumno puede cursar la materia si cumple/tiene todas las correlativas necesarias
 */
return this.correlativas.stream().allMatch(materiaCorrelativa -> alumno.tenesCorrelativa(materiaCorrelativa));
    }
    public boolean tenesCorrelativas() {
        return !this.correlativas.isEmpty();
    }


}
