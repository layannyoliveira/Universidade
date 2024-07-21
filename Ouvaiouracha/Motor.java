public class Motor {
    private float diametro;
    private String cor;
    private float potencia;

    public Motor(float diametro){
        cor = globais.COR_VERMELHA;
        potencia = 0;
        this.diametro = diametro;
        potencia = diametro *10 /3;

    }
    public double getPotencia()

    public void ligar(){

        cor = globais.COR_VERDE;

    }

    public void desligar(){
        cor = globais.COR_VERMELHA;
    }

    public String toString(){
        return 
    }
}
