class Cocinero {
    String nombre;
    int sueldoMes;
    int horasExtra;
    float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    public void mostrarSiSueldoEs(int x) {
        if (sueldoMes == x) {
            System.out.println("Cocinero: " + nombre + ", SueldoMes: " + sueldoMes);
        }
    }
}

class Mesero {
    String nombre;
    int sueldoMes;
    int horasExtra;
    float sueldoHora;
    float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    public void mostrarSiSueldoEs(int x) {
        if (sueldoMes == x) {
            System.out.println("Mesero: " + nombre + ", SueldoMes: " + sueldoMes);
        }
    }
}

class Administrativo {
    String nombre;
    float sueldoMes;
    String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    public void mostrarSiSueldoEs(float x) {
        if (sueldoMes == x) {
            System.out.println("Administrativo: " + nombre + ", SueldoMes: " + sueldoMes);
        }
    }
}

public class Restaurante {
    public static void main(String[] args) {
        Cocinero c = new Cocinero("Mario", 3000, 10, 20);
        Mesero m1 = new Mesero("Luis", 2500, 5, 15, 200);
        Mesero m2 = new Mesero("Juan", 2500, 8, 12, 150);
        Administrativo a1 = new Administrativo("Ana", 3200f, "Contadora");
        Administrativo a2 = new Administrativo("Pepe", 2800f, "Secretario");

        System.out.println("Sueldos Totales:");
        System.out.println(c.nombre + ": " + c.sueldoTotal());
        System.out.println(m1.nombre + ": " + m1.sueldoTotal());
        System.out.println(m2.nombre + ": " + m2.sueldoTotal());
        System.out.println(a1.nombre + ": " + a1.sueldoTotal());
        System.out.println(a2.nombre + ": " + a2.sueldoTotal());

        System.out.println("\nEmpleados con sueldoMes == 2500:");
        c.mostrarSiSueldoEs(2500);
        m1.mostrarSiSueldoEs(2500);
        m2.mostrarSiSueldoEs(2500);
        a1.mostrarSiSueldoEs(2500f);
        a2.mostrarSiSueldoEs(2500f);
    }
}
