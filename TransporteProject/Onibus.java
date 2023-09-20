public class Onibus extends Transporte{
    private String empresa;
    private int numAssentos;

    public Onibus(String marca, String empresa, int numAssentos){
        super(marca);
        this.empresa = empresa;
        this.numAssentos = numAssentos;
    }

    public String getEmpresa(){
        return this.empresa;
    }

    public int getNumAssentos(){
        return this.numAssentos;
    }

    @Override
    public void acelerar(){
        System.out.print("\nÔnibus acelerando...");
    }

    @Override
    public String toString(){
        return String.format("\n\nÔNIBUS\n\nMarca: %s\nEmpresa: %s\nNúmero de assentos: %s", 
        getMarca(), getEmpresa(), getNumAssentos());
    }
}