import java.util.Scanner;
import java.io.File;


public class DeletarProva {
    public static void main(String[] args) {
        File prova = new File("LivrosAdulterados.txt");
        Scanner read = new Scanner(System.in);

        char reply;

        do{
            System.out.println("Deletar prova? S ou N");
            reply = read.findWithinHorizon(".", 0).charAt(0);
            

        }while(reply != 's' && reply != 'n' && reply != 'S' && reply !='N');
        if(reply == 's'){
            System.out.println("Ok, aqui vai...");
            prova.delete();
            System.out.println("Prova deletada");
        }else{
            System.out.println("Entendi, nada de deletar a prova");
        }
     read.close();
        //PG 133 
    }
}
