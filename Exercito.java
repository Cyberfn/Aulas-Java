import java.util.Scanner;

public class Exercito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();

		if (idade == 18) {
			System.out.println("Você deve se alistar");
		}

		if (idade > 18) {
			System.out.println("Você é retardatario,tem que se alistar");
		}

		else if (idade < 18) {
			System.out.println("Você não vai alistar");
		}

		entrada.close();
		
	}

}
