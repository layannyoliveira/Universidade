import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFramePosIncremento {
    public static void main(String[] args) {
        JFrame meuFrame = new JFrame();
        JLabel meuLabel = new JLabel();
        JPanel meuPanel = new JPanel();


        String numeroCoelhos = "27";
        meuLabel.setText(numeroCoelhos);

        //numeroCoelhos++;
        System.out.println(numeroCoelhos);
        meuFrame.setVisible(true);
        //System.out.println(numeroCoelhos++);
        //System.out.println(numeroCoelhos);

    }
}
