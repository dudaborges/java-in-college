public class Main{
    public static void main(String[] args){
        Carro carro1 = new Carro("onix", 2020, "preto");
        Carro carro2 = new Carro("ford", 2021, "branco");

        carro1.acelerar(10, 2);

        

        System.out.print(carro1);
        System.out.print(carro2);

    }
}