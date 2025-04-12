class Auto:
    def __init__(self, modelo="Desconocido", placa="SIN-000", color="Gris"):
        self.modelo = modelo
        self.placa = placa
        self.color = color

    def __str__(self):
        return f"Modelo: {self.modelo}, Placa: {self.placa}, Color: {self.color}"

    # Sobrecarga para simular el operador ++ (crear nuevo auto)
    def __add__(self, otro):
        return Auto("NuevoModelo", "NEW-123", "Negro")

    # Sobrecarga para simular el operador -- (mostrar ambos autos)
    def __sub__(self, otro):
        print("=== Auto 1 ===")
        print(self)
        print("=== Auto 2 ===")
        print(otro)

# Instanciar dos autos con constructores distintos
auto1 = Auto("Toyota Corolla", "ABC-123", "Rojo")
auto2 = Auto()  # Por defecto

# Usar operador ++ simulado
auto3 = auto1 + 1  # No importa qué sumes, se ignora

# Usar operador -- simulado
auto1 - auto3  # Muestra ambos autos
