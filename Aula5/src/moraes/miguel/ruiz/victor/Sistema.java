package moraes.miguel.ruiz.victor;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private  Conta conta;

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
                System.out.println("Obrigado por utilizar o sistema!");
                this.executarSistema = false;
                break;
            case 1:
                System.out.println("Saldo: R$" + this.conta.getSaldo());
                break;
            case 2:
                System.out.println("Informe o valor a ser depositado:");
                double valorParaDepositar = scanner.nextDouble();
                this.conta.depositar(valorParaDepositar);
                System.out.println("Operacao realizada com sucesso!");
                break;
            case 3:
                System.out.println("Operacao para sacar");
                double valorParaSacar = scanner.nextDouble();
                if(this.conta.sacar(valorParaSacar)){
                    System.out.println("Operacao realizada com sucesso!");
                }else {
                    System.out.println("Algo deu Errado!");
                }
                break;
            case 5:
                System.out.println("Nome do Titulo a pagar:");
                String nomeTitulo = scanner.next();
                double valorTitulo = scanner.nextDouble();
                System.out.println("Valor do juros por dia:");
                double valorJurosPorDia = scanner.nextDouble();
                System.out.println("Informe a data de vencimento (aaaa-mm-dd):");
                String dataVencimentoTitulo = scanner.next();
                Titulo titulo = new Titulo(valorTitulo,nomeTitulo,valorJurosPorDia,dataVencimentoTitulo);
                if(this.conta.sacar(titulo.getValorPagamento())){
                    System.out.println("Operacao realizada com sucesso");
                }else {
                    System.out.println("Nao foi possivel realizar a operacao");
                }
                break;
            default:
                System.out.println("Opcao ainda nao implementada!");
                break;



        }
    }

    public Sistema() {
        this.executarSistema = true;
        this.scanner = new Scanner(System.in); //Cria um scanner para o teclado(entrada padrao)
        this.conta = new Conta("Luigi",1235,1000);
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
