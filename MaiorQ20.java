import java.util.Scanner;

public class MaiorQ20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner (System.in);
		
		
	System.out.println("Digite um numero:");	
	 int num1 = entrada.nextInt();
	System.out.println("Digite um numero:");	
	int num2 = entrada.nextInt();
		
	int soma = num1 + num2;
	
	int valor = (soma >= 20) ? soma +10 : soma - 5;
	System.out.println("O resultado será: "+valor);
	
	entrada.close();
		
	}

}
