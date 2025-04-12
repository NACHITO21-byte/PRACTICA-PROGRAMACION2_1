class Celular:
    def __init__(self):
        self.aplicaciones_instaladas = 0
        self.espacio_disponible = 1024
        self.bateria = 100
    
    def instalar_aplicacion(self, tamaño):
        if self.aplicaciones_instaladas >= 20:
            print("No hay espacio para más aplicaciones")
            return
        if tamaño > self.espacio_disponible:
            print("No hay suficiente espacio de almacenamiento")
            return
        self.aplicaciones_instaladas += 1
        self.espacio_disponible -= tamaño
        print("Aplicación instalada correctamente")
    
    def usar_aplicacion(self, tamaño, minutos):
        if self.bateria <= 0:
            print("Celular apagado")
            return
        
        if tamaño > 250:
            porcentaje_por_10min = 5
        elif tamaño > 100:
            porcentaje_por_10min = 2
        else:
            porcentaje_por_10min = 1
        
        consumo = (minutos // 10) * porcentaje_por_10min
        self.bateria -= consumo
        
        if self.bateria <= 0:
            self.bateria = 0
            print("Celular apagado")
        else:
            print(f"Aplicación usada. Batería restante: {self.bateria}%")
    
    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria}%")

mi_celular = Celular()

mi_celular.instalar_aplicacion(200)
mi_celular.instalar_aplicacion(50)
mi_celular.instalar_aplicacion(300)

mi_celular.usar_aplicacion(200, 30)
mi_celular.mostrar_bateria()

mi_celular.usar_aplicacion(300, 50)
mi_celular.mostrar_bateria()

mi_celular.usar_aplicacion(50, 100)