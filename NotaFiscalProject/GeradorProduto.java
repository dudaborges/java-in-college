import java.util.Random;

public class GeradorProduto {
    Random gerador;

    public GeradorProduto(){
        gerador = new Random();
    }

    public Produto gerarProduto(){
        Produto produto = new Produto();
        produto.setId(gerador.nextInt(11));
        produto.setQtde(gerador.nextInt(10));
        produto.setPrecoUni(gerador.nextDouble(100));

        return produto;
    }

}
