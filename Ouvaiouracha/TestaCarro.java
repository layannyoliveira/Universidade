import java.util.Scanner;

public class TestaCarro {
    
    public static void main(String[] args) {
        Carro c1 = new Carro(10, 20);
        char resp = '';
        Scanner scan = new Scanner(System.in);

        do{

            System.out.println("Digite a para acelerar, b para brecar");
            System.out.println("c para continuar e s para sair");

            resp = scan.next().toLowerCase().charAt(0);.

        }while(resp != 's')

        System.out.println(c1.toString());
        c1.acelerar();
        System.out.println(c1.toString());
    }
}
