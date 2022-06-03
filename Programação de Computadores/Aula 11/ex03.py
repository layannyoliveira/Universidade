#verifica se 
texto = input("Digite um texto: ")
inversa = ""

for letra in texto: 
    print(letra)
    inversa = letra + inversa

print(inversa)

if texto == inversa:
    print("É uma palíndrome")
else:
    print("Não é uma palíndrome")
    