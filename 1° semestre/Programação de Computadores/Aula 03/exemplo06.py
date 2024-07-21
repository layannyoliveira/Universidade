#Desenvolva um programa em Python que 
# solicite ao usuário os valores dos 
# lados de um retângulo e calcule e 
# mostre seu perímetro e sua área.

#entrada de dados - 2 lados do retangulo
largura = float(input('Digite a largura: '))
altura = float(input('Digite a altura: '))
#processamento
perimetro = 2*largura + 2*altura
area = largura*altura
#saida
print('Perímetro = %.2f' %(perimetro))
print('Área = %.2f' %(area))
