lista1 = []
lista2 = []
aux = []

#solicita valores das duas listas

for i in range(5):
    lista1.append(int(input('Digite o valor da lista 1:')))

for i in range(5):
    lista2.append(int(input('Digite o valor da segunda lista 2:')))


for vlista2 in lista2:
    for vlista1 in lista1:
        if vlista2 == vlista1:
            aux.append(vlista2)

