m = float(input("Qual a sua média? "))
f = int(input("Qual a frequencia? "))

if f < 75:
    print("Reprovado por frequencia")
if m < 6.0:
    print("Reprovado por nota")

else:
    print("Aprovado")