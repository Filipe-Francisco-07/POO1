package Sequencial;
import java.util.Scanner;
public class Sequencial_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double pi = 3.14159265359;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Insira o raio do círculo: ");
	    float raio = input.nextFloat();
	    
	    System.out.println("A Área do círculo é: " + (raio*raio)*pi);
	    
	    input.close();
	    
		
	}

}
