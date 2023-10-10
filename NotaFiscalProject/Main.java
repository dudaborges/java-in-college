public class Main {
    public static void main(String[] args) {
        GeradorProdutos gerador = new GeradorProdutos();
        gerador.gerarProduto();
        System.out.print(gerador.getProdutos());
        //gera aleatóriamente itens
        //pedir pro usuário selecionar de que forma ele quer armazenar os itens
        //chama ou a tabulacao ou o csv
    }
}
