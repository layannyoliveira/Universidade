h = float(input("Qual a altura da pirâmede?"))
bmenor = float(input("Qual o valor da menor base da pirâmide?"))
bmaior = float(input("Qual o valor da base maior da pirâmide?"))

volume = h / 3 * (bmaior ** 2 + bmenor ** 2 + (bmaior** 2 *bmenor ** 2 )**0.5)

print("O Volume da pirâmide é %.2f" %(volume))