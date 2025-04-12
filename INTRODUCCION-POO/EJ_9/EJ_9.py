class Computadora:
    def __init__(self, procesador, ram, almacenamiento):
        self.procesador = procesador
        self.ram = ram
        self.almacenamiento = almacenamiento
        self.encendida = False

    def mostrar_componentes(self):
        print(f"Procesador: {self.procesador}")
        print(f"RAM: {self.ram}")
        print(f"Almacenamiento: {self.almacenamiento}")

    def encender(self):
        if not self.encendida:
            self.encendida = True
            print("Computadora encendida.")
        else:
            print("Ya estaba encendida.")

    def apagar(self):
        if self.encendida:
            self.encendida = False
            print("Computadora apagada.")
        else:
            print("Ya estaba apagada.")

    def estado(self):
        print("Estado:", "Encendida" if self.encendida else "Apagada")


pc = Computadora("Intel i7", "16GB", "1TB SSD")
pc.mostrar_componentes()
pc.estado()
pc.encender()
pc.estado()
pc.apagar()
pc.estado()
