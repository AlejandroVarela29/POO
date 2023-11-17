import java.util.ArrayList;
import java.util.List;

public class Aula {
    int identificador;
    int maxEstudiantes;
    String asignatura;
    Profesor profesor;
    List<Estudiante> estudiantes;

    public Aula(int identificador, int maxEstudiantes, String asignatura) {
        this.identificador = identificador;
        this.maxEstudiantes = maxEstudiantes;
        this.asignatura = asignatura;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public boolean puedeDarClase() {
        // Verificar condiciones para dar clase
        if (profesor != null && profesor.estaDisponible()) {
            int asistieron = 0;

            for (Estudiante estudiante : estudiantes) {
                if (estudiante.asistio) {
                    asistieron++;
                }
            }

            return asistieron > maxEstudiantes * 0.5;
        }

        return false;
    }



   

    public void mostrarAprobados() {
        int aprobadosMasculinos = 0;
        int aprobadosFemeninos = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.calificacion >= 5.0) {
                if (estudiante.sexo == 'M') {
                    aprobadosMasculinos++;
                } else {
                    aprobadosFemeninos++;
                }
            }
        }

        System.out.println("Aprobados masculinos: " + aprobadosMasculinos);
        System.out.println("Aprobados femeninos: " + aprobadosFemeninos);
    }
}
