import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha o sexo desejado:");
		System.out.println("M - Masculino");
		System.out.println("F - Feminino");
		String sexo = sc.next().toUpperCase();

		switch (sexo) {
		case "M":
			System.out.println("Masculino");
			break;
		case "F":
			System.out.println("Feminino");
		default: {
			System.out.println("Sexo invalido");
		}

			sc.close();

		}

	}

}
