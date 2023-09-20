public class TransportePrivado extends Transporte{
    private String modelo;
    private String cor;
    private String placa;

    public TransportePrivado(String marca, String modelo, String cor, String placa){
        super(marca);
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public String getPlaca(){
        return this.placa;
    }

    @Override
    public String toString(){
        return String.format("Marca: %s\nModelo: %s\nCor: %s\nPlaca: %s", getMarca(), getModelo(), getCor(), getPlaca());
    }
}