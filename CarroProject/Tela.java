import java.util.Scanner;

public class Tela{

    public double pedirAceleracao(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a aceleracao: ");
        return scanner.nextDouble();
    }

    public int pedirTempo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o tempo: ");
        return scanner.nextInt();
    }

}