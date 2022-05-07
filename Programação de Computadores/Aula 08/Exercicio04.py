lista = int(input("Quantos elementos tem na lista?"))
lista01=[]

while lista > 0:
    num = float(input("Digite um numero"))
    lista01.append(num)
    lista = lista -1 
print("Negativos: ")

for num in lista01:
    if num < 0:
        print(num)
print('Positivos:')

for num in lista01:
    if num > 0:
        print(num)

menor = min(lista01)
maior = max(lista01)

print("o maior numero é:", maior)
print("o menor numero é:", menor)