import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // declaração
        Conta minhaConta;
        Conta outraConta;
        

        // instanciar
        minhaConta = new Conta("1234", "34567", "123456789", "Maritza Silva", 100.0);
        

        // O que acontece, se eu fizer um print de minhaConta.getTitular() ??

        System.out.println(minhaConta.getTitular());

        // inicializamos
        minhaConta.setAgencia("1234");
        minhaConta.setNumero("34567");
        minhaConta.setCpf("045.777.777-99");
        minhaConta.setTitular("Zé");
        minhaConta.setSaldo(100.0);


        /**
         * EXEMPLO RÁPIDO DE CÓDIGO PARA DEMONSTRAR A IDEIA
         * QUE PRECISA MELHORAR
         */

        // for (int i = 0; i < vetorNumero.length; i++) {
        //     if(vetorNumero[i]){
        //         vetorNumero[i] = numero;
        //         return true;
        //     }         
        // }
        // return false;





        // outraConta.agencia = "4567";
        // outraConta.numero = "876543";
        // outraConta.cpf = "333.444.555-00";
        // outraConta.setTitular("Chico");
        // outraConta.setSaldo(50.0);

        System.out.println("MinhaConta:\n" + minhaConta.toString());

     

        minhaConta.sacar(10);

        System.out.println(minhaConta);

        minhaConta.depositar(50);

        System.out.println(minhaConta.toString());
      

    }
}
