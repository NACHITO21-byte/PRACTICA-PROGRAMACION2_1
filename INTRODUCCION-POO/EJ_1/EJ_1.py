class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludar(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def es_mayor_edad(self):
        return self.edad >= 18


persona1 = Persona("Nacho", 20, "La Paz")
persona2 = Persona("Lucía", 17, "Cochabamba")
persona3 = Persona("Mateo", 25, "Santa Cruz")

personas = [persona1, persona2, persona3]

for persona in personas:
    persona.saludar()
    if persona.es_mayor_edad():
        print("Es mayor de edad\n")
    else:
        print("Es menor de edad\n")
