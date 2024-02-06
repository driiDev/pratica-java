import java.io.IOException;
import java.util.Scanner;

public class Maior {
 
    public static void main(String[] args) throws IOException {
    	Scanner tc = new Scanner(System.in);
    	
    	int a = tc.nextInt();
    	int b = tc.nextInt();
     	int c = tc.nextInt();
    	
    	if(a>b && a>c) {
    		System.out.println(a + " eh o maior");
    	}
    	else if(b>a && b>c) {
    		System.out.println(b + " eh o maior");
    	}
    	else if(c>a && c>b) {
    		System.out.println(c + " eh o maior");
    	}
    	else {
    		System.out.println("Todos são iguais");
    	}
 
 
    }
 
}