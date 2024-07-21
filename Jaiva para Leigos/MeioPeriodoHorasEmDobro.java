public class MeioPeriodoHorasEmDobro extends EmpregadoMeioPeriodo{
    
    @Override
    public double calcValorPagamento(int horas){
        if(horas <= 40){
            return getTaxaHora() * horas;
        }else{
            int horaExta = horas - 40;
            return getTaxaHora() * 40 + (horaExta *getTaxaHora())*2;
        }
    }
    
}
