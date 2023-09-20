public class Main{
    public static void main(String[] args){
        Onibus onibus1 = new Onibus("Mercedes", "Prefeitura Florianópolis", 104);

        System.out.print(onibus1);
        onibus1.acelerar();

        Carro carro1 = new Carro("Onix", "ano 2022", "preto", "1ds6", 4);
        //String marca, String modelo, String cor, String placa, int qtdePortas
        Carro carro2 = new Carro("Onix", "ano 2022", "preto", "1ds6", 4);


        System.out.print(carro1);
        carro1.acelerar();

        Moto moto1 = new Moto("Honda", "street","branco", "32bu");
        System.out.print(moto1);
        moto1.acelerar();   
        
             
    }
}