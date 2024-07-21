public class Temperatura {
    private double numero;
    
    private TempScale escala;

    public Temperatura(){
        numero = 0.0;
        escala = TempScale.FAHRENHEIT;
    }

    public Temperatura(double numero){
        this.numero = numero;
        escala = TempScale.FAHRENHEIT;
    }
    public Temperatura(TempScale escala){
        numero = 0;
        this.escala = escala;
    }
    public Temperatura(double numero, TempScale escala){
        this.numero = numero;
        this.escala = escala;
    }
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public TempScale getEscala() {
        return escala;
    }

    public void setEscala(TempScale escala) {
        this.escala = escala;
    }
}
