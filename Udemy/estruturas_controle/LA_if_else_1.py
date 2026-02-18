import sys

def calc_situacao(valor):
    if valor > 10:
        return "Nota invalida"
    elif valor >= 9.1 and valor <= 10:
        return "A"
    elif valor >= 8.1 and valor <= 9:
        return "A-"
    elif valor >= 7.1 and valor <= 8:
        return "B"
    elif valor >= 6.1 and valor <= 7:
        return "B-"
    elif valor >= 5.1 and valor <= 6:
        return "C"
    elif valor >=4.1 and valor <= 5:
        return "C-"
    elif valor > 3.1 and valor <= 4:
        return "D"
    elif valor >= 2.1 and valor <= 3:
        return "D-"
    elif valor >= 1.1 and valor <= 2:
        return "E"
    elif valor >= 0 and valor <= 1:
        return "E-"
    else:
        return "Valor invalido"

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Valor não informado")
    else:
        print("Situação:", calc_situacao(float(sys.argv[1]))) 