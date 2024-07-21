import java.util.Scanner;

public class VerificarSenha {
    public static void main(String[] args) {
        System.out.println("Qual a senha?");
        Scanner keyboard = new Scanner(System.in);
        String senha = keyboard.next();
        System.out.println("Você digitou  >> " + senha +" << ");
        System.out.println();

        if(senha == "swordfish"){
            System.out.println("A palavra digitada está gravada");
            System.out.println("no mesmo lugar que a verdadeira");
            System.out.println("senha. Você tem que ser hacker");
        }else{
            System.out.println("A palavra digitada não está gravada");
            System.out.println("no mesmo lugar que a senha verdadeira");
            System.out.println("mas não tem problema");
        }
        if(senha.equals("swordfish")){
            System.out.println("A palavra digitada tem ");
            System.out.println("os mesmo caracteres que a");
            System.out.println("senha real. Pode usar o sistema");
        }else{
            System.out.println("A palavra digitada não");
            System.out.println("tem os mesmo caracteres que a senha");
            System.out.println("Acesso não permitido");
        }
        keyboard.close();
    }
}
