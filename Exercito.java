import java.util.Scanner;

public class Exercito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();

		if (idade == 18) {
			System.out.println("Voc� deve se alistar");
		}

		if (idade > 18) {
			System.out.println("Voc� � retardatario,tem que se alistar");
		}

		else if (idade < 18) {
			System.out.println("Voc� n�o vai alistar");
		}

		entrada.close();
		
	}

}
