import java.util.Scanner;

public class IgualMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua um valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.println("Digite sua um segundo valor: ");
		int valor2 = entrada.nextInt();
		
		if(valor1 == valor2) {
			System.out.println("S�o iguais");
		}
		
		else if(valor1 > valor2) {
			System.out.println("O primeiro valor � maior");
		}
		
		else if(valor1 < valor2) {
			System.out.println("O segundo valor � maior");
		}
		
		else {
			System.out.println("S�o diferentes");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
