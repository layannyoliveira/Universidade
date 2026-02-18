# while True:
#     print("Vai demorar muito")

from random import randint


numero_informado = -1
numero_secreto = randint(0, 9)
count = 0
while numero_informado != numero_secreto:
    count += 1
    numero_informado = int(input("Informe o número secreto: "))

print("Número secreto é {}, parabéns!".format(numero_secreto))
print("Forám necessárias {} tentativas".format(count))  