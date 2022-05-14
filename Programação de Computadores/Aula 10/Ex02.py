meses = ["Jan", "Fev", "Mar", "Abr", "Mai", "Jun"]

qtde = []
nomes = list()


for i in range(6):
    valor = int(input("Digite a quantidade a quantidade vendida:"))
    qtde.append(valor)

    nome = input("Digite o nome do vendedor:")
    nomes.append(nome)

for i in range(len(nomes)):
    print("Mês: ", meses[i], " - Quantidade: ", qtde[i], " - vendedor: ", nomes[i])