public class Videojuego {
    String nombre;
    String plataforma;
    int cantidad;

    // Constructor 1
    public Videojuego(String nombre, String plataforma, int cantidad) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidad = cantidad;
    }

    // Constructor 2
    public Videojuego(String nombre, String plataforma) {
        this(nombre, plataforma, 1);
    }

    // Constructor 3
    public Videojuego(String nombre) {
        this(nombre, "PC", 1);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidad);
    }

    public void agregarJugadores() {
        cantidad += 1;
    }

    public void agregarJugadores(int num) {
        cantidad += num;
    }

    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("FIFA 24", "PlayStation", 2);
        Videojuego juego2 = new Videojuego("Minecraft");

        juego1.agregarJugadores();
        juego2.agregarJugadores(4);

        juego1.mostrar();
        System.out.println();
        juego2.mostrar();
    }
}
