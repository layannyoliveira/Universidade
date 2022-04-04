#exemplo 02 - conversão de dólar para real

#entrada de dados
cotacao = float(input("Digite o valor da cotação do dólar: "))
dolares = float(input("Digite o valor em dólares: "))

#processamento
valor = dolares*cotacao

#saida
print("Valor equivalente em reais R$ %.2f" %(valor))