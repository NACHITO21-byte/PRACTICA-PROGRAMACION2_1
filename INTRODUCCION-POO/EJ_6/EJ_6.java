public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) return a / b;
        return Double.NaN; // Not a Number, cuando hay división por 0
    }

    public double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public String resolverCuadratica(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) return "No hay soluciones reales";

        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        return "x1 = " + x1 + ", x2 = " + x2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(10, 4));
        System.out.println("Multiplicación: " + calc.multiplicar(6, 7));
        System.out.println("División: " + calc.dividir(8, 2));
        System.out.println("Promedio: " + calc.promedio(4, 7, 10));
        System.out.println("Soluciones cuadrática: " + calc.resolverCuadratica(1, -3, 2));
    }
}
