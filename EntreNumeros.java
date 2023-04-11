import java.util.Scanner;

public class EntreNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int num = entrada.nextInt();

		if (100 >= num) {
			if (num <= 200) {
				System.out.println("Esta entre 100 e 200");
			}
		}

		else {
			System.out.println("Não esta entre 100 e 200");
		}

		entrada.close();

	}

}
