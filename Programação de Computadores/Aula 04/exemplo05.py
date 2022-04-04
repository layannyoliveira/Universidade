#Vamos criar um programa solicite um número real, calcule e que apresente: a) o valor absoluto; b) somente sua parte inteira; c) sua raiz quadrada; d) o fatorial desse número.
import math
#entrada de dados
num = float(input("Digite um valor: "))

#processamento
absoluto = math.fabs(num)
inteiro = math.trunc(num)
raiz = math.sqrt(absoluto)
fatorial = math.factorial(inteiro)

#saida
print("Valor absoluto:", absoluto)
print("Parte inteira:", inteiro)
print("Raiz quadrada:", raiz)
print("Fatorial:", fatorial)
