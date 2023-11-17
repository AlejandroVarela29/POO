import java.util.Random;
public class Profesor extends Persona {
    String asignatura;

    public Profesor(String nombre, int edad, char sexo, String asignatura) {
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
    }

    public boolean estaDisponible() {
        // Implementar lógica de disponibilidad del profesor
        return new Random().nextDouble() > 0.1;
    }
}