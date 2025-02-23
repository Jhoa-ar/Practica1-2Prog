import math 

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y
        self.r = math.sqrt(self.x**2 + self.y**2)
        self.theta = math.atan2(self.y, self.x)

    def coord_cartesianas(self):
        return (self.x, self.y)

    def coord_polares(self):
        return (self.r, self.theta)
    
    def __str__(self):
        return f"Punto Cartesianas: ({self.x:.2f}, {self.y:.2f}), Polares: ({self.r:.2f}, {self.theta:.2f})"

r1 = Punto(2, 3)
print("Coordenadas Cartesianas =", r1.coord_cartesianas())
print(f"Coordenadas Polares = ({r1.coord_polares()[0]:.2f}, {r1.coord_polares()[1]:.2f})")
print(r1) 