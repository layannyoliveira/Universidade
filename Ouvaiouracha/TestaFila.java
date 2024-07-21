public class TestaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Queue filaDoJava = new Queue();

        Queue<String> filaDoJava = new LinkedList<String>();

        fila.adiciona("Ana");
        fila.adiciona("Laura");

        System.out.println(fila);

        String x1 = fila.remove();
        System.out.println(x1);

        System.out.println(fila);

        filaDoJava.add("mauricio");

    }
}
