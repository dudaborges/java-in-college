public class Main{
    public static void main(String[] args){
        Conta conta1 = new Conta();

        conta1.criarConta("Maria Eduarda", 132, 597150.26);
        conta1.depositar(5.0);
        conta1.sacar(10000.0);

        System.out.printf(conta1.toString());
    }
}