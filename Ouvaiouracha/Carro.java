public class Carro {
    private float x;
    private float y;
    private Motor motor;//Composição
    private double velocidade;

    public Carro(float x, float y){
        this.x = x;
        this.y = y;
        motor = new Motor(Math.random() * 100);
        velocidade = 0;

    }

    public void acelerar(){
        motor.ligar();
        velocidade += motor.getPotencia()/10;
    }
    public void brecar(){
        motor.desligar();
        velocidade -= 10;
        if(velocidade <0 )velocidade = 0;
    }
    public String toString(){
        return "Carro pos["+x+ ","+y+"]"+ 
        "velcidade:" +velocidade +" "+
        motor.toString();
    }
}
