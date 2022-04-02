altura = float(input("Qual a sua altura?"))
peso = float(input("Qual o seu peso?"))
imc = peso / (altura*altura)
if imc < 20:
    print("Abaixo do peso")
elif imc >=20 and imc < 25:
    print("Peso Normal")
elif imc >=25 and imc < 30:
    print("Sobrepeso")
elif imc >= 30 and imc < 40:
    print("Obeso")
elif imc >= 40:
    print("Obeso Mórbido")