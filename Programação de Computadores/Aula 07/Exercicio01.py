compra = float(input("Qual o valor da compra?"))
parcelas = int(input("Qual o número de parcelas?"))

if parcelas == 2:
    comprajuros = (compra *1.03)/2
    print("O valor da sua compra com juros é" % comprajuros)
elif parcelas == 4:
    comprajuros = (compra *1.07)/4
    print("O valor da sua compra com juros é" % comprajuros)
elif parcelas == 6:
    comprajuros = (compra *1.09)/6
    print("O valor da sua compra com juros é %.2f reais" % comprajuros)
elif parcelas == 8:
    comprajuros = (compra *1.12)/8
    print("O valor da sua parcela com juros é %.2f reais" % comprajuros)
else:
    print("Número de parcelas inválido")