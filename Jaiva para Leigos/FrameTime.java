import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class FrameTime  extends JFrame{
    public FrameTime() throws IOException{
        Jogador jogador;
        Scanner keyboard = new Scanner(new File("Hankeess.txt"));
        for(int num = 1; num<= 9; num++){ 
            
            jogador = new Jogador(keyboard.nextLine(),keyboard.nextDouble());

            keyboard.nextLine();
            addJogadorInfo(jogador);
        }
        setTitle("Os Hankess");
        setLayout(new GridLayout(9, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    void addJogadorInfo(Jogador jogador){
        add(new JLabel(" "+ jogador.getNome()));
        add(new JLabel(jogador.getMediaString()));
    }
}
