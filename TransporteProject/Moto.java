public class Moto extends TransportePrivado{
    public Moto(String marca, String modelo, String cor, String placa){
        super(marca, modelo,cor,placa);
    }

    @Override
    public void acelerar(){
        System.out.print("\nMoto acelerando...");
    }

    public String toString(){
        return String.format("\n\nMOTO\n\nMarca: %s\nModelo: %s\nCor: %s\nPlaca: %s",
        getMarca(), getModelo(), getCor(), getPlaca());
    }
}