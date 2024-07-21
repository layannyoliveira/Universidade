sal = float(input("Qual o seu salário?"))
conta1 = float(input("Qual a primeira conta?"))
conta2 = float(input("Qual a segunda conta?"))
conta3 = float(input("Qual a terceira conta?"))

totalcontas = conta1 + conta2 + conta3

if totalcontas > sal:
    print("Salário insuficiente!")
else:
    resto = (sal - totalcontas)
    print("Depois de pagar as contas você terá ", resto)