import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int num = tc.nextInt();
		int qtd = tc.nextInt();
		double valor = tc.nextDouble();
		double salario = qtd*valor;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		tc.close();

	}

}
