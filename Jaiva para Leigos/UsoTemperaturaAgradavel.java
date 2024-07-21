public class UsoTemperaturaAgradavel {
    public static void main(String[] args) {
        TemperaturaAgradavel temp = new TemperaturaAgradavel();

        temp.setNumero(70.0);
        temp.setEscala(TempScale.FAHRENHEIT);
        temp.display();

        temp = new TemperaturaAgradavel(32.0);
        temp.display();

        temp = new TemperaturaAgradavel(TempScale.CELSIUS);
        temp.display();

        temp = new TemperaturaAgradavel(2.73, TempScale.KELVIN);
        temp.display();
    }
}
