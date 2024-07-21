valores = list()
par =[]
impar = []

while True:
    n = int(input('Digite um número:'))
    valores.append(n)
    resp = input('Deseja digitar novo número?(s/n)')
    if resp.upper() != 'S':
        break

#separar os valores pares e ímpares
for i in range(len(valores)):
    if valores[i] % 2 == 0:
        par.append(valores[2])
    else:
        impar.append(valores[i])
print(valores)
print(par)