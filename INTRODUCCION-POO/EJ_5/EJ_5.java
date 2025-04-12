class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }
    
    public boolean aprobo() {
        return calcularPromedio() >= 6;
    }
    
    public void mostrarResultados() {
        System.out.println(nombre + ":");
        System.out.println("  Promedio: " + calcularPromedio());
        System.out.println("  Estado: " + (aprobo() ? "Aprobado" : "Reprobado"));
    }
}

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 7.5, 8.0);
        Estudiante estudiante2 = new Estudiante("María", 5.0, 6.5);
        Estudiante estudiante3 = new Estudiante("Pedro", 4.0, 3.5);
        
        estudiante1.mostrarResultados();
        estudiante2.mostrarResultados();
        estudiante3.mostrarResultados();
    }
}