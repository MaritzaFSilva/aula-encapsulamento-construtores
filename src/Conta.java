public class Conta {

    // atributos=variáveis
    String agencia;
    String numero;
    String cpf;
    private String titular;
    private double saldo;


    // Método que pega o nome do titular
    public String getTitular() {
        return this.titular;
    }

    //Métodos Set
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }


    public Double getSaldo(){
        return this.saldo;
    }


    // métodos=função
    void sacar(double valor) {
        saldo = saldo - valor;
    }

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    public String toString() {
        String str;

        str = "6" +
                "\n\tAgencia:" + agencia +
                "\n\tNumero:" + numero +
                "\n\tTitular:" + titular +
                "\n\tCpf:" + cpf +
                "\n\tSaldo:" + saldo;

        return str;
    }

}