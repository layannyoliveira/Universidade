import java.util.Scanner;
import java.util.Random;

public class AdivinheNovamente {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numPalpite = 0;
        int numeroAleatorio = new Random().nextInt(10)+1;

        System.out.println("**********");
        System.out.println("Bem vindo ao jogo de adivinhação");

        System.out.println("Insira um numero de 1 a 10");
        int numeroEntrada = read.nextInt();
        numPalpite++;
        while(numeroEntrada != numeroAleatorio){
            System.out.println("Tente Novamente");
            System.out.println("Insira um número de 1 a 10");
            numeroEntrada = read.nextInt();
            numPalpite++;
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        System.out.println("Você ganhou depois de "+numPalpite);
        read.close();
    }
}
