contador = 0
contador2 = 0
contador3 = 0
soma = 0
soma2 = 0
idade = 0
midade = 0
salario = 0
while True:
    idade= int("Informe a idade?")
    if idade < 0:
        break
    soma = soma + idade
    contador = contador + 1
    salario = float(input("Qual o seu salário?"))
    if salario < 600:
        contador2 = contador2 + 1
    if idade >40:
        contador3 = contador3 +1
        soma2 = soma2 + salario

msalario = soma2/contador3       
midade = soma/contador
midade2 = soma2/contador3

print("Media da idade do grupo", midade)
print("Media dos salario dos habitantes com mais 40 anos", msalario)
print("Quantidade de pessoas que recebem menos de 600 reais", contador2)
