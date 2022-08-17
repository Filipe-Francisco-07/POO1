package Sequencial;
import java.util.Scanner;
public class Sequencial_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Digite a medida de um dos lados do quadrado: ");
	int lado = input.nextInt();
	
	System.out.println("A Área do quadrado é: " + lado*lado );
	
	input.close();
		
	}

}
