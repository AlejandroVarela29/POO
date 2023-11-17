import java.util.Random;

public class Estudiante extends Humano {
    double calificacion;
    public boolean asistio;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }

    public void asistirClase() {
        // Implementar lógica de asistencia a clases
        asistio = new Random().nextBoolean();
        System.out.println(nombre + (asistio ? " asistio" : " no asistio") + " a clase.");
    }
}

