package validadorCorrelativasTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validadorCorrelativas.Alumno;
import validadorCorrelativas.Inscripcion;
import validadorCorrelativas.Materia;

public class InscripcionTest {
    @Test
    public void GustavoSePuedeAnotarAProgramacionI() {
        Alumno Gustavo = new Alumno("Gustavo", "23122012");
        Materia ProgramacionI = new Materia("Programacion I");
        Inscripcion inscripcionDeGustavoAProgramacionI = new Inscripcion(Gustavo, ProgramacionI);

        Assertions.assertTrue(inscripcionDeGustavoAProgramacionI.aprobada());

    }

    @Test
    public void GustavoNoSePuedeAnotarAProgramacionII() {
        Alumno Gustavo = new Alumno("Gustavo", "23122012");
        Materia ProgramacionI = new Materia("Programacion I");
        Materia ProgramacionII = new Materia("Programacion II");

        ProgramacionII.agregarCorrelativas(ProgramacionI);

        Inscripcion inscripcionDeGustavoAProgramacionII = new Inscripcion(Gustavo, ProgramacionII);

        Assertions.assertFalse(inscripcionDeGustavoAProgramacionII.aprobada());

    }

    @Test
    public void GustavoSePuedeAnotarAProgramacionII() {
        Alumno Gustavo = new Alumno("Gustavo", "23122012");
        Materia ProgramacionI = new Materia("Programacion I");
        Materia ProgramacionII = new Materia("Programacion II");

        ProgramacionII.agregarCorrelativas(ProgramacionI);

        Gustavo.agregarMateriaAprobada(ProgramacionI);

        Inscripcion inscripcionDeGustavoAProgramacionII = new Inscripcion(Gustavo, ProgramacionII);

        Assertions.assertTrue(inscripcionDeGustavoAProgramacionII.aprobada());

    }
}