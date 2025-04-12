class Cocinero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        return self.sueldo_mes + self.horas_extra * self.sueldo_hora

    def mostrar_si_sueldo_es(self, x):
        if self.sueldo_mes == x:
            print(f"Cocinero: {self.nombre}, SueldoMes: {self.sueldo_mes}")


class Mesero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora, propina):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self):
        return self.sueldo_mes + self.horas_extra * self.sueldo_hora + self.propina

    def mostrar_si_sueldo_es(self, x):
        if self.sueldo_mes == x:
            print(f"Mesero: {self.nombre}, SueldoMes: {self.sueldo_mes}")


class Administrativo:
    def __init__(self, nombre, sueldo_mes, cargo):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.cargo = cargo

    def sueldo_total(self):
        return self.sueldo_mes

    def mostrar_si_sueldo_es(self, x):
        if self.sueldo_mes == x:
            print(f"Administrativo: {self.nombre}, SueldoMes: {self.sueldo_mes}")


c = Cocinero("Mario", 3000, 10, 20)
m1 = Mesero("Luis", 2500, 5, 15, 200)
m2 = Mesero("Juan", 2500, 8, 12, 150)
a1 = Administrativo("Ana", 3200.0, "Contadora")
a2 = Administrativo("Pepe", 2800.0, "Secretario")

print("Sueldos Totales:")
print(f"{c.nombre}: {c.sueldo_total()}")
print(f"{m1.nombre}: {m1.sueldo_total()}")
print(f"{m2.nombre}: {m2.sueldo_total()}")
print(f"{a1.nombre}: {a1.sueldo_total()}")
print(f"{a2.nombre}: {a2.sueldo_total()}")

print("\nEmpleados con sueldoMes == 2500:")
c.mostrar_si_sueldo_es(2500)
m1.mostrar_si_sueldo_es(2500)
m2.mostrar_si_sueldo_es(2500)
a1.mostrar_si_sueldo_es(2500)
a2.mostrar_si_sueldo_es(2500)
