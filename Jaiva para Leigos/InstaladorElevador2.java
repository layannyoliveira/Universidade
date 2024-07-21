public class InstaladorElevador2 {
    public static void main(String[] args) {
        System.out.println("Vedrdadeiro ou Falso?");
        System.out.println("Você pode colocar os dez");
        System.out.println("Jurados do concurso");
        System.out.println("no elevador");
        System.out.println();

        int pesoDeUmaPessoa = 68;
        int limitePesoElevador = 630;
        int numeroDePessoas = limitePesoElevador / pesoDeUmaPessoa;

        boolean todosDezOK = numeroDePessoas >=10;
        System.out.println(todosDezOK);
    }
}
