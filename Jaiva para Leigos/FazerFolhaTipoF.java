public class FazerFolhaTipoF {
    public static void main(String[] args) {
        EmpregadoPeriodoIntegral piEmpregado = new EmpregadoPeriodoIntegral();

        piEmpregado.setNome("Lay Oli");
        piEmpregado.setCargo("Engenheira de Software");
        piEmpregado.setSalarioSemanal(4000.00);
        piEmpregado.setDeducaoBeneficios(500.00);
        piEmpregado.preencherCheque(piEmpregado.calcValorPagamento());

        System.out.println();

        EmpregadoMeioPeriodo mpEmpregado = new EmpregadoMeioPeriodo();
        mpEmpregado.setNome("Dani Alves");
        mpEmpregado.setCargo("Consultora de Moda");
        mpEmpregado.setTaxaHora(30.00);
        mpEmpregado.preencherCheque(mpEmpregado.calcValorPagamento(50));

        MeioPeriodoHorasEmDobro mpdEmpregado = new MeioPeriodoHorasEmDobro();

        mpdEmpregado.setNome("Betty Lima");
        mpdEmpregado.setCargo("Veterinaria");
        mpdEmpregado.setTaxaHora(57.8);
        mpdEmpregado.preencherCheque(mpdEmpregado.calcValorPagamento(40));
    }
}
