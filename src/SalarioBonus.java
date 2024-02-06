import java.util.Scanner;

public class SalarioBonus {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		String nome = tc.next();
		double salarioF = tc.nextDouble();
		double montante = tc.nextDouble();
		double porc = 15;
		double comissao = (porc*montante)/100;
		double salario_total = salarioF + comissao;
		
		System.out.printf("TOTAL = R$ %.2f\n",salario_total);
		

	}

}
