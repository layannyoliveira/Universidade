import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno){
        //Recebe um aluno
        this.garanteEspaco();
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
        
        /*for(int i = 0; i < alunos.length; i++){
            if(alunos[i] ==null){
                alunos[i] = aluno;
                break;
            }
        }*/
    }

   
    public void remove(int posicao){
        // remove pela posição
        for(int i = posicao; i < this.totalDeAlunos; i++){
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeAlunos--;
    }
    
    public boolean contem(Aluno aluno){
        //Descobre se o aluno está ou não na lista
        for(int i = 0; i < totalDeAlunos; i++){
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return totalDeAlunos;
    }

     public String toString() {
        //facilitará na impressão
        return Arrays.toString(alunos);
    } 

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public Aluno pega(int posicao){

        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição invalida");
        }
        return alunos[posicao];
    }

    public void adiciona(int posicao, Aluno aluno){
        
        this.garanteEspaco();

        if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("posicao invalida");
        }
        for(int i = totalDeAlunos - 1; i>= posicao; i -= 1){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
    }
    public boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= totalDeAlunos;
    }

    private void garanteEspaco(){
        if(totalDeAlunos == alunos.length){
            Aluno[] novoArray = new Aluno[alunos.length*2];
            for(int i = 0; i < alunos.length;i++){
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }
    }


}

