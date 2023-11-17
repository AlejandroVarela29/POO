package ejercicio5;
import java.util.ArrayList;
class Juegos {
    private ArrayList<Jugadores> jugadores;
    private Revolvers revolver;

    public Juegos(int numJugadores) {
        jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugadores(i));
        }
        revolver = new Revolvers();
    }

    public boolean finJuego() {
        for (Jugadores jugador : jugadores) {
            if (!jugador.estaVivo()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (Jugadores jugador : jugadores) {
            if (jugador.estaVivo()) {
                jugador.disparar(revolver);
                revolver.siguienteBala();
                if (finJuego()) {
                    return;
                }
            }
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado actual(en convo la vdd) del juego:");
        for (Jugadores jugador : jugadores) {
            if (jugador.estaVivo()) {
                System.out.println(jugador.getNombre() + " esta vivo por la gracia divina");
            } else {
                System.out.println(jugador.getNombre() + " ha muerto y ya no podra volver a ver a su familia de nuevo ");
            }
        }
    }
}