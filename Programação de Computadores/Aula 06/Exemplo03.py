diarias = int(input("Qual a quantidade de diarias? "))
tipo = input("Qual o tipo de diaria? \nS - Simples \nD - Dupla \nT - Tripla \n")

if tipo == 's' or tipo == 'S':
    print("Valor a pagar", (diarias*225.5))

elif tipo == 'd'or tipo == 'D':
    print("Valor a pagar", (diarias*305.5))

elif tipo == 't' or tipo == 'T':
    print("Valor a pagar", (diarias*360.5))

else:
    print("Tipo de hospedagem invalida!")