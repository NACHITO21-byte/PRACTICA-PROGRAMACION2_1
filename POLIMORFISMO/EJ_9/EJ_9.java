class Bloque {
    protected String tipo;
    
    public void accion() {
        System.out.println("Realizando acción genérica de bloque");
    }
    
    public void colocar() {
        System.out.println("Colocando bloque en el suelo");
    }
    
    public void colocar(String orientacion) {
        System.out.println("Colocando bloque en la " + orientacion);
    }
    
    public void romper() {
        System.out.println("Rompiendo bloque genérico");
    }
}

class BloqueCofre extends Bloque {
    private int capacidad;
    private int resistencia;
    
    public BloqueCofre(int capacidad, int resistencia) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = "Cofre";
    }
    
    @Override
    public void accion() {
        System.out.println("Abriendo cofre de " + capacidad + " slots");
    }
    
    @Override
    public void romper() {
        System.out.println("Rompiendo cofre... ¡Cuidado con los items que caen!");
    }
}

class BloqueTnt extends Bloque {
    private String tipoExplosivo;
    private int danio;
    
    public BloqueTnt(String tipoExplosivo, int danio) {
        this.tipoExplosivo = tipoExplosivo;
        this.danio = danio;
        this.tipo = "TNT";
    }
    
    @Override
    public void accion() {
        System.out.println("¡La TNT de tipo " + tipoExplosivo + " está a punto de explotar!");
    }
    
    @Override
    public void romper() {
        System.out.println("¡BOOM! La TNT explotó causando " + danio + " de daño");
    }
}

class BloqueHorno extends Bloque {
    private String color;
    private int capacidadComida;
    
    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
        this.tipo = "Horno";
    }
    
    @Override
    public void accion() {
        System.out.println("Cocinando comida en el horno " + color);
    }
    
    @Override
    public void romper() {
        System.out.println("Rompiendo horno... ¡Recuerda recoger la comida cocinada!");
    }
}

public class Minecraft {
    public static void main(String[] args) {
        BloqueCofre cofreMadera = new BloqueCofre(27, 10);
        BloqueCofre cofreEnder = new BloqueCofre(54, 30);
        
        BloqueTnt tntNormal = new BloqueTnt("Normal", 10);
        BloqueTnt tntSuper = new BloqueTnt("Super", 20);
        
        BloqueHorno hornoPiedra = new BloqueHorno("Gris", 3);
        BloqueHorno hornoNether = new BloqueHorno("Negro", 5);
        
        cofreMadera.accion();
        cofreMadera.colocar();
        cofreMadera.romper();
        
        tntNormal.accion();
        tntNormal.colocar("pared");
        tntNormal.romper();
        
        hornoPiedra.accion();
        hornoPiedra.colocar("techo");
        hornoPiedra.romper();
    }
}