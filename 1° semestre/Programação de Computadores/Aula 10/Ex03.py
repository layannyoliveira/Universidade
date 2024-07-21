

idades = []
somaidades = 0 
qtdeidades = 0
acima = 0 


while True:
    idade = int(input("Digite a idade: "))
    if idade > 0:
        idades.append(idade)
    else:
        break

tamanho = len(idades)

for i in range(tamanho):
    somaidades += idade [i]

media = somaidades / tamanho

for i in range(tamanho):
    if idades[i] > media:
        acima += 1

print(idades)
print("Média: %2.f \n Acima da média" (media, acima))
