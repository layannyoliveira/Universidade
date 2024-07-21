public class UsarTemperatura {
    public static void main(String[] args) {
        final String format = "%5.2f graus %s\n";

        Temperatura temp = new Temperatura();
        temp.setNumero(70.0);
        temp.setEscala(TempScale.FAHRENHEIT);
        System.out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(32.0);
        System.out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(TempScale.CELSIUS);
        System.out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(2.73, TempScale.KELVIN);
        System.out.printf(format, temp.getNumero(), temp.getEscala());

    }
}
