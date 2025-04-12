public class Persona {
    String nombre;
    int edad;
    String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Nacho", 20, "La Paz");
        Persona persona2 = new Persona("Lucía", 17, "Cochabamba");
        Persona persona3 = new Persona("Mateo", 25, "Santa Cruz");

        Persona[] personas = {persona1, persona2, persona3};

        for (Persona p : personas) {
            p.saludar();
            if (p.esMayorEdad()) {
                System.out.println("Es mayor de edad\n");
            } else {
                System.out.println("Es menor de edad\n");
            }
        }
    }
}
