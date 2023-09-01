import java.util.Random;

public class Decrescente {
	public static void main(String[] args){
		int[] numeros = new int[10];
		Random gerador = new Random();
		numeros[0] = 1;
			
		for (int i = 0; i <= 10; ++i){
			//System.out.println(gerador.nextInt(10));
			numeros[i] = gerador.nextInt();
			System.out.println(numeros[i]);
			
		}

		
	}
}