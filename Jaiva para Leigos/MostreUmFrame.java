import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MostreUmFrame {
    public static void main(String[] args) {
        JFrame meuFrame = new JFrame();
        String meuTitulo = "Frame em Branco";
        meuFrame.setTitle(meuTitulo);
        JLabel meuLabel = new JLabel();
        meuLabel.setText("dbdsb nmbv");
        JPanel meuPanel = new JPanel();
        meuPanel.setSize(300, 300);
        meuPanel.add(meuLabel);
        meuFrame.setSize(300, 200);
        meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        meuFrame.add(meuPanel);
        meuFrame.setVisible(true);

    }
}
