package validadorCorrelativas;

import java.time.LocalDate;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = LocalDate.now();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean aprobada(){
        /**
         * ¿Como sabemos si la inscripcion esta aceptada?
         * -La inscripcion esta aceptada (TRUE) si la materia no tiene Correlativas
         * -La inscripcion esta aceptada (TRUE) si la materia tiene correlativas y el alumno cumple
         * con todos ellos.
         */
        return !this.materia.tenesCorrelativas() || this.materia.puedeCursar(this.alumno);


    }
}
