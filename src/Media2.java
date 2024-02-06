import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		double a = tc.nextDouble();
		double b = tc.nextDouble();
		double c = tc.nextDouble();
		double media = ((a*2)+(b*3)+(c*5))/10;
		
		System.out.printf("MEDIA = %.1f\n" , media);
		tc.close();

	}

}
