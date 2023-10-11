import java.util.ArrayList;

public class GeradorCsv extends GeradorArquivo{
    private ArrayList<Produto> linhas;

    public GeradorCsv(){
        linhas = new ArrayList<Produto>();
    }
    
    public void gerarArquivo(ArrayList<Produto> produtos){
        System.out.println("gerar arquivo CSV");

        for (int i = 0; i < 10; i++){
            Produto produto = produtos.get(i);

            linhas.add(produto);
        }


    }
}
