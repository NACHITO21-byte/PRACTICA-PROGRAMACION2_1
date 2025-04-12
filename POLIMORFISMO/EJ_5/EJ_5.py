class Oficina:
    def __init__(self, sillas, escritorios, estanterias):
        self.nroSillas = sillas
        self.nroEscritorios = escritorios
        self.nroEstanterias = estanterias
    
    def mostrar(self):
        print("Oficina:")
        print(f"  Sillas: {self.nroSillas}")
        print(f"  Escritorios: {self.nroEscritorios}")
        print(f"  Estanterías: {self.nroEstanterias}")
    
    def cantidad_muebles(self, tipo=None):
        if tipo is None:
            return self.nroSillas + self.nroEscritorios + self.nroEstanterias
        tipo = tipo.lower()
        if tipo == "sillas":
            return self.nroSillas
        elif tipo == "escritorios":
            return self.nroEscritorios
        elif tipo == "estanterias":
            return self.nroEstanterias
        return 0

class Aula:
    def __init__(self, nombre, capacidad, pupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroPupitres = pupitres
    
    def mostrar(self):
        print(f"Aula {self.nombre}:")
        print(f"  Capacidad: {self.capacidad}")
        print(f"  Pupitres: {self.nroPupitres}")
    
    def cantidad_muebles(self, tipo=None):
        if tipo is None:
            return self.nroPupitres
        return self.nroPupitres if tipo.lower() == "pupitres" else 0

class Laboratorio:
    def __init__(self, nombre, capacidad, mesas, sillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = mesas
        self.nroSillas = sillas
    
    def mostrar(self):
        print(f"Laboratorio {self.nombre}:")
        print(f"  Capacidad: {self.capacidad}")
        print(f"  Mesas: {self.nroMesas}")
        print(f"  Sillas: {self.nroSillas}")
    
    def cantidad_muebles(self, tipo=None):
        if tipo is None:
            return self.nroMesas + self.nroSillas
        tipo = tipo.lower()
        if tipo == "mesas":
            return self.nroMesas
        elif tipo == "sillas":
            return self.nroSillas
        return 0

oficina1 = Oficina(5, 3, 2)
oficina2 = Oficina(8, 4, 3)

aula1 = Aula("A-101", 30, 25)
aula2 = Aula("B-205", 40, 35)

lab1 = Laboratorio("Química", 20, 10, 20)

oficina1.mostrar()
print(f"Total muebles: {oficina1.cantidad_muebles()}")
print(f"Sillas: {oficina1.cantidad_muebles('sillas')}")

aula1.mostrar()
print(f"Total muebles: {aula1.cantidad_muebles()}")

lab1.mostrar()
print(f"Total muebles: {lab1.cantidad_muebles()}")
print(f"Mesas: {lab1.cantidad_muebles('mesas')}")