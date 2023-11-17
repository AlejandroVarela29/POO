
import java.util.Scanner;
public class JuegoRuletaRusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numJugadores;
        
        System.out.print("Ingrese el numero de jugadores (entre 1 y 6): ");
         numJugadores = scanner.nextInt();
        

        Juegos juego = new Juegos(numJugadores);

        while (!juego.finJuego()) {
            juego.ronda();
            juego.mostrarEstado();
        }

        System.out.println("¡Juego terminado!");
        scanner.close();
    }
}
