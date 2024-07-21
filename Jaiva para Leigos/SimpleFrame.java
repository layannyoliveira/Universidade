import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class SimpleFrame extends JFrame {
    
    public SimpleFrame(){ 
        setTitle("Não clique no botão!");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JButton("Panic"));
        setSize(300,100);
        setVisible(true);
        addTexto("Textoooo");
    }
   public void addTexto(String texto){
    JLabel rotulo = new JLabel(texto);

    add(rotulo);
   } 
}
