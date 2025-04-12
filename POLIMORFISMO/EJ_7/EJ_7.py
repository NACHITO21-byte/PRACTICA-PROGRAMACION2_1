class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza
    
    def hacer_sonido(self, veces=None):
        if veces is None:
            print(f"{self.nombre} dice: ¡Guau guau!")
        else:
            print(f"{self.nombre} dice:", "Guau! " * veces)
    
    def moverse(self):
        print(f"{self.nombre} está corriendo alegremente")

class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color
    
    def hacer_sonido(self, veces=None):
        if veces is None:
            print(f"{self.nombre} dice: ¡Miau miau!")
        else:
            print(f"{self.nombre} dice:", "Miau! " * veces)
    
    def moverse(self):
        print(f"{self.nombre} está saltando silenciosamente")

class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo
    
    def hacer_sonido(self, veces=None):
        if veces is None:
            print(f"{self.nombre} dice: ¡Pío pío!")
        else:
            print(f"{self.nombre} dice:", "Pío! " * veces)
    
    def moverse(self):
        print(f"{self.nombre} está volando por el cielo")

mi_perro = Perro("Rex", 3, "Labrador")
mi_gato = Gato("Mishi", "Negro")
mi_pajaro = Pajaro("Piolín", "Canario")

mi_perro.hacer_sonido()
mi_perro.hacer_sonido(3)
mi_perro.moverse()

mi_gato.hacer_sonido()
mi_gato.hacer_sonido(2)
mi_gato.moverse()

mi_pajaro.hacer_sonido()
mi_pajaro.hacer_sonido(4)
mi_pajaro.moverse()