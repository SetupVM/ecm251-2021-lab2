package moraes.miguel.ruiz.victor;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;

    public void executar(){

        int opcao;
        while (executarSistema){
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado por utilizar p sistema!");
                this.executarSistema = false;
                break;
            default:
                System.out.println("Opcao ainda nao implementada!");
                break;
            case 1:
                

        }
    }

    public Sistema() {
        this.executarSistema = true;
        this.scanner = new Scanner(System.in); //Cria um scanner para o teclado(entrada padrao)

    }

    private void exibirMenu() {
        System.out.println("Bem Vindo!");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Transferir dinheiro");
        System.out.println("5 - Pagar conta (titulo)");
        System.out.println("0 - Encerrar Sistema");



    }
}
