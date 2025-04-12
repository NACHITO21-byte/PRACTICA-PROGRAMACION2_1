import math

class Calculadora:
    def sumar(self, a, b):
        return a + b

    def restar(self, a, b):
        return a - b

    def multiplicar(self, a, b):
        return a * b

    def dividir(self, a, b):
        if b != 0:
            return a / b
        return "No se puede dividir por cero"

    def promedio(self, a, b, c):
        return (a + b + c) / 3

    def resolver_cuadratica(self, a, b, c):
        discriminante = b**2 - 4*a*c
        if discriminante < 0:
            return "No hay soluciones reales"
        x1 = (-b + math.sqrt(discriminante)) / (2*a)
        x2 = (-b - math.sqrt(discriminante)) / (2*a)
        return (x1, x2)


calc = Calculadora()

print("Suma:", calc.sumar(5, 3))
print("Resta:", calc.restar(10, 4))
print("Multiplicación:", calc.multiplicar(6, 7))
print("División:", calc.dividir(8, 2))
print("Promedio:", calc.promedio(4, 7, 10))
print("Soluciones cuadrática:", calc.resolver_cuadratica(1, -3, 2))
