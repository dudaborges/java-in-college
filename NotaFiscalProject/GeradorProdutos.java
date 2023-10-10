import java.util.ArrayList;
import java.util.Random;

public class GeradorProdutos {
    ArrayList<Produto> produtos = new ArrayList<>();
    Random gerador = new Random();

    public void gerarProduto(){
        for (int x = 0; x < 10; x++){
            Produto produto = new Produto();
            produto.setId(gerador.nextInt(11));
            produto.setQtde(gerador.nextInt(10));
            produto.setPrecoUni(gerador.nextDouble(100));

            produtos.add(produto);
        }

        // System.out.println(produtos);
    }

    public ArrayList<Produto> getProdutos(){
        int element = produtos.get(0);
    }


}
