import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		double a = tc.nextDouble();
		double b = tc.nextDouble();
		double c = tc.nextDouble();
		
		double areaTri = (a*c)/2;
		double areaCir = 3.14159 * c * c;
		double areaTrap = ((a+b)*c)/2;
		double areaQua = b*b;
		double areaRet = a*b;
		
		System.out.printf("TRIANGULO: %.3f\n",areaTri);
		System.out.printf("CIRCULO: %.3f\n",areaCir);
		System.out.printf("TRAPEZIO: %.3f\n",areaTrap);
		System.out.printf("QUADRADO: %.3f\n",areaQua);
		System.out.printf("RETANGULO: %.3f\n",areaRet);
		tc.close();
	}
}
