import java.util.Scanner;

public class ParOuImpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero:");
		double num = entrada.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("� Par");
		}
		
		else {System.out.println("� impa");
		}
		
		entrada.close();
		
	}

}
		