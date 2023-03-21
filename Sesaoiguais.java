import java.util.Scanner;

public class Sesaoiguais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int num = entrada.nextInt();

		System.out.println("Digite um segundo numero:");
		int num2 = entrada.nextInt();
		
		if (num == num2) {
			System.out.println("São iguais");
		}
			
		else if(num > num2){
			System.out.println("o numero maior é "+ num);
		}
		
		else{
			System.out.println("o numero maior é "+ num2);
		}
		
		entrada.close();
		
		
		
	}

}
