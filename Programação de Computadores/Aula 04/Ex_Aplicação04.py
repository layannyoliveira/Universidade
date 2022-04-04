prestaçao = float(input("Qual o valor da prestação?"))
multa = float(input("Qual o valor da multa?"))
dias = int(input("Qual a quantidade de dias de atraso?"))

novaprestação = prestaçao+(prestaçao * (multa/100) * dias)

print("O valor da pretação atualizado é ",novaprestação)