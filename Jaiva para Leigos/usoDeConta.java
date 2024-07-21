public class usoDeConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Conta suaConta = new Conta();

        minhaConta.setNome("Layanny O.");
        minhaConta.setEndereco("Av. Europa, 1065");
        minhaConta.setSaldo(759000.00);
        suaConta.setNome("Barry Burd");
        suaConta.setEndereco("Av. do Estado, 34");
        suaConta.setSaldo(47.7);

        minhaConta.getDados();
        suaConta.getDados();

        System.out.println(minhaConta.getSaldo());
        
        /* 
        Podemos pegar os todos os dados de uma conta ou apenas um deles com o metodo get; 
        
        */
    }
}
