class Auto {
    String modelo;
    String placa;
    String color;

    // Constructor por defecto
    public Auto() {
        this.modelo = "Desconocido";
        this.placa = "SIN-000";
        this.color = "Gris";
    }

    // Constructor con todos los parámetros
    public Auto(String modelo, String placa, String color) {
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
    }

    public void mostrar() {
        System.out.println("Modelo: " + modelo + ", Placa: " + placa + ", Color: " + color);
    }

    // "Simulamos" ++ como un método que crea un nuevo auto
    public Auto nuevoAuto() {
        return new Auto("NuevoModelo", "NEW-123", "Negro");
    }

    // "Simulamos" -- como un método que muestra atributos de dos autos
    public static void mostrarAmbos(Auto a1, Auto a2) {
        System.out.println("=== Auto 1 ===");
        a1.mostrar();
        System.out.println("=== Auto 2 ===");
        a2.mostrar();
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota Corolla", "ABC-123", "Rojo");
        Auto auto2 = new Auto(); // usando constructor vacío

        Auto auto3 = auto1.nuevoAuto(); // simulamos operador ++

        // simulamos operador --
        Auto.mostrarAmbos(auto1, auto3);
    }
}
