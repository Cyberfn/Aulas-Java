import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a idade de Jo�o:");
		int idadeJoao = entrada.nextInt();

		System.out.println("Digite a idade de Jos�:");
		int idadeJose = entrada.nextInt();

		System.out.println("Digite a idade de Maria:");
		int idadeMaria = entrada.nextInt();

		if ((idadeJoao < idadeJose) && (idadeJoao < idadeMaria)){
				System.out.println("Jo�o � o casula");
		}

		else if ((idadeJose < idadeJoao) && (idadeJose < idadeMaria)) {
				System.out.println("Jos� � o casula");
		}

		else {
			System.out.println("Maria � a casula");
		}

		entrada.close();

	}

}
