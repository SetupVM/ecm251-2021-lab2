package moraes.miguel.ruiz.victor;

public class Basico2 {
    //Estruturas de Decisao
    public static void main(String[] args) {
        int ano = 2021;

        //Estrutura de decisao simples
//        if (ano % 2 == 0){
//            System.out.println("Ano Par!");
//        }
//        if (ano % 2 != 0){
//            System.out.println("Ano impar!");
//        }
        //Estrutura de decisao composta
        if (ano % 2 == 0){
            System.out.println("Ano Par!");
        }else{
            System.out.println("Ano impar!");
        }

        switch (ano){
            case 2020:
                System.out.println("Vixi");
                break;
            case 1996:
                System.out.println("Oi");
                break;
            default:
                System.out.println("Tchau");
                break;
        }

    }
}
