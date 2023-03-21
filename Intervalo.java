import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero:");
		int num = entrada.nextInt();
		
		if(100 >= num) {
			System.out.println("Esta dentro");
			}
		else if (num <= 200) {
			System.out.println("Esta dentro");
		}
		else {
			System.out.println("Esta fora");
		}
		
		
		
		
		
		
	}

}
