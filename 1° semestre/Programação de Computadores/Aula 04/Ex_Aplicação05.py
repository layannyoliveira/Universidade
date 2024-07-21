import math

num = float(input("Qual o grau do ângulo? \n"))

radiando = math.radians(num)
seno = math.sin(radiando)
cos = math.cos(radiando)
tan = math.tan(radiando)

print("O radiando é ", radiando)
print("O seno é ", seno)
print("O cosseno é ", cos)
print("O tangente é ", tan)