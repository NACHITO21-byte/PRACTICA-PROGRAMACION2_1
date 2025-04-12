class Estudiante:
    def __init__(self, nombre, nota1, nota2):
        self.nombre = nombre
        self.nota1 = nota1
        self.nota2 = nota2
    
    def calcular_promedio(self):
        return (self.nota1 + self.nota2) / 2
    
    def aprobo(self):
        return self.calcular_promedio() >= 6
    
    def mostrar_resultados(self):
        print(f"{self.nombre}:")
        print(f"  Promedio: {self.calcular_promedio()}")
        print(f"  Estado: {'Aprobado' if self.aprobo() else 'Reprobado'}")

estudiante1 = Estudiante("Juan", 7.5, 8.0)
estudiante2 = Estudiante("María", 5.0, 6.5)
estudiante3 = Estudiante("Pedro", 4.0, 3.5)

estudiante1.mostrar_resultados()
estudiante2.mostrar_resultados()
estudiante3.mostrar_resultados()