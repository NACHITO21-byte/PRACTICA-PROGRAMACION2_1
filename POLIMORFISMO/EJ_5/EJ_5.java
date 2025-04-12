class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;
    
    public Oficina(int sillas, int escritorios, int estanterias) {
        this.nroSillas = sillas;
        this.nroEscritorios = escritorios;
        this.nroEstanterias = estanterias;
    }
    
    public void mostrar() {
        System.out.println("Oficina:");
        System.out.println("  Sillas: " + nroSillas);
        System.out.println("  Escritorios: " + nroEscritorios);
        System.out.println("  Estanterías: " + nroEstanterias);
    }
    
    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
    
    public int cantidadMuebles(String tipo) {
        switch(tipo.toLowerCase()) {
            case "sillas": return nroSillas;
            case "escritorios": return nroEscritorios;
            case "estanterias": return nroEstanterias;
            default: return 0;
        }
    }
}

class Aula {
    private String nombre;
    private int capacidad;
    private int nroPupitres;
    
    public Aula(String nombre, int capacidad, int pupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = pupitres;
    }
    
    public void mostrar() {
        System.out.println("Aula " + nombre + ":");
        System.out.println("  Capacidad: " + capacidad);
        System.out.println("  Pupitres: " + nroPupitres);
    }
    
    public int cantidadMuebles() {
        return nroPupitres;
    }
    
    public int cantidadMuebles(String tipo) {
        return tipo.equalsIgnoreCase("pupitres") ? nroPupitres : 0;
    }
}

class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;
    
    public Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = mesas;
        this.nroSillas = sillas;
    }
    
    public void mostrar() {
        System.out.println("Laboratorio " + nombre + ":");
        System.out.println("  Capacidad: " + capacidad);
        System.out.println("  Mesas: " + nroMesas);
        System.out.println("  Sillas: " + nroSillas);
    }
    
    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }
    
    public int cantidadMuebles(String tipo) {
        switch(tipo.toLowerCase()) {
            case "mesas": return nroMesas;
            case "sillas": return nroSillas;
            default: return 0;
        }
    }
}

public class MainAmbientes {
    public static void main(String[] args) {
        Oficina oficina1 = new Oficina(5, 3, 2);
        Oficina oficina2 = new Oficina(8, 4, 3);
        
        Aula aula1 = new Aula("A-101", 30, 25);
        Aula aula2 = new Aula("B-205", 40, 35);
        
        Laboratorio lab1 = new Laboratorio("Química", 20, 10, 20);
        
        oficina1.mostrar();
        System.out.println("Total muebles: " + oficina1.cantidadMuebles());
        System.out.println("Sillas: " + oficina1.cantidadMuebles("sillas"));
        
        aula1.mostrar();
        System.out.println("Total muebles: " + aula1.cantidadMuebles());
        
        lab1.mostrar();
        System.out.println("Total muebles: " + lab1.cantidadMuebles());
        System.out.println("Mesas: " + lab1.cantidadMuebles("mesas"));
    }
}