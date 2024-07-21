#Escreva um programa em Python que 
# solicite ao usuário o salário atual 
# e mostre o 
# salário acrescido de 5% de comissão

#entrada de dados
salario = float(input('Digite o salário: '))
#processamento
salario = salario+salario*5/100
#saída
print('O salário atualizado é: ' , salario)