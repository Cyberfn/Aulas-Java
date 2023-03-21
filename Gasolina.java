import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o tipo do combustivel:");
		System.out.println("G - Gasolina");
		System.out.println("A - Alcool");
		String tipo = entrada.next();
		
		double precogas = 3.79;
		double precoalcool = 2.90;
		
		System.out.println("Informe a capacidade do tanque");
		
		double capacidade = entrada.nextDouble();
		
		if(tipo.equals("g") || tipo.equals("G")) {
			double tanquedegas = precogas * capacidade;
			System.out.println("O valor total para encehr o tanque é de "+ tanquedegas );			
		}
		
		else if (tipo.equals("a") || tipo.equals("A")) {
			double tanquedealcool = precoalcool * capacidade;
			System.out.println("O valor total para encehr o tanque é de "+ tanquedealcool);
		}
		else {
			System.out.println("Opção invalida");
		}
		
		entrada.close();
		
		
	}

}
