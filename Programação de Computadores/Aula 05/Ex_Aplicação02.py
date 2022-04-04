turno = input("Qual o turno de trabalho?\nN - Noite \nD - Dia \n")
horas = int(input("Quantas horas trabalhadas? \n"))

if turno == "n" or turno == "N":
    sal = (horas * 45)
    print("O seu salário é", sal)
else:
    sal = (horas * 37.50)
    print("O seu salário é", sal)
