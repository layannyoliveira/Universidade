a = float(input("Qual o valor de A? "))
b = float(input("Qual o valor de B? "))
c = float(input("Qual o valor de C? "))

delta = (b**2 - 4*a*c)

raiz1 = (- b + delta ** (1/2)) / (2*a)
raiz2 = (- b - delta ** (1/2)) / (2*a)

print("Valor da primeira raiz", raiz1, "O valor da segunda raiz é", raiz2)