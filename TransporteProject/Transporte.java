public class Transporte{
    private String marca;

    public Transporte(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void acelerar(){
        System.out.print("\nAcelerando...");
    }
}