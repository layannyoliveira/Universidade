package ed.pilha;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.insere("nair");
        System.out.println(pilha);

        pilha.insere("guilherme");
        System.out.println(pilha);

        String p1 = pilha.remove();
        System.out.println(p1);
        System.out.println(pilha);
    }
}
