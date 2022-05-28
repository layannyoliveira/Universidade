#lista de lugares
lugaresvagos = [10,5,6,8,0]
for i in range(len(lugaresvagos)):
    print("Sala: ", (i+1), " - ", lugaresvagos[i], "lugar(es)")

#entrada de dados
while True:
    sala = int(input("Escolha uma sala (0 - sair):"))
    if sala== 0:
        print("Até logo")
        break #para a estrutura de repetição
    elif sala < 0 or sala > len(lugaresvagos):
        print("Sala inaválida")
    #verifica se a sala tem vaga
    elif lugaresvagos[sala-1] == 0:
        print("Sala sem lugar disponível")
    else:
        #solicitar a qtde de ingressos
        compra = int(input("Digite a qtde de ingressos"))
        #verifica a qtde de ingressos está disponível para sala escolhida
        if compra > lugaresvagos[sala-1]:
            print("Número de ingressos inválido")
        else:
            #atualiza a qtde de ingressos da sala
            lugaresvagos[sala-1] -= compra
            #lugaresvagos[sala-1]
    for i in range(len(lugaresvagos)):
        print("Sala: ", (i+1), " - ", lugaresvagos[i], "lugar(es)")