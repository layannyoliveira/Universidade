numf = int(input("Qual o ultimo digito da placa do seu carro?"))

if numf == 1 or numf == 2:
    print("Você não pode circular na Segunda-feira")
elif numf == 3 or numf == 4:
    print("Você não pode circular na Terça-feira")
elif numf == 5 or numf == 6:
    print("Você não pode circular na Quarta-feira")
