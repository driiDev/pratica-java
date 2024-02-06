import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int a = tc.nextInt();
		int b = tc.nextInt();
		int c = tc.nextInt();
		int d = tc.nextInt();
		int diferenca = (a*b-c*d);
		
		System.out.println("DIFERENCA = " + diferenca);
		tc.close();

	}

}
