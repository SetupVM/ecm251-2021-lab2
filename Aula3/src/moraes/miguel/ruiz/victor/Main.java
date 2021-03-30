package moraes.miguel.ruiz.victor;

public class Main {

    public static void main(String[] args) {

        //Cria uma referencia para o objeto conta
        Conta c1;
        //Instancia um objeto conta
        c1 = new Conta();
        //Os dois Juntos
        Conta c2 = new Conta();
        c1.cliente = new Cliente();
        c2.cliente = new Cliente();

        //Manipular os atributos
        c1.cliente.titular = "Victor";
        c1.saldo = 199.99;
        c1.numero = 1234;

        //Invocar o metodo visualizar saldo
        c1.visualizarSaldo();
        c1.depositar(200);
        c1.visualizarSaldo();
        c1.sacar(100);
        c1.visualizarSaldo();

        c2.cliente.titular = "Joao";
        c2.saldo = 400;
        c2.visualizarSaldo();

        if(c2.sacar(200)){
            System.out.println("Contando as Cedulas");
        }else{
            System.out.println("Saldo indisponivel");
        }
        c2.visualizarSaldo();

        if(c1.transferirDinheiro(c2,500)){
            System.out.println("Transferencia realizada com sucesso.");
        }else{
            System.out.println("Falha ao transferir.");
        }
        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("C1:" + c1.toString());
        System.out.println("C2:" + c2.toString());

    }
}
