import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a idade de João:");
		int idadeJoao = entrada.nextInt();

		System.out.println("Digite a idade de José:");
		int idadeJose = entrada.nextInt();

		System.out.println("Digite a idade de Maria:");
		int idadeMaria = entrada.nextInt();

		if ((idadeJoao < idadeJose) && (idadeJoao < idadeMaria)){
				System.out.println("João é o casula");
		}

		else if ((idadeJose < idadeJoao) && (idadeJose < idadeMaria)) {
				System.out.println("José é o casula");
		}

		else {
			System.out.println("Maria é a casula");
		}

		entrada.close();

	}

}
