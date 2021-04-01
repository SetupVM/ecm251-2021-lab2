package moraes.miguel.ruiz.victor;

public class Cliente {

    public Cliente(String nome){
        this.nome = nome;
    }

    private String nome;
    private String sobrenome;
    private String cpf;

    @Override //alt + insert
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
