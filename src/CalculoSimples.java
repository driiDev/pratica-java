import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in); 
		
		int p1 = tc.nextInt();
		int np1 = tc.nextInt();
		double valor1 = tc.nextDouble();
		
		int p2 = tc.nextInt();
		int np2 = tc.nextInt();
		double valor2 = tc.nextDouble();
		
		double preco = (np1*valor1) + (np2*valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",preco);

		tc.close();
	}

}
