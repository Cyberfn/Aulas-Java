
public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1, somaImpar = 0;
		
		while (x <= 100) {
			
			if((x % 3 == 0) && (x % 2 != 0)) {
				somaImpar = somaImpar + x;
			}
			x++;
			
		}
		System.out.println("A soma dos Imapres: "+somaImpar);
		
		
	}

}
