public class TemperaturaAgradavel extends Temperatura{
    public TemperaturaAgradavel(){
        super();
    }
    public TemperaturaAgradavel(double numero){
        super(numero);
    }
    public TemperaturaAgradavel(TempScale escala){
        super(escala);
    }
    public TemperaturaAgradavel(double numero, TempScale escala){
        super(numero, escala);
    }
    public void display(){
        System.out.printf("%5.2f graus %s\n", getNumero(), getEscala());
    }
}
