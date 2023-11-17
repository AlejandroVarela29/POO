class Jugadores {
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugadores(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }

    public void disparar(Revolvers revolver) {
        System.out.println(this.nombre + " se apunta y dispara...");
        if (revolver.disparar()) {
            System.out.println("¡BANG! " + this.nombre + " ha muerto por baboso.");
            this.vivo = false;
        } else {
            System.out.println("Click. " + this.nombre + " sigue vivo de milagro .");
        }
    }

    public boolean estaVivo() {
        return this.vivo;
    }

    public String getNombre() {
        return this.nombre;
    }
}