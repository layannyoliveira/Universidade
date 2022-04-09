salbase = float(input("Qual o salário base?"))
tempo =int(input("Qual o tempo de serviço"))

if salbase > 1500:
    if tempo <= 3:
        salmaior = salbase + 200
        print(salmaior)
    else:
        salmaior = salbase + 300
        print(salmaior)
elif salbase < 1500:

    if tempo <= 3:
        salmaior = salbase + 230
        print(salmaior)
    elif tempo > 3 and tempo < 6:
        salmaior = salbase + 330 
        print(salmaior)
    else:
        salmaior = salbase + 350
        print(salmaior)
