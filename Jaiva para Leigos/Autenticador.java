import javax.swing.JOptionPane;
public class Autenticador {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Nome do "+ "Usuario:");
        String password = JOptionPane.showInputDialog("Senha:");

        if(username != null && password != null &&(
            (username.equals("linda") && password.equals("clark")) ||
            (username.equals("barry")&& password.equals("iris"))))
            { JOptionPane.showMessageDialog(null, "Você está conectado.");
        
        }else{
            JOptionPane.showMessageDialog(null, "Você é suspeito.");
        }
    }
}
