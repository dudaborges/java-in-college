import java.util.ArrayList;

public class CupomFiscal{
    private ArrayList<Produto> produtos;

    public CupomFiscal(){
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    
}