package moraes.miguel.ruiz.victor;

public class Main {

    public static void main(String[] args) {

        //Cria uma referencia para o objeto conta
        Conta c1 = new Conta("Victor",5000.99);

        c1.depositar(500);
        c1.sacar(200);
        System.out.println("Conta 1:" + c1.toString());



    }
}
