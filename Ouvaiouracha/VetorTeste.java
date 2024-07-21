public class VetorTeste {
    public static void main(String[] args){
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Jose");
        Aluno a3 = new Aluno("danilo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        System.out.println(lista.contem(a1));
        System.out.println(lista.contem(a3)+"Danilo não está no vetor");

        lista.adiciona(a3);

        System.out.println(lista.contem(a3)+"agora danilo está dentro");
        
        Aluno x = lista.pega(1);
        System.out.println(x);

        lista.adiciona(3, a3);
        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);
        
        for(int i = 0; i < 300;i++){
            Aluno y = new Aluno("joão"+i);
            lista.adiciona(y);
        }
        System.out.println(lista);
    }
    
}
