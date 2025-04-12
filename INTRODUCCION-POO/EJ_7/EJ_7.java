class Celular {
    private int aplicacionesInstaladas;
    private int espacioDisponible;
    private int bateria;
    
    public Celular() {
        this.aplicacionesInstaladas = 0;
        this.espacioDisponible = 1024;
        this.bateria = 100;
    }
    
    public void instalarAplicacion(int tamaño) {
        if (aplicacionesInstaladas >= 20) {
            System.out.println("No hay espacio para más aplicaciones");
            return;
        }
        if (tamaño > espacioDisponible) {
            System.out.println("No hay suficiente espacio de almacenamiento");
            return;
        }
        aplicacionesInstaladas++;
        espacioDisponible -= tamaño;
        System.out.println("Aplicación instalada correctamente");
    }
    
    public void usarAplicacion(int tamaño, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado");
            return;
        }
        
        int porcentajePor10Min;
        if (tamaño > 250) {
            porcentajePor10Min = 5;
        } else if (tamaño > 100) {
            porcentajePor10Min = 2;
        } else {
            porcentajePor10Min = 1;
        }
        
        int consumo = (minutos / 10) * porcentajePor10Min;
        bateria -= consumo;
        
        if (bateria <= 0) {
            bateria = 0;
            System.out.println("Celular apagado");
        } else {
            System.out.println("Aplicación usada. Batería restante: " + bateria + "%");
        }
    }
    
    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%");
    }
}

public class MainCelular {
    public static void main(String[] args) {
        Celular miCelular = new Celular();
        
        miCelular.instalarAplicacion(200);
        miCelular.instalarAplicacion(50);
        miCelular.instalarAplicacion(300);
        
        miCelular.usarAplicacion(200, 30);
        miCelular.mostrarBateria();
        
        miCelular.usarAplicacion(300, 50);
        miCelular.mostrarBateria();
        
        miCelular.usarAplicacion(50, 100);
    }
}