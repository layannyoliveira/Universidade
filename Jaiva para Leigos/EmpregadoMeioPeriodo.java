public class EmpregadoMeioPeriodo extends Empregado{
    private double taxaHora;

    public double getTaxaHora() {
        return taxaHora;
    }

    public void setTaxaHora(double taxaHoraIn) {
        taxaHora = taxaHoraIn;
    }

    public double calcValorPagamento(int horas){
        if(horas <= 40){
            return getTaxaHora()* horas;
        }else{
            int horaExta = horas - 40;
            return getTaxaHora() * 40 + (horaExta *getTaxaHora())*2;
        }
    }
}
