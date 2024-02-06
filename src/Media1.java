import java.util.Scanner;

public class Media1 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		double a = tc.nextDouble();
		double b = tc.nextDouble();
		double media = ((a*3.5)+(b*7.5))/11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		tc.close();
	}

}
