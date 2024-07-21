#exemplo
nome = input("digite o seu nome: ")
print("A primeira letra do seu nome é: ",  nome[1])
#quantidade de caracteres
qtdeletras = len(nome)
print("Quantidade e letras: ", qtdeletras)

#upper - Muda para maiusculo
nome = nome.upper()
print(nome)

nome = nome.lower()
print(nome)

idade = int(input("Digite a sua vida: "))
anonasc = 2022 - idade

#astr - converte de numerio para texto
print("quantidade de digitos:", len(str(anonasc)))