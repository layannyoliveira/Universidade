public class InstaladorElevador {
    public static void main(String[] args) {
        int pesoDeUmaPessoa;
        int limitePesoElevador;
        int numeroDePessoas;

        pesoDeUmaPessoa = 68;
        limitePesoElevador = 630;
        numeroDePessoas = limitePesoElevador/ pesoDeUmaPessoa;

        System.out.print("Cabem");
        System.out.print(numeroDePessoas);
        System.out.println("Pessoas no elevador.");
    }
}
