
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String cpf;
    private List<Conta> contas;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public boolean adicionarConta(Conta conta) {
        this.contas.add(conta);
        // Retornando por padrão o true para fazer alterações no futuro podendo retornar
        // erros.
        return true;
    }

    public boolean removeConta(Conta conta) {
        this.contas.remove(conta);

        // Retornando por padrão o true para fazer alterações no futuro podendo retornar
        // erros.
        return true;
    }

    public boolean verificarSeContem(Conta conta){
        return this.contas.contains(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        String texto = "Pessoa [nome=" + nome + ", cpf=" + cpf + ", contas=";

        for (Conta conta : contas) {
            texto += "\n ----";
            texto += conta.toString();

        }

        texto += "]";

        return texto;
    }

}
