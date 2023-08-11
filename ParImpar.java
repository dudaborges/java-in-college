import java.util.Scanner; 
import java.util.Random;

public class ParImpar{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random gerador = new Random();

		int numUser;	
		int numComputador;	
		int imparPar;
		double resultSomar;

		System.out.println("Escolha 1 para impar e 2 para par: ");
		imparPar = scanner.nextInt();

		if (imparPar == 1){
			System.out.println("Você escolheu impar");
		} 
		if (imparPar == 2){
			System.out.println("Você escolheu par");
		}

		System.out.println("Escolha um número: ");
		numUser = scanner.nextInt();

		numComputador = gerador.nextInt(11);
		System.out.printf("O computador escolher o número %d \n", numComputador);

		resultSomar = (numUser + numComputador) / 2;
		
		if (resultSomar % 2 != 0){
			System.out.println("O resultado deu Impar");
		} else {
			System.out.println("O resultado deu Par");
		}
					
	}
}