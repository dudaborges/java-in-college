public class Produto{
    private int id;
    private int qtde;
    private double precoUni;
    private double precoTotal;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public int getQtde(){
        return this.qtde;
    }

    public void setPrecoUni(double precoUni){
        this.precoUni = precoUni;
    }

    public double getPrecoUni(){
        return precoUni;
    }

    public double getPrecoTotal(){
        return getPrecoUni() + getQtde();
    }

    @Override
    public String toString(){
        return String.format(
            "Id: %d\nQuantidade: %d\nPreço unidade: %f\nPreço total: %f", 
            getId(), getQtde(), getPrecoUni(), getPrecoTotal()
        );
    }
}