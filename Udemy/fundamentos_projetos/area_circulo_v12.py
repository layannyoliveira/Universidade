# import math
from math import pi
import sys

def circulo(raio):
    return pi * float(raio) ** 2


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Valor do raio não informado")
        print(f"sintaxe: {sys.argv[0]} <raio>")
    else: 
        raio = sys.argv[1]
        area = circulo(raio)
        print("Area do circulo", area)