import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		double num1 = entrada.nextDouble();

		System.out.println("Digite um segundo valor: ");
		double num2 = entrada.nextDouble();

		double soma = (num1 + num2);

		if (soma >= 20) {
			double somasesim = (soma + 5);

			System.out.println("A soma mais 5 foi " + somasesim);
		}

		else if (soma < 20) {
			double multsenao = (soma * 8);

			System.out.println("A soma vezes 8 foi " + multsenao);

		}

		entrada.close();

	}

}
