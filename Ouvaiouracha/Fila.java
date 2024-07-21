import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Fila {
    private List<String> alunos = new LinkedList<String>();

    @Override
    public String toString(){
        return alunos.toString();
    }
    public void adiciona(String aluno){
        alunos.add(aluno);
    }

    public String remove(){
        return alunos.remove(0);
    }
    public boolean vazia(){
        return alunos.isEmpty();
    }

    Queue<String> filaDoJava = new LinkedList<String>();
    
}

