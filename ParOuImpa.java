import java.util.Scanner;

public class ParOuImpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero:");
		double num = entrada.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("É Par");
		}
		
		else {System.out.println("É impa");
		}
		
		entrada.close();
		
	}

}
		