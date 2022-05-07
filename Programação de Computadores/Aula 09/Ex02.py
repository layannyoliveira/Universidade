
contador = 0
contador2 = 0
soma = 0
while True:
    res= input("Acabaram os alunos")
    if res =="s" or res == "S":
        break
    idade = int(input("Qual a sua idade?"))
    if idade >= 16:
        print("pode votar")
        contador = contador +1
    else:
        print("Não é eleitor")
        soma = soma + idade
        contador2 = contador2+1
media=  soma/contador2
print("Os alunos que podem votar são", contador)
print("A média dos alunos qu não votam é", media)


