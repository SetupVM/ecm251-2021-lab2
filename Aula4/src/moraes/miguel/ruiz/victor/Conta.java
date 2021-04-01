package moraes.miguel.ruiz.victor;

public class Conta {

    //Atributos da classe
    private Cliente cliente;
    private int numero;
    private double saldo;

    //Metodos da classe

    //Constrututor da classe
    public Conta(String nomeCliente, double saldoInicial){
        this.saldo = saldoInicial;
        this.cliente = new Cliente();
        this.numero = 1234;



    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }



    public  double getSaldo(){
        return this.saldo;
    }

    public void visualizarSaldo(){

        System.out.println("Saldo:R$" + saldo);
    }

    public boolean sacar(double valor){

        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor){

        this.saldo = this.saldo + valor;
    }
    public boolean transferirDinheiro(Conta destino, double valor){

        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
