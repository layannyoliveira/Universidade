import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um int de 1 a 10:");

        int numeroEntrada = teclado.nextInt();
        int numeroAleatorio = new Random().nextInt(10)+1;
        
        if(numeroEntrada == numeroAleatorio){
            System.out.println("*******");
            System.out.println("Você venceu");
            System.out.println("*******");
            
        }else{
            System.out.println("Você perdeu, o numero aleatorio era "+numeroAleatorio);
        }
        System.out.println("Obrigada por jogar");
        
        //Fechar Scanner
        teclado.close();
    }
}
