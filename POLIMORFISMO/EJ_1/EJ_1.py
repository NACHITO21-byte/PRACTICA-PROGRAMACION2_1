class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="PC", cantidad=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad = cantidad

    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidad}")

    def agregarJugadores(self, num=1):
        self.cantidad += num


juego1 = Videojuego("FIFA 24", "PlayStation", 2)
juego2 = Videojuego("Minecraft")

juego1.agregarJugadores()
juego2.agregarJugadores(4)

juego1.mostrar()
print()
juego2.mostrar()
