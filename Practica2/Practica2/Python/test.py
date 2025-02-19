import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return f"({self.x}, {self.y})"

    def __str__(self):
        return f"Punto{self.coord_cartesianas()}"

class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea de {self.p1} a {self.p2}"

    def dibujaLinea(self):
        plt.figure(figsize=(5, 5))
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], 'bo-', label="Línea")
        plt.xlim(-100, 100)
        plt.ylim(-100, 100)
        plt.axhline(0, color='black', linewidth=0.5)
        plt.axvline(0, color='black', linewidth=0.5)
        plt.grid(True)
        plt.legend()
        plt.show()

class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"

    def dibujaCirculo(self):
        fig, ax = plt.subplots(figsize=(5, 5))
        circle = plt.Circle((self.centro.x, self.centro.y), self.radio, color='r', fill=False)
        ax.add_patch(circle)
        plt.xlim(self.centro.x - self.radio - 10, self.centro.x + self.radio + 10)
        plt.ylim(self.centro.y - self.radio - 10, self.centro.y + self.radio + 10)
        plt.axhline(0, color='black', linewidth=0.5)
        plt.axvline(0, color='black', linewidth=0.5)
        plt.grid(True)
        plt.gca().set_aspect('equal', adjustable='box')
        plt.show()

# Entrada de datos
x1, y1 = map(float, input("Ingrese las coordenadas del primer punto de la línea (x1 y1): ").split())
x2, y2 = map(float, input("Ingrese las coordenadas del segundo punto de la línea (x2 y2): ").split())

linea = Linea(Punto(x1, y1), Punto(x2, y2))
print(linea)
linea.dibujaLinea()

xc, yc = map(float, input("Ingrese las coordenadas del centro del círculo (x y): ").split())
radio = float(input("Ingrese el radio del círculo: "))

circulo = Circulo(Punto(xc, yc), radio)
print(circulo)
circulo.dibujaCirculo()
