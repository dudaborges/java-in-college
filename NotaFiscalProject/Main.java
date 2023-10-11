import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GeradorProduto gerador = new GeradorProduto();
        CupomFiscal cupomFiscal = new CupomFiscal();
        Scanner scanner = new Scanner(System.in);
        int option;

        for (int i = 0; i < 10; i++){
            Produto produto = gerador.gerarProduto();
            cupomFiscal.adicionarProduto(produto);
        }


        do {
            System.out.print(
                "Escolha como você deseja imprimir o cupom fiscal:\nGerar CSV [1]\nGerar Tabulação [2]\n>> "
            );
            option = scanner.nextInt();
        } while (option != 1 && option != 2);

        GeradorArquivo geradorArquivo;

        if (option == 1){
            geradorArquivo = new GeradorCsv();

        } else{
            geradorArquivo = new GeradorTabulacao();
        }

        geradorArquivo.gerarArquivo(cupomFiscal.getProdutos());

    }
}
