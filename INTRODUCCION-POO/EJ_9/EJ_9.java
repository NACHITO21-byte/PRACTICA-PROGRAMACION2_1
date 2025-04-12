public class Computadora {
    String procesador;
    String ram;
    String almacenamiento;
    boolean encendida;

    public Computadora(String procesador, String ram, String almacenamiento) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.encendida = false;
    }

    public void mostrarComponentes() {
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram);
        System.out.println("Almacenamiento: " + almacenamiento);
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Computadora encendida.");
        } else {
            System.out.println("Ya estaba encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Computadora apagada.");
        } else {
            System.out.println("Ya estaba apagada.");
        }
    }

    public void estado() {
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }

    public static void main(String[] args) {
        Computadora pc = new Computadora("Intel i7", "16GB", "1TB SSD");
        pc.mostrarComponentes();
        pc.estado();
        pc.encender();
        pc.estado();
        pc.apagar();
        pc.estado();
    }
}
