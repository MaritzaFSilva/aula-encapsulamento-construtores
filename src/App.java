import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // declaração
        Conta minhaConta;
        Conta outraConta;

        // instanciar
        minhaConta = new Conta("1234", "34567", "123456789", "Maritza Silva", 100.0);

        // inicializamos
        minhaConta.setAgencia("1234");
        minhaConta.setNumero("34567");
        minhaConta.setCpf("045.777.777-99");
        minhaConta.setTitular("Zé");
        minhaConta.setSaldo(100.0);

        outraConta = new Conta("0398", "12345-6");

        Pessoa objPessoa = new Pessoa("Maritza", "11111111111");
        objPessoa.adicionarConta(minhaConta);
        objPessoa.adicionarConta(outraConta);

        // Pego as contas desse objPessoa
        List<Conta> listaContas = objPessoa.getContas();

        // Removo as contas
        // objPessoa.removeConta(outraConta);

        // Verifico se minha outraconta ta na lista
        boolean outraContaEstaNaLista = listaContas.contains(outraConta);

        System.out.println("outraContaEstaNaLista: " + outraContaEstaNaLista);

        // ATIVIDADE DE AULA
        // pesquisar a conta por numero e retornar o indice;

        int index = listaContas.indexOf(outraConta);

        // remover por indice;
        listaContas.remove(index);

        // pesquisar conta por numero e retornar a conta;
        //12345-6
      
      
        for (Conta conta : listaContas) {
            if (conta.getNumero().equals("12345-6")) {
                System.out.println(conta.toString());
                break;
            }
        }
      
            

        // System.out.println("MinhaConta:\n" + minhaConta.toString());

        // minhaConta.sacar(10);

        // System.out.println(minhaConta);

        // minhaConta.depositar(50);

        // System.out.println(minhaConta.toString());

    }
}
