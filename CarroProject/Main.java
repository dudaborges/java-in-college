public class Main{
    public static void main(String[] args){
        Carro carro1 = new Carro("onix", 2020, "preto");
        Carro carro2 = new Carro("ford", 2021, "branco");

        Tela tela1 = new Tela();
        double aceleracao = tela1.pedirAceleracao();
        int tempo = tela1.pedirTempo();

        carro1.acelerar(aceleracao, tempo);
        System.out.print(carro1);
    }
}