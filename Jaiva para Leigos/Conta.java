public class Conta {
    private String nome;
    private String endereco;
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNome(String n){
        nome = n;
        
    }
    public String getNome() {
        return nome;
    }
    public void setEndereco(String e){
        endereco = e;
    }
    public String getEndereco(){
        return endereco;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void getDados(){
        System.out.println("--- Dados da Conta ---");
        System.out.println(getNome());
        System.out.println(getEndereco());
        System.out.println(getSaldo());
        System.out.println("----------------");
    }


    //classe para criar contas bancarias com metodo para exibir os dados;
    /*public void display(){
        System.out.println("*Dados bancarios *");
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(saldo);
        System.out.println();
    }*/

}
