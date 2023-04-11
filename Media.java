import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual seu nome?");
		String nome = entrada.nextLine();

		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println(nome + " você está aprovado");
		}

		else if (media < 7) {
			System.out.println(nome + " você está reprovado");
		}
		entrada.close();

	}

}
