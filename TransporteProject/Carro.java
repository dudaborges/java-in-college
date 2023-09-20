public class Carro extends TransportePrivado{
    private int qtdePortas;

    public Carro(String marca, String modelo, String cor, String placa, int qtdePortas){
        super(marca, modelo, cor, placa);
        this.qtdePortas = qtdePortas;
    }

    public int getQtdePortas(){
        return this.qtdePortas;
    }

    @Override
    public boolean equals(Object o){
        return false;
    }

    @Override
    public void acelerar(){
        System.out.print("\nCarro acelerando...");
    }

    @Override
    public String toString(){
        return String.format("\n\nCARRO\n\nMarca: %s\nModelo: %s\nCor: %s\nPlaca: %s\nQuantidade portas: %d",
        getMarca(), getModelo(), getCor(), getPlaca(), getQtdePortas() 
        );
    }
}