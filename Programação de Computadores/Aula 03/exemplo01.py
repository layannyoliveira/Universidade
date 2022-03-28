#Exemplo de uso de variáveis
#input - comando de entrada (via teclado)
nome = input("Digite o nome do aluno: ")
disciplina = input("Digite o nome da disciplina: ")
nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
#cálculo da média - expressão aritmética
media = (nota1 + nota2)/2
#saída - mostrar os dados
print("Nome do aluno:", nome)
print("Disciplina:", disciplina)
print("Primeira nota: %.2f" %(nota1))
print("Segunda nota: %.2f" %(nota2))
print("Média: %.2f" %(media))