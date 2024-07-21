public class UsoOperadoresAtribuicao {
    public static void main(String[] args) {
        int numeroCoelhos = 27;
        int numeroExtra = 53;

        numeroCoelhos += 1;
        System.out.println(numeroCoelhos);

        numeroCoelhos +=5;
        System.out.println(numeroCoelhos);

        numeroCoelhos += numeroExtra;
        System.out.println(numeroCoelhos);

        numeroCoelhos *= 2;
        System.out.println(numeroCoelhos);

        System.out.println(numeroCoelhos -= 7);
        System.out.println(numeroCoelhos = 100);

    }
}
