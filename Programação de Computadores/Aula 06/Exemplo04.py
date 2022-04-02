n1 = int(input("Qual o primeiro número inteiro?"))
n2 = int(input("Qual o segundo número inteiro?"))
n3 = int(input("Qual o terceiro número inteiro?"))

if n1 > n2 and n1 > n3:
    print("O primeiro número é o maior")
elif n2 > n1 and n2 > n3:
    print("O segundo número é o maior")
elif n3 > n1 and n3 >n2:
    print("O terceiro número é o maior")

