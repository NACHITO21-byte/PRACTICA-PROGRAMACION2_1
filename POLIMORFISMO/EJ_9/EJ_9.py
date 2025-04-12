class Bloque:
    def __init__(self):
        self.tipo = "Bloque genérico"
    
    def accion(self):
        print("Realizando acción genérica de bloque")
    
    def colocar(self, orientacion="suelo"):
        print(f"Colocando bloque en el {orientacion}")
    
    def romper(self):
        print("Rompiendo bloque genérico")

class BloqueCofre(Bloque):
    def __init__(self, capacidad, resistencia):
        super().__init__()
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = "Cofre"
    
    def accion(self):
        print(f"Abriendo cofre de {self.capacidad} slots")
    
    def romper(self):
        print("Rompiendo cofre... ¡Cuidado con los items que caen!")

class BloqueTnt(Bloque):
    def __init__(self, tipo_explosivo, danio):
        super().__init__()
        self.tipo_explosivo = tipo_explosivo
        self.danio = danio
        self.tipo = "TNT"
    
    def accion(self):
        print(f"¡La TNT de tipo {self.tipo_explosivo} está a punto de explotar!")
    
    def romper(self):
        print(f"¡BOOM! La TNT explotó causando {self.danio} de daño")

class BloqueHorno(Bloque):
    def __init__(self, color, capacidad_comida):
        super().__init__()
        self.color = color
        self.capacidad_comida = capacidad_comida
        self.tipo = "Horno"
    
    def accion(self):
        print(f"Cocinando comida en el horno {self.color}")
    
    def romper(self):
        print("Rompiendo horno... ¡Recuerda recoger la comida cocinada!")

# Instanciación de bloques
cofre_madera = BloqueCofre(27, 10)
cofre_ender = BloqueCofre(54, 30)

tnt_normal = BloqueTnt("Normal", 10)
tnt_super = BloqueTnt("Super", 20)

horno_piedra = BloqueHorno("Gris", 3)
horno_nether = BloqueHorno("Negro", 5)

# Ejemplos de uso
cofre_madera.accion()
cofre_madera.colocar()
cofre_madera.romper()

tnt_normal.accion()
tnt_normal.colocar("pared")
tnt_normal.romper()

horno_piedra.accion()
horno_piedra.colocar("techo")
horno_piedra.romper()