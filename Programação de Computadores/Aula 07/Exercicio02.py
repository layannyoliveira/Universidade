idade = int(input("Qual a sua idade?"))

if idade < 16:
    print("Não eleitor")
elif idade >= 16 and idade <=18:
    print("Eleitor facultativo")
elif idade > 65:
    print("Eleitor facultativo")
else:
    print("Eleitor obrigatorio")
