package moraes.miguel.ruiz.victor;

public class Cliente {

    private String titular;
    private String cpf;

    public Cliente(String titular) {
        this.titular = titular;
    }

    @Override //Alt + insert
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
