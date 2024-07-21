
valor1 = float(input("Qual o primeio valor?"))
valor2 = float(input("Qual o segundo valor?"))
operação = input("Qual a operação?")

if operação == "+":
    res = valor1 + valor2
    print(res)
elif operação == "-":
    res = valor1 - valor2
    print(res)
elif operação == "*":
    res = valor1 * valor2
    print(res)
elif operação == "/":
    res = valor1 / valor2
    print(res)
else:
    print("Operador inválido")
