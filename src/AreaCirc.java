import java.util.Scanner;

public class AreaCirc {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		double raio = tc.nextDouble();
		double n = 3.14159;
		double area = n*(raio*raio);
		
		System.out.printf("A=%.4f\n", area);
		
		
		tc.close();
	}

}
