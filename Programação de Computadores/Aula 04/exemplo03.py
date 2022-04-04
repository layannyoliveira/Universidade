#exemplo 03 - inverte número com 3 digitos

#entrada de dados
num = int(input("Digite um número com 3 dígitos: "))

#processamento
d1 = num // 100
d2 = num % 100 // 10
d3 = num % 10
inverso = d3*100 + d2*10 + d1

#saida
print("O inverso de", num, " é", inverso) 