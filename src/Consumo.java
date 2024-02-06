import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int x = tc.nextInt();
		double y = tc.nextDouble();
		
		double consumo = x/y;
		
		System.out.printf("%.3f km/l%n",consumo);

	}

}
