notas = list()


for i in range(5):
     n = float(input("Digite  uma nota: "))
     notas.insert(i, n)
print(notas)

indice = int(input("Qual o indice da nota que você deseja alterar?"))

nova = float(input("Digite a nota nova"))

if indice > 0:
    notas.insert(indice, nova)

print(notas)
