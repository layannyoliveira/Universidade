public class EmpregadoPeriodoIntegral extends Empregado{
    private double salarioSemanal;
    private double deducaoBeneficios;

    public double getSalarioSemanal() {
        return salarioSemanal;
    }
    public void setSalarioSemanal(double salarioSemanalIN) {
        salarioSemanal = salarioSemanalIN;
    }
    public double getDeducaoBeneficios() {
        return deducaoBeneficios;

    }
    public void setDeducaoBeneficios(double deducaoBeneficiosIN) {
        deducaoBeneficios = deducaoBeneficiosIN;
    }
    public double calcValorPagamento(){
        return salarioSemanal -deducaoBeneficios;
    }
}
