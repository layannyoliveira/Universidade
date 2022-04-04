compra = float(input("Qual o valor da compra?"))

if compra > 200:
    comprades = (compra * 0.80)
    print("O valor da sua compra com desconto é ", comprades)
else:
    print("Você não tem direito a um desconto, sua não atingiu R$ 200,00")