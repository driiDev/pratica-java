import java.io.IOException;
import java.util.Scanner;

public class ExtreBasico {
 
    public static void main(String[] args) throws IOException {
    Scanner tc = new Scanner(System.in);
    
    int A = tc.nextInt();
    int B = tc.nextInt();
    int soma = A + B;
    
    System.out.println("X = " + soma);
     
    tc.close();
    }

}