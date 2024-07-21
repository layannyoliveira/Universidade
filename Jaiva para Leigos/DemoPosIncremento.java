import javax.swing.JFrame;

public class DemoPosIncremento {
    public static void main(String[] args) {
        JFrame meuFrame = new JFrame();
        int numeroCoelhos = 27;

        numeroCoelhos++;
        System.out.println(numeroCoelhos);
        meuFrame.setVisible(true);
        System.out.println(numeroCoelhos++);
        System.out.println(numeroCoelhos);

    }
}
