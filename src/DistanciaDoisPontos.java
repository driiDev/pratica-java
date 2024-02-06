import java.util.Scanner;

public class DistanciaDoisPontos {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		double x1 = tc.nextDouble();
		double y1 = tc.nextDouble();
		double x2 = tc.nextDouble();
		double y2 = tc.nextDouble();
		
		double distancia = ((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		double raiz = Math.sqrt(distancia);
		
		System.out.printf("%.4f%n",raiz);

	}

}
