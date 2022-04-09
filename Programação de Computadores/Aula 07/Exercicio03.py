valorcompra = float(input("Qual o valor da compra?"))
nomeproduto = input("Qual o nome do produto")

if valorcompra < 10:
    valorvenda = valorcompra * 1.70
    print("Produto:", nomeproduto, "\nValor da compra:", valorcompra,"\nValor da venda:", valorvenda )
elif valorcompra < 30:
    valorvenda = valorcompra * 1.5
    print("Produto:", nomeproduto, "\nValor da compra:", valorcompra,"\nValor da venda:", valorvenda )
elif valorcompra < 50:
    valorvenda = valorcompra * 1.4
    print("Produto:", nomeproduto, "\nValor da compra:", valorcompra,"\nValor da venda:", valorvenda )
else:
    valorvenda = valorcompra * 1.3
    print("Produto:", nomeproduto, "\nValor da compra:", valorcompra,"\nValor da venda:", valorvenda )
