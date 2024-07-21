import static java.lang.System.out;
public class Troco {
    public static void main(String[] args) {
        int total = 248;
        int quartos = total / 25;
        int oqueSobra = total % 25;
        int dezcentavos = oqueSobra / 10;
        oqueSobra = oqueSobra % 10;

        int cincocentavos = oqueSobra / 5;
        oqueSobra = oqueSobra % 5;

        int centavos = oqueSobra;

        out.println("De "+total+" Centavos obtidos");
        out.println(quartos+" Quartos");
        out.println(dezcentavos+" dezcentavos");
        out.println(cincocentavos + " cincocentavos");
        out.println(centavos +" centavos");
    }
}
