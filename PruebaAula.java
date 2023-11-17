public class PruebaAula {
    public static void main(String[] args) {
        // Crear estudiantes y profesor con datos aleatorios
        Estudiante estudiante1 = new Estudiante("Estudiante1", 20, 'M', 8.5);
        Estudiante estudiante2 = new Estudiante("Estudiante2", 21, 'F', 6.0);
        Estudiante estudiante3 = new Estudiante("Estudiante3", 22, 'M', 4.5);

        Profesor profesor = new Profesor("Profesor1", 35, 'M', "Introducción a la Programación");

        // Crear aula e agregar estudiantes
        Aula aula = new Aula(1, 20, "Introducción a la Programación");
        aula.profesor = profesor;
        aula.agregarEstudiante(estudiante1);
        aula.agregarEstudiante(estudiante2);
        aula.agregarEstudiante(estudiante3);

        // Verificar si se puede dar clase
        if (aula.puedeDarClase()) {
            System.out.println("Se puede dar clase en el aula " + aula.identificador);
            aula.mostrarAprobados();
        } else {
            System.out.println("No se puede dar clase en el aula " + aula.identificador);
        }

        // Simular asistencia a clase para los estudiantes
        for (Estudiante estudiante : aula.estudiantes) {
            estudiante.asistirClase();
        }
    }
}
