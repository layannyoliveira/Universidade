import java.util.Scanner;

public class Autenticador2 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        System.out.println("Username:");
        String username = keyboard.next();

        if(username.equals("Bee")){
            System.out.println("Password:");
            String password = keyboard.next();

            if(password.equals("larita")){
                System.out.println("You're in.");
            }else{
                System.out.println("Suspeito, você está errado");
            }
        }else{
            System.out.println("Você esqueu seu proprio usuario? Shame on you");
        }

        keyboard.close();
    }
}
