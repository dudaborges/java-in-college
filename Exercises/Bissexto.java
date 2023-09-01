import java.util.Scanner;
public class Bissexto{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int ano;
		do{
			System.out.print("Insira um ano: ");
			ano = scanner.nextInt();
			if (ano > 0) {
				if (ano % 4 == 0 && ano % 100 !=0){
					System.out.printf("O ano %d é bissexto", ano);
				} else {
					System.out.printf("O ano %d não é bissexto", ano);
				}
			}else{
				System.out.println("O ano precisa ser válido");
			}
		} while (ano < 0);
			
	}
}