package moraes.miguel.ruiz.victor;

public class Cliente {

    String titular;
    String cpf;

    @Override //Alt + insert
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
