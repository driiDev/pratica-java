import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		double r = tc.nextDouble();
		double volume = (4.0/3)*3.14159*Math.pow(r, 3);
		
		System.out.printf("VOLUME = %.3f\n",volume);

	}

}
