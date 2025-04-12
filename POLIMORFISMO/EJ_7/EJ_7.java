class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    public void hacerSonido(int veces) {
        for(int i = 0; i < veces; i++) {
            System.out.print("Guau! ");
        }
        System.out.println();
    }

    public void moverse() {
        System.out.println(nombre + " está corriendo alegremente");
    }
}

class Gato {
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }

    public void hacerSonido(int veces) {
        for(int i = 0; i < veces; i++) {
            System.out.print("Miau! ");
        }
        System.out.println();
    }

    public void moverse() {
        System.out.println(nombre + " está saltando silenciosamente");
    }
}

class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }

    public void hacerSonido(int veces) {
        for(int i = 0; i < veces; i++) {
            System.out.print("Pío! ");
        }
        System.out.println();
    }

    public void moverse() {
        System.out.println(nombre + " está volando por el cielo");
    }
}

public class MainAnimales {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Rex", 3, "Labrador");
        Gato miGato = new Gato("Mishi", "Negro");
        Pajaro miPajaro = new Pajaro("Piolín", "Canario");

        miPerro.hacerSonido();
        miPerro.hacerSonido(3);
        miPerro.moverse();

        miGato.hacerSonido();
        miGato.hacerSonido(2);
        miGato.moverse();

        miPajaro.hacerSonido();
        miPajaro.hacerSonido(4);
        miPajaro.moverse();
    }
}