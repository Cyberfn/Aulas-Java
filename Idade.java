import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();

		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		}

		else {
			System.out.println("Você é menor de idade");
		}

		entrada.close();

	}

}
