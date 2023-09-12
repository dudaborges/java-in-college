public class Conta{
    private String nomeTitular;
    private int numConta;
    private double saldoInicial;

    public double validarValor(double valor){
        valor = (valor < 0 ? 0 : valor);
        return valor;
    }

    public void criarConta(String nomeTitular, int numConta, double saldoInicial){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;

        saldoInicial = validarValor(saldoInicial);
        this.saldoInicial = saldoInicial;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public int getNumConta(){
        return numConta;
    }

    public double getSaldoAtual(){
        return saldoInicial;
    }

    public void depositar(double valorDepositado){
        valorDepositado = validarValor(valorDepositado);
        saldoInicial += valorDepositado;
    }

    public void sacar(double valorRetirado){
        valorRetirado = validarValor(valorRetirado);
        saldoInicial -= valorRetirado;
    }

    public String toString(){
        return String.format("Nome do titular: %s, Número da conta: %d, Saldo: R$ %f", getNomeTitular(), getNumConta(), getSaldoAtual());
    }
}